package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity9 extends AppCompatActivity {

    Button mButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        mButton1 = (Button) findViewById(R.id.b1);
    }

    public void Confirm(View v) {
            Intent n= new Intent(this, MainActivity.class);
            startActivity(n);
        }
}