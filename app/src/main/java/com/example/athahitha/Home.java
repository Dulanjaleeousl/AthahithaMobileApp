package com.example.athahitha;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    //variables
    ImageButton imageButton;
    TextView textView;
    private ImageSlider imageSlider;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle drawerToggle;
    FirebaseAuth auth;
    FirebaseUser user;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        //Tool Bar
        getSupportActionBar().setTitle("Athahitha");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.lavender)));
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_menu_24);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //image slider

        imageSlider = findViewById(R.id.imageslider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.slideshow4, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slideshow5, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slideshow3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slideshow2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slideshow1, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        //onclck navigations

        imageButton = findViewById(R.id.request);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, RequestOptions.class);
                startActivity(intent);
            }
        });

        imageButton = findViewById(R.id.donate);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Donate.class);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.seemore);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Donate.class);
                startActivity(intent);
            }
        });

        //side menu
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        navigationView.bringToFront();
        drawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.nav_profile:
                    {
                        Intent intent = new Intent(Home.this, MyProfile.class);
                        startActivity(intent);
                        break;
                    }
                    case R.id.nav_donations:
                    {
                        Intent intent = new Intent(Home.this, MyDonations.class);
                        startActivity(intent);
                        break;
                    }
                    case R.id.nav_requests:
                    {
                        Intent intent = new Intent(Home.this, MyRequests.class);
                        startActivity(intent);
                        break;
                    }
                    case R.id.nav_settings:
                    {
                        Intent intent = new Intent(Home.this,Setting.class);
                        startActivity(intent);
                        break;
                    }
                    case R.id.nav_logout:
                    {
                        auth = FirebaseAuth.getInstance();
                        user = auth.getCurrentUser();
                        if (user == null){
                            Intent intent = new Intent(getApplicationContext(), Login.class);
                            startActivity(intent);
                            finish();
                        }else {

                        }
                        FirebaseAuth.getInstance().signOut();
                        Intent intent = new Intent(getApplicationContext(), Login.class);
                        startActivity(intent);
                        finish();
                        break;
                    }
                }
                return false;
            }
        });


    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(drawerToggle.onOptionsItemSelected(item))
            return super.onOptionsItemSelected(item);
        {
            return true;
        }
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }

    }
}