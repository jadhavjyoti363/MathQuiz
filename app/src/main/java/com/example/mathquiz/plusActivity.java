package com.example.mathquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class plusActivity extends AppCompatActivity {

    TextView scoretxt;
    TextView msg1txtview;
    TextView msg2textview;
    TextView answertextview;
    TextView countdowntxtview;
    Button option1btn;
    Button option2btn;
    public int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus);

        scoretxt=(TextView)findViewById(R.id.score2);
        msg1txtview=(TextView)findViewById(R.id.msg1);
        msg2textview=(TextView)findViewById(R.id.msg2);
        option1btn=(Button)findViewById(R.id.option1);
        option2btn=(Button)findViewById(R.id.option2);
        answertextview=(TextView)findViewById(R.id.answer);
        countdowntxtview=(TextView)findViewById(R.id.countdown);

        option1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg1txtview.setText("Incorrect answer please try again");

                //msg2textview.setVisibility(View.INVISIBLE);
               // answertextview.setVisibility(View.INVISIBLE);
            }
        });

        option2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg1txtview.setVisibility(View.INVISIBLE);
                answertextview.setText("8");
                msg2textview.setText("Correct Answer well done you get 5 point");
                scoretxt.setText("5");

            }
        });

        new CountDownTimer(3000, 100){
            public void onTick(long millisUntilFinished){
               // int counter = 0;
                countdowntxtview.setText(String.valueOf(counter));
                counter++;
            }
            public  void onFinish(){
                countdowntxtview.setText("Time out!!");
            }
        }.start();




    }
}
