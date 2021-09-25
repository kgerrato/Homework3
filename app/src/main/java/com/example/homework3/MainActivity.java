package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton mRadioButton1, mRadioButton2, mRadioButton3, mRadioButton4;
    TextView mTextView;
    Button mButton1;


    int a; // initialize value a which will be our money we will update
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRadioButton1 = (RadioButton) findViewById(R.id.rb1); //set up our radio buttons so we can use them to select the correct answer or wrong answer
        mRadioButton2 = (RadioButton) findViewById(R.id.rb2);
        mRadioButton3 = (RadioButton) findViewById(R.id.rb3);
        mRadioButton4 = (RadioButton) findViewById(R.id.rb4);

        mTextView= (TextView) findViewById(R.id.t1);

        mButton1 = (Button) findViewById(R.id.b1);

    }
    public void Radio(View v){ //When one of the options are selected, it is highlighted green and all other choices are made white to unhighlight and allow you to change choice without it still being green
        if(mRadioButton1.isChecked()){
            mRadioButton1.setBackgroundColor(Color.GREEN);
            mRadioButton2.setBackgroundColor(Color.WHITE);
            mRadioButton3.setBackgroundColor(Color.WHITE);
            mRadioButton4.setBackgroundColor(Color.WHITE);
        }
        else if(mRadioButton2.isChecked()){
            mRadioButton2.setBackgroundColor(Color.GREEN);
            mRadioButton1.setBackgroundColor(Color.WHITE);
            mRadioButton3.setBackgroundColor(Color.WHITE);
            mRadioButton4.setBackgroundColor(Color.WHITE);
        }
        else if(mRadioButton3.isChecked()){
            mRadioButton3.setBackgroundColor(Color.GREEN);
            mRadioButton1.setBackgroundColor(Color.WHITE);
            mRadioButton2.setBackgroundColor(Color.WHITE);
            mRadioButton4.setBackgroundColor(Color.WHITE);
        }
        else if(mRadioButton4.isChecked()){
            mRadioButton4.setBackgroundColor(Color.GREEN);
            mRadioButton1.setBackgroundColor(Color.WHITE);
            mRadioButton2.setBackgroundColor(Color.WHITE);
            mRadioButton3.setBackgroundColor(Color.WHITE);
        }
    }

    public void Confirm(View v) {
        if(mRadioButton3.isChecked()){ //Confirm relates to our confirm button and checks if the correct radio button answer was selected, if so, award 100 dollars, display toast to user, then intent in either case to next question/activity
            Toast.makeText(MainActivity.this, "Correct. +$100",
                    Toast.LENGTH_LONG).show();
            a+=100;
            mTextView.setText("Your score is : $" + a);
            Intent n= new Intent(this, MainActivity2.class);
            n.putExtra("Money",a);
            startActivity(n);
        }
    else{
            Toast.makeText(MainActivity.this, "Wrong",
                    Toast.LENGTH_LONG).show();
            Intent n= new Intent(this, MainActivity2.class);
            n.putExtra("Money",a);
            startActivity(n);
        }
    }
}