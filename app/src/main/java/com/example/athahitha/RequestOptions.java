package com.example.athahitha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RequestOptions extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.requestoptions);

        getSupportActionBar().setTitle("Request");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.lavender)));
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_arrow_back_24);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RequestOptions.this, RequestPersonal.class);
                startActivity(intent);
            }
        });
        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RequestOptions.this, RequestGramaniladari.class);
                startActivity(intent);
            }
        });
        button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RequestOptions.this, RequestOrganizations.class);
                startActivity(intent);
            }
        });
    }
}