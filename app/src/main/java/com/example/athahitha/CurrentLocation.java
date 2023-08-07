package com.example.athahitha;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.athahitha.databinding.ActivityCurrentLocationBinding;

import java.util.Arrays;
import java.util.List;

public class CurrentLocation extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityCurrentLocationBinding binding;
    Toolbar toolbar;
    ImageButton backbutton;
    TextView done;

    FusedLocationProviderClient fusedLocationProviderClient;
    LocationCallback locationCallback;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //address
        locationCallback = new LocationCallback() {
            @Override
            public void onLocationResult(@NonNull LocationResult locationResult) {
                Location location = locationResult.getLastLocation();
            }
        };



        binding = ActivityCurrentLocationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if(isLocationPermissionGranted()){
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
        }else{
            requestLocationPermission();
        }
    }

    private void setSupportActionBar(Toolbar toolbar) {

    }

    private static final int LOCATION_PERMISSION_CODE = 101;
    private void requestLocationPermission() {
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, LOCATION_PERMISSION_CODE);
    }

    private boolean isLocationPermissionGranted() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        this.navigateToLocation(7.590456728921197, 80.92248614538104, "Sri Lanka");
        this.getGeoCoderSearch("Sri Lanka");

        if(ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)==PackageManager.PERMISSION_GRANTED){
            mMap.setMyLocationEnabled(true);
        }
    }

    public void onClickSearchLocation(View view){
        EditText inputText = findViewById(R.id.editTextlocationsearch);
        this.getGeoCoderSearch(inputText.getText().toString());
    }

    private void getGeoCoderSearch(String texttosearch) {
        List<Address> getCodeResultList = Arrays.asList();

        try{
            getCodeResultList = new Geocoder(this).getFromLocationName(texttosearch, 1);
        }catch(Exception e){
            e.printStackTrace();
        }

        if (getCodeResultList.size() > 0){
            double latitude = getCodeResultList.get(0).getLatitude();
            double longitude = getCodeResultList.get(0).getLongitude();
            String countryName = getCodeResultList.get(0).getCountryName();

            Log.i("GOOGLE_MAP_API_TEST", "getGeoCorderSearch: "+String.valueOf(latitude)+","+String.valueOf(longitude)+","+countryName);
            this.navigateToLocation(latitude, longitude, "texttosearch");
        }
    }

    private void navigateToLocation(double latitude, double longitude, String title) {
        LatLng providedLocation = new LatLng(latitude, longitude);
        mMap.addMarker(new MarkerOptions().position(providedLocation).title(title));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(providedLocation, 18.0f));
        mMap.getUiSettings().setZoomControlsEnabled(true);
    }
}