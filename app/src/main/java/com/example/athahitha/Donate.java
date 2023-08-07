package com.example.athahitha;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class Donate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donate);

        getSupportActionBar().setTitle("Donate");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.lavender)));
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_arrow_back_24);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}