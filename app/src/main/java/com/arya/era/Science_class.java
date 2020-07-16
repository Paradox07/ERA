package com.arya.era;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class Science_class extends AppCompatActivity {

    TextInputLayout science_class;
    Button science_go;
    String class_7 = "7";
    String class_8 = "8";
    String class_9 = "9";
    String class_10 = "10";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_science_class);

        science_class= findViewById(R.id.science_class);
        science_go = findViewById(R.id.science_go);

    }
    private Boolean Validatescienceclass() {

        final String userenteredclass = science_class.getEditText().getText().toString().trim();
        String class_7 = "7";
        String class_8 = "8";
        String class_9 = "9";
        String class_10 = "10";
        if (userenteredclass.isEmpty()) {
            science_class.setError("Field cannot be Empty");
            return false;
        }else if (userenteredclass.length()>2){
            science_class.setError("Invalid Class");
            return false;

        }
        else {
            science_class.setError(null);
            science_class.setErrorEnabled(false);
            return true;
        }
    }

    public void opensciencesyllabus(View view) {
        if ( !Validatescienceclass() ) {
            return;

        }else {
            final String userenteredclass = science_class.getEditText().getText().toString().trim();

            if (userenteredclass.equals(class_7)){

                Intent intent = new Intent(Science_class.this,class7sciencesyllabus.class);
                startActivity(intent);

            }else if (userenteredclass.equals(class_8)){
                Intent intent = new Intent(Science_class.this,class8sciencesyllabus.class);
                startActivity(intent);
            }
            else if (userenteredclass.equals(class_9)){
                Intent intent = new Intent(Science_class.this,class9sciencesyllabus.class);
                startActivity(intent);
            }
            else if (userenteredclass.equals(class_10)){
                Intent intent = new Intent(Science_class.this,class10sciencesyllabus.class);
                startActivity(intent);
            }else
            {
                science_class.setError("Enter correct class");
                return;

            }
        }
    }
}

