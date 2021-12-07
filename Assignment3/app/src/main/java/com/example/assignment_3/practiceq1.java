package com.example.assignment_3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class practiceq1 extends AppCompatActivity {

    Toolbar mytoolbar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practiceq1);

        mytoolbar2 = findViewById(R.id.toolbar3);
        setSupportActionBar(mytoolbar2);

        ActionBar ab=getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);


    }


}