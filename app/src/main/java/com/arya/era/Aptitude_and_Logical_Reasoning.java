package com.arya.era;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Aptitude_and_Logical_Reasoning extends AppCompatActivity {

    ImageButton reasoning_take_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_aptitude_and__logical__reasoning);
        reasoning_take_test = findViewById(R.id.reasoning_take_test);
    }

    public void reasoning_take_test(View view) {

        Intent intent = new Intent(Aptitude_and_Logical_Reasoning.this,apptitude_and_logical_reasoning_take_test.class);
        startActivity(intent);
    }
}
