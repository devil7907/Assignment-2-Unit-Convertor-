package com.example.myapplication1;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView, textView2, textView4, ValueofPounds;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        textView4=findViewById(R.id.textView4);
        ValueofPounds=findViewById(R.id.ValueofPounds);

        editText=findViewById(R.id.editTextNumber);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                convertfromkilotopounds();
            }


        } );

    }

    private void convertfromkilotopounds() {

        String input=editText.getText().toString();
        double kilo=Double.parseDouble(input);
        double pound=kilo*2.205;
        ValueofPounds.setText(""+pound);

    }
}