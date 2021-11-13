package com.example.assignment_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class practice extends AppCompatActivity {
    Button practiceq1,practiceq2,practiceq3,practiceq4,practiceq5,practiceq6,practiceq7,practiceq8,backbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        practiceq1=findViewById(R.id.button9);
        practiceq2=findViewById(R.id.button10);
        practiceq3=findViewById(R.id.button11);
        practiceq4=findViewById(R.id.button12);
        practiceq5=findViewById(R.id.button13);
        practiceq6=findViewById(R.id.button14);
        practiceq7=findViewById(R.id.button15);
        practiceq8=findViewById(R.id.button16);
        backbtn=findViewById(R.id.button17);

        practiceq1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoq1();
            }
        });
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goback();
            }
        });
    }

    private void gotoq1() {
        Intent intent=new Intent(this, practiceq1.class);
        startActivity(intent);
    }

    private void goback() {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}