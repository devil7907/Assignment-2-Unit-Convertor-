package com.example.assignment_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class quiz extends AppCompatActivity  {
    Button btn1,btn2,btn3,btn4;
    public question q1=new question();
    TextView txt;
    public String ans;
    int qno=0,score=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);



        btn1=findViewById(R.id.button4);
        btn2=findViewById(R.id.button5);


        btn3=findViewById(R.id.button6);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn2.getText()==ans)
                {
                    score=score+1;
                    //updatescore(score);
                    updatequestion();

                    Toast.makeText(quiz.this,"Correct",Toast.LENGTH_SHORT).show();
                }else
                {
                    Toast.makeText(quiz.this,"Wrong",Toast.LENGTH_SHORT).show();
                }
            }
        });


        btn4=findViewById(R.id.button7);


        txt=findViewById(R.id.textView);

    }


    public void updatequestion()
    {
        txt.setText("waleed");
        btn1.setText(q1.getchoice1(qno));
        btn2.setText(q1.getchoice2(qno));
        btn3.setText(q1.getchoice3(qno));
        btn4.setText(q1.getchoice4(qno));

        ans=q1.getanswer(qno);
        qno++;
    }

}


