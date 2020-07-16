package com.arya.era;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Science extends AppCompatActivity {
    private ImageButton science_syllabus;
    private ImageButton science_studumaterial;
    private ImageButton science_take_test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_science);

        science_syllabus = findViewById(R.id.science_syllabus);
        science_studumaterial= findViewById(R.id.science_study_material);
        science_take_test = findViewById(R.id.science_take_test);

        science_syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Science.this,Science_class.class);
                startActivity(intent);

            }
        });

        science_studumaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Science.this,science_study_material_class.class);
                startActivity(intent);
            }
        });

    }

    public void science_take_test(View view) {
        Intent intent = new Intent(Science.this,science_take_test.class);
        startActivity(intent);


    }
}
