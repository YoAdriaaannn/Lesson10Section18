package com.example.atomi.lesson10section18;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView myPracticeView = new TextView(this);
        myPracticeView.setText("wow");
        myPracticeView.setAllCaps(true);
        myPracticeView.setTextSize(40);
        myPracticeView.setTextColor(Color.RED);
        myPracticeView.setTextAppearance(R.style.TextAppearance_AppCompat_Title);


        setContentView(myPracticeView);
    }
}
