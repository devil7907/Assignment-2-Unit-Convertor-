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
        practiceq2=findViewById(R.id.button11);
        practiceq3=findViewById(R.id.button10);
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

        practiceq2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoq2();
            }
        });
        practiceq3.setOnClickListener(new View.OnClickListener(){
        @Override
                public void onClick(View v)
        {
                gotoq3();
        }
        });
        practiceq4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoq4();
            }
        });
        practiceq5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoq5();
            }
        });
        practiceq6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoq6();
            }
        });
        practiceq7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoq7();
            }
        });
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goback();
            }
        });
    }

    private void gotoq7() {
        Intent intent=new Intent(this,practiceq7.class);
        startActivity(intent);
    }

    private void gotoq6() {
        Intent intent=new Intent(this, practiceq6.class);
        startActivity(intent);
    }

    private void gotoq5() {
        Intent intent=new Intent(this,practiceq5.class);
        startActivity(intent);
    }

    private void gotoq4() {
        Intent intent=new Intent(this,practiceq4.class);
        startActivity(intent);
    }

    private void gotoq3() {
        Intent intent=new Intent(this, practiceq3.class);
        startActivity(intent);
    }

    private void gotoq2() {
        Intent intent=new Intent(this,practiceq2.class);
        startActivity(intent);
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