package com.example.assignment_3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class quiz extends AppCompatActivity  {
    Button btn1,btn2,btn3,btn4,btnnext;
    Toolbar mytoolbar;

    public String ans;
    int qno=0,score=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mytoolbar = findViewById(R.id.toolbar11);
        setSupportActionBar(mytoolbar);

        ActionBar ab=getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        btn1=findViewById(R.id.button4);
        btn2=findViewById(R.id.button5);

        btnnext=findViewById(R.id.button25);
        btn3=findViewById(R.id.button6);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotonext();
            }
        });
        btn4=findViewById(R.id.button7);



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
        Intent intent= new Intent(quiz.this, quizq2.class);
        Intent intent1 = intent.putExtra("value", score);
        startActivity(intent);

    }






}


