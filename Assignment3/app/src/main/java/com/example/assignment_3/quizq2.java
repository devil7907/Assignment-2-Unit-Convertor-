package com.example.assignment_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class quizq2 extends AppCompatActivity {
    Button goback,nextq, choice1,choice2,choice3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizq2);


        choice1=findViewById(R.id.button27);
        choice2=findViewById(R.id.button28);
        choice3=findViewById(R.id.button29);

        goback=findViewById(R.id.button31);
        nextq=findViewById(R.id.button30);

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(quizq2.this,"Correct",Toast.LENGTH_SHORT).show();
            }
        });
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(quizq2.this,"Wrong",Toast.LENGTH_SHORT).show();
            }
        });
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(quizq2.this,"Wrong",Toast.LENGTH_SHORT).show();
            }
        });
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
        Intent intent= new Intent(quizq2.this, result.class);
        intent.putExtra("score", temp);
        startActivity(intent);
    }

    private void gobck() {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}