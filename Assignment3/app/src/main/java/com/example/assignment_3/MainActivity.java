package com.example.assignment_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btn, btn1, btn2;
    Toolbar mytoolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mytoolbar = findViewById(R.id.toolbar1);
        setSupportActionBar(mytoolbar);

        btn1 = findViewById(R.id.button3);
        btn = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoquiz();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotopractice();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotorgepositry("https://github.com/devil7907/Assignment-2-Unit-Convertor-");

            }


        });


    }
    @Override

    public boolean onCreateOptionsMenu(Menu menu) {   // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_quiz:
                Intent intent = new Intent(this, quiz.class);
                startActivity(intent);
            case R.id.action_practice:
                Intent intent1 = new Intent(this, practice.class);
                startActivity(intent1);
           
            default:
                return super.onOptionsItemSelected(item);
        }
    }






            private void gotorgepositry (String s){
            Uri Webpage = Uri.parse(s);
            Intent intent = new Intent(Intent.ACTION_VIEW, Webpage);
            startActivity(intent);
        }

        private void gotopractice () {
            Intent intent1 = new Intent(this, practice.class);
            startActivity(intent1);
        }

        private void gotoquiz () {
            Intent intent = new Intent(this, quiz.class);
            startActivity(intent);
        }
        }
