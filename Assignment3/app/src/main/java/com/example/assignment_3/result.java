package com.example.assignment_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result extends AppCompatActivity {
    Button result;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result=findViewById(R.id.button32);
        txt=findViewById(R.id.textView);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               showresult();
            }
        });
    }

    private void showresult() {
        Intent intent1=getIntent();
        int temp=intent1.getIntExtra("score",0);
        txt.setText(temp);
    }
}