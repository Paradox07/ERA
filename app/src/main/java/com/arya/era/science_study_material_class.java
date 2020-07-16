package com.arya.era;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class science_study_material_class extends AppCompatActivity {

    TextInputLayout science_studyMaterialclass;
    Button science_studyMaterialgo;
    String class_7 = "7";
    String class_8 = "8";
    String class_9 = "9";
    String class_10 = "10";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_science_study_material_class);

        science_studyMaterialclass= findViewById(R.id.science_study_material_class);
        science_studyMaterialgo= findViewById(R.id.science_study_material_go);
    }
    private Boolean Validatesciencestudymaterialclass() {

        final String userenteredclass = science_studyMaterialclass.getEditText().getText().toString().trim();
        if (userenteredclass.isEmpty()) {
            science_studyMaterialclass.setError("Field cannot be Empty");
            return false;
        }else if (userenteredclass.length()>2){
            science_studyMaterialclass.setError("Invalid Class");
            return false;

        }
        else {
            science_studyMaterialclass.setError(null);
            science_studyMaterialclass.setErrorEnabled(false);
            return true;
        }
    }

    public void opensciencestudymaterial(View view) {
        if ( !Validatesciencestudymaterialclass() ) {
            return;

        }else {
            final String userenteredclass = science_studyMaterialclass.getEditText().getText().toString().trim();

            if (userenteredclass.equals(class_7)){

                Intent intent = new Intent(science_study_material_class.this,science7thStudymaterial.class);
                startActivity(intent);

            }else if (userenteredclass.equals(class_8)){
                Intent intent = new Intent(science_study_material_class.this,science8th_studymaterial.class);
                startActivity(intent);
            }
            else if (userenteredclass.equals(class_9)){
                Intent intent = new Intent(science_study_material_class.this,science9th_studymaterial.class);
                startActivity(intent);
            }
            else if (userenteredclass.equals(class_10)){
                Intent intent = new Intent(science_study_material_class.this,science10th_studymaterial.class);
                startActivity(intent);
            }else
            {
                science_studyMaterialclass.setError("Enter correct class");
                return;

            }
        }
    }
}


