package com.example.athahitha;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.dhaval2404.imagepicker.ImagePicker;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;

public class RequestGramaniladari extends AppCompatActivity {

    Button button;
    Button location;
    Button submit;
    TextView captureText,captureText1,captureText2,captureText3,captureText4,captureText5,captureText6,captureText7,captureText8,captureText9;
    Uri uri,uri1,uri2,uri3,uri4,uri5,uri6,uri7,uri8,uri9;
    EditText gramaNiladariName, GNDS, gramaNiladariDivision, ServiceNumber, GNPhoto,name,age,address,contactnumber,gnd,ds,bankname,branch,accHolder,accNumber,category,description;
    private ImageView captureImage,captureImage1,captureImage2,captureImage3,captureImage4,captureImage5,captureImage6,captureImage7,captureImage8,captureImage9;
    Button birthday;
    private DatePickerDialog datePickerDialog;
    DatabaseReference reference;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.request_gramaniladari);

        getSupportActionBar().setTitle("Grama Niladari");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.lavender)));
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_arrow_back_24);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        gramaNiladariName = findViewById(R.id.gramaNiladariname);
        GNDS = findViewById(R.id.GNDS);
        gramaNiladariDivision = findViewById(R.id.GNdivision);
        ServiceNumber = findViewById(R.id.servicenumber);
        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        address = findViewById(R.id.address);
        contactnumber = findViewById(R.id.contactnumber);
        gnd = findViewById(R.id.GND);
        ds = findViewById(R.id.DS);
        bankname = findViewById(R.id.bankname);
        branch = findViewById(R.id.branchname);
        accNumber = findViewById(R.id.accountnumber);
        accHolder = findViewById(R.id.accountholder);
        category = findViewById(R.id.category);
        description = findViewById(R.id.description);

        // Calender dialog
        initDatePicker();
        birthday = findViewById(R.id.datePickerButton);
        birthday.setText(getTodaysDate());

        //submission
        submit = findViewById(R.id.submit);
        reference = FirebaseDatabase.getInstance().getReference().child("User Requests through Grama Niladari");
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertRequestData();
                showSuccessDialog();

            }
        });

        //location
        location = findViewById(R.id.locction);
        location.setOnClickListener(view -> {
            Intent intent = new Intent(RequestGramaniladari.this, CurrentLocation.class);
            startActivity(intent);

        });


        //add photo
        captureText = findViewById(R.id.imagebrowse11);
        captureImage = findViewById(R.id.image_picker11);

        captureImage.setOnClickListener(v -> ImagePicker.Companion.with(RequestGramaniladari.this)
                .crop()
                .maxResultSize(1080,1080)
                .start(100));

        captureText1 = findViewById(R.id.imagebrowse1);
        captureImage1 = findViewById(R.id.image_picker1);

        captureImage1.setOnClickListener(v -> ImagePicker.Companion.with(RequestGramaniladari.this)
                .crop()
                .maxResultSize(1080,1080)
                .start(101));

        captureText2 = findViewById(R.id.imagebrowse2);
        captureImage2 = findViewById(R.id.image_picker2);

        captureImage2.setOnClickListener(v -> ImagePicker.Companion.with(RequestGramaniladari.this)
                .crop()
                .maxResultSize(1080,1080)
                .start(102));

        captureText3 = findViewById(R.id.imagebrowse3);
        captureImage3 = findViewById(R.id.image_picker3);

        captureImage3.setOnClickListener(v -> ImagePicker.Companion.with(RequestGramaniladari.this)
                .crop()
                .maxResultSize(1080,1080)
                .start(103));

        captureText4 = findViewById(R.id.imagebrowse5);
        captureImage4 = findViewById(R.id.image_picker4);

        captureImage4.setOnClickListener(v -> ImagePicker.Companion.with(RequestGramaniladari.this)
                .crop()
                .maxResultSize(1080,1080)
                .start(104));

        captureText5 = findViewById(R.id.imagebrowse6);
        captureImage5 = findViewById(R.id.image_picker5);

        captureImage5.setOnClickListener(v -> ImagePicker.Companion.with(RequestGramaniladari.this)
                .crop()
                .maxResultSize(1080,1080)
                .start(105));

        captureText6 = findViewById(R.id.imagebrowse7);
        captureImage6 = findViewById(R.id.image_picker6);

        captureImage6.setOnClickListener(v -> ImagePicker.Companion.with(RequestGramaniladari.this)
                .crop()
                .maxResultSize(1080,1080)
                .start(106));

        captureText7 = findViewById(R.id.imagebrowse8);
        captureImage7 = findViewById(R.id.image_picker7);

        captureImage7.setOnClickListener(v -> ImagePicker.Companion.with(RequestGramaniladari.this)
                .crop()
                .maxResultSize(1080,1080)
                .start(107));

        captureText8 = findViewById(R.id.imagebrowse9);
        captureImage8 = findViewById(R.id.image_picker8);

        captureImage8.setOnClickListener(v -> ImagePicker.Companion.with(RequestGramaniladari.this)
                .crop()
                .maxResultSize(1080,1080)
                .start(108));

        captureText9 = findViewById(R.id.imagebrowse10);
        captureImage9 = findViewById(R.id.image_picker9);

        captureImage9.setOnClickListener(v -> ImagePicker.Companion.with(RequestGramaniladari.this)
                .crop()
                .maxResultSize(1080,1080)
                .start(109));


    }

    //calender
    private String getTodaysDate()
    {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        month = month + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        return makeDateString(day, month, year);
    }
    private void initDatePicker()
    {
        DatePickerDialog.OnDateSetListener dateSetListener = (datePicker, year, month, day) -> {
            month = month + 1;
            String date = makeDateString(day, month, year);
            birthday.setText(date);
        };

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);



        datePickerDialog = new DatePickerDialog(this, dateSetListener, year, month, day);

    }

    private String makeDateString(int day, int month, int year)
    {
        return getMonthFormat(month) + " " + day + " " + year;
    }

    private String getMonthFormat(int month)
    {
        if(month == 1)
            return "JAN";
        if(month == 2)
            return "FEB";
        if(month == 3)
            return "MAR";
        if(month == 4)
            return "APR";
        if(month == 5)
            return "MAY";
        if(month == 6)
            return "JUN";
        if(month == 7)
            return "JUL";
        if(month == 8)
            return "AUG";
        if(month == 9)
            return "SEP";
        if(month == 10)
            return "OCT";
        if(month == 11)
            return "NOV";
        if(month == 12)
            return "DEC";

        //default should never happen
        return "JAN";
    }

    public void openDatePicker(View view)
    {
        datePickerDialog.show();
    }


    //add photo
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && resultCode == Activity.RESULT_OK) {
            assert data != null;
            uri = data.getData();
            captureImage.setImageURI(uri);
        }
        else if (requestCode == 101 && resultCode == Activity.RESULT_OK) {
            assert data != null;
            uri1 = data.getData();
            captureImage1.setImageURI(uri1);
        }
        else if (requestCode == 102 && resultCode == Activity.RESULT_OK) {
            assert data != null;
            uri2 = data.getData();
            captureImage2.setImageURI(uri2);
        }
        else if (requestCode == 103 && resultCode == Activity.RESULT_OK) {
            assert data != null;
            uri3 = data.getData();
            captureImage3.setImageURI(uri3);
        }
        else if (requestCode == 104 && resultCode == Activity.RESULT_OK) {
            assert data != null;
            uri4 = data.getData();
            captureImage4.setImageURI(uri4);
        }
        else if (requestCode == 105 && resultCode == Activity.RESULT_OK) {
            assert data != null;
            uri5 = data.getData();
            captureImage5.setImageURI(uri5);
        }
        else if (requestCode == 106 && resultCode == Activity.RESULT_OK) {
            assert data != null;
            uri6 = data.getData();
            captureImage6.setImageURI(uri6);
        }
        else if (requestCode == 107 && resultCode == Activity.RESULT_OK) {
            assert data != null;
            uri7 = data.getData();
            captureImage7.setImageURI(uri7);
        }
        else if (requestCode == 108 && resultCode == Activity.RESULT_OK) {
            assert data != null;
            uri8 = data.getData();
            captureImage8.setImageURI(uri8);
        }
        else if (requestCode == 109 && resultCode == Activity.RESULT_OK) {
            assert data != null;
            uri9 = data.getData();
            captureImage9.setImageURI(uri9);
        }
        else
            Toast.makeText(getApplicationContext(), "No image selected", Toast.LENGTH_SHORT).show();
    }

    private void showSuccessDialog(){
        ConstraintLayout successConstraintLayout = findViewById(R.id.successConstraintLayout);
        View view = LayoutInflater.from(RequestGramaniladari.this).inflate(R.layout.success_dialog, successConstraintLayout);
        Button successhome = view.findViewById(R.id.succeshome);

        AlertDialog.Builder builder = new AlertDialog.Builder(RequestGramaniladari.this);
        builder.setView(view);
        final AlertDialog alertDialog = builder.create();

        successhome.findViewById(R.id.succeshome).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
                Toast.makeText(RequestGramaniladari.this, "Done", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(RequestGramaniladari.this, Home.class);
                startActivity(intent);
            }
        });

        if (alertDialog.getWindow() != null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialog.show();
    }

    private void insertRequestData(){
        String dataGramaNiladariName = gramaNiladariName.getText().toString();
        String dataGNDS = GNDS.getText().toString();
        String dataGramaNiladariDivision = gramaNiladariDivision.getText().toString();
        String dataServiceNumber = ServiceNumber.getText().toString();
        String dataName = name.getText().toString();
        String dataAge = age.getText().toString();
        String dataAddress = address.getText().toString();
        String dataBirthday = birthday.getText().toString();
        String dataContactNumber = contactnumber.getText().toString();
        String dataGND = gnd.getText().toString();
        String dataDS = ds.getText().toString();
        String dataBankName = bankname.getText().toString();
        String dataBranch = branch.getText().toString();
        String dataAccountNumber = accNumber.getText().toString();
        String dataAccountHolder = accHolder.getText().toString();
        String dataCategory = category.getText().toString();
        String dataDescription = description.getText().toString();

        DataClassNew dataClassnew = new DataClassNew(dataGramaNiladariName, dataGNDS, dataGramaNiladariDivision, dataServiceNumber,dataName,dataAge,dataAddress,dataBirthday,dataContactNumber,dataGND,dataDS,dataBankName,dataBranch,dataAccountNumber,dataAccountHolder,dataCategory,dataDescription);
        String id = reference.push().getKey();

        assert id != null;
        reference.child(id).setValue(dataClassnew);
    }

}

