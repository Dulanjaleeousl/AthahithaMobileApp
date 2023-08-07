package com.example.athahitha;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RequestOrganizations extends AppCompatActivity {

    Button submitOrg;
    EditText OrganizationName,AboutOrganization,Requestcategories,description;
    DatabaseReference reference;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.request_organizations);

        getSupportActionBar().setTitle("Organizations");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.lavender)));
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_arrow_back_24);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        OrganizationName = findViewById(R.id.organizationname);
        AboutOrganization = findViewById(R.id.about);
        Requestcategories = findViewById(R.id.category);
        description = findViewById(R.id.description);

        submitOrg = findViewById(R.id.submitOrg);
        reference = FirebaseDatabase.getInstance().getReference().child("Organizational Requests");
        submitOrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showSuccessDialog();
                insertRequestData();
            }
        });

    }
    private void showSuccessDialog(){
        ConstraintLayout successConstraintLayout = findViewById(R.id.successConstraintLayout);
        View view = LayoutInflater.from(RequestOrganizations.this).inflate(R.layout.success_dialog, successConstraintLayout);
        Button successhome = view.findViewById(R.id.succeshome);

        AlertDialog.Builder builder = new AlertDialog.Builder(RequestOrganizations.this);
        builder.setView(view);
        final AlertDialog alertDialog = builder.create();

        successhome.findViewById(R.id.succeshome).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
                Toast.makeText(RequestOrganizations.this, "Done", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(RequestOrganizations.this, Home.class);
                startActivity(intent);
            }
        });

        if (alertDialog.getWindow() != null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialog.show();
    }

    private void insertRequestData(){
        String dataOrganizationName = OrganizationName.getText().toString();
        String dataAboutOrganization = AboutOrganization.getText().toString();
        String dataRequestCatogaries = Requestcategories.getText().toString();
        String dataDescription = description.getText().toString();

        DataClassOrganizations dataClassOrganizations = new DataClassOrganizations(dataOrganizationName,dataAboutOrganization,dataRequestCatogaries,dataDescription);
        String id = reference.push().getKey();

        assert id != null;
        reference.child(id).setValue(dataClassOrganizations);
    }
}

