package com.arya.era;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Mathematics extends AppCompatActivity {
private ImageButton math_syllabus;
private ImageButton math_studyMaterial;
private  ImageButton maths_take_test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_mathematics);
        math_syllabus = findViewById(R.id.math_syllabus);
        math_studyMaterial = findViewById(R.id.maths_study_material);
        maths_take_test = findViewById(R.id.maths_take_test);

        math_syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mathematics.this,maths_class.class);
                startActivity(intent);

            }
        });

        math_studyMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mathematics.this,maths_study_material_class.class);
                startActivity(intent);
            }
        });

    }

    public void maths_take_test(View view) {

        Intent intent = new Intent(Mathematics.this,Maths_take_test.class);
        startActivity(intent);


    }
}
