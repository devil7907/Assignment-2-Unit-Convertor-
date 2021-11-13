package com.example.assignment_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class quiz extends AppCompatActivity  {
    Button btn1,btn2,btn3,btn4,btnback,btnnext;


    public String ans;
    int qno=0,score=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);



        btn1=findViewById(R.id.button4);
        btn2=findViewById(R.id.button5);
        btnback=findViewById(R.id.button26);
        btnnext=findViewById(R.id.button25);
        btn3=findViewById(R.id.button6);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotonext();
            }
        });
        btn4=findViewById(R.id.button7);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goback();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    score=score+1;
                    Toast.makeText(quiz.this,"Correct",Toast.LENGTH_SHORT).show();

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Toast.makeText(quiz.this,"Wrong",Toast.LENGTH_SHORT).show();

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Toast.makeText(quiz.this,"Wrong",Toast.LENGTH_SHORT).show();

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Toast.makeText(quiz.this,"Wrong",Toast.LENGTH_SHORT).show();

            }
        });






    }

    private void gotonext() {
        Intent intent= new Intent(this, quizq2.class);
        intent.putExtra("value", score);
        startActivity(intent);

    }

    private void goback() {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }




}


