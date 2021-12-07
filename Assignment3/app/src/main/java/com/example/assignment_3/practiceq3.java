package com.example.assignment_3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class practiceq3 extends AppCompatActivity {

        Toolbar mytoolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practiceq3);

        mytoolbar = findViewById(R.id.toolbar5);
        setSupportActionBar(mytoolbar);

        ActionBar ab=getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);


    }


}