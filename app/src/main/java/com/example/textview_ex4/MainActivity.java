package com.example.textview_ex4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tV;
    int timeClicked = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        tV = findViewById(R.id.tV);
    }

    public void pressed(View view) {
        timeClicked ++;
        tV.setTextColor(Color.YELLOW);
        if (timeClicked % 7 == 0)
        {
            tV.setText("BOOM");
        }
        else
        {
            tV.setText("This is a click number: "+timeClicked);
        }
    }
}