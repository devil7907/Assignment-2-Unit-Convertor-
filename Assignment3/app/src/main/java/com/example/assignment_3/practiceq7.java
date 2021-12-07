package com.example.assignment_3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class practiceq7 extends AppCompatActivity {
    Toolbar mytoolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practiceq7);

        mytoolbar = findViewById(R.id.toolbar9);
        setSupportActionBar(mytoolbar);

        ActionBar ab=getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);


    }


}