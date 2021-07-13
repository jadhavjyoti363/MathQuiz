package com.example.mathquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MathQuiz extends AppCompatActivity {

    Button plusbtn;
    Button minusbtn;
    Button multiplybtn;
    Button dividebtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_quiz);
        init();
        plusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MathQuiz.this, plusActivity.class);
                startActivity(myIntent);

            }
        });
    }
    public  void init(){
        plusbtn=(Button)findViewById(R.id.plusbtn);
        minusbtn=(Button)findViewById(R.id.minusbtn);
        multiplybtn=(Button)findViewById(R.id.multiplybtn);
        dividebtn=(Button)findViewById(R.id.devidebtn);
    }
}
