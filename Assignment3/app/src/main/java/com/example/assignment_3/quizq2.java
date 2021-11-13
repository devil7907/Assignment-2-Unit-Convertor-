package com.example.assignment_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quizq2 extends AppCompatActivity {
    Button goback,nextq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizq2);

        goback=findViewById(R.id.button31);
        nextq=findViewById(R.id.button30);

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               gobck();
            }
        });
        nextq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotonextq();
            }
        });
    }

    private void gotonextq() {
        Intent intent1=getIntent();
        int temp=intent1.getIntExtra("value",0);
        temp=temp+1;
        Intent intent= new Intent(this, result.class);
        intent.putExtra("score", temp);
        startActivity(intent);
    }

    private void gobck() {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}