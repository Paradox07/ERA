package com.arya.era;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class SoftSkills extends AppCompatActivity {

    ImageButton soft_skills_take_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_soft_skills);
        soft_skills_take_test = findViewById(R.id.soft_skills_take_test);
    }

    public void softskillstaketest(View view) {

        Intent intent = new Intent(SoftSkills.this, soft_skills_take_test.class);
        startActivity(intent);
    }
}
