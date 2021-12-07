package com.example.assignment_3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result extends AppCompatActivity {
    Button result;
    Toolbar mytoolbar;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mytoolbar = findViewById(R.id.toolbar13);
        setSupportActionBar(mytoolbar);

        ActionBar ab=getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        result=findViewById(R.id.button32);
        txt=findViewById(R.id.textView7);
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

        txt.setText("1");
    }
}