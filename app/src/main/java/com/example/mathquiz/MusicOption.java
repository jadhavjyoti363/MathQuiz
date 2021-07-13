package com.example.mathquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MusicOption extends AppCompatActivity {

    ToggleButton toggleButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_option);



        final ToggleButton toggle = (ToggleButton) findViewById(R.id.toggle1);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    toggle.setSoundEffectsEnabled(true);
                    // The toggle is enabled
                } else {
                    // The toggle is disabled
                    toggle.setSoundEffectsEnabled(false);

                }
            }
        });




    }
}
