package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity8 extends AppCompatActivity {

    TextView mTextView;

    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        mTextView = (TextView) findViewById(R.id.t1);

        Intent recInt= getIntent();
        mTextView.setText("Your score is : $"+recInt.getIntExtra("Money",a));
    }
}