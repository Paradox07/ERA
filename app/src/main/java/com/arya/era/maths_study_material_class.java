package com.arya.era;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class maths_study_material_class extends AppCompatActivity {
    TextInputLayout maths_studyMaterialclass;
    Button maths_studyMaterialgo;
    String class_7 = "7";
    String class_8 = "8";
    String class_9 = "9";
    String class_10 = "10";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_maths_study_material_class);

        maths_studyMaterialclass=findViewById(R.id.maths_study_material_class);
        maths_studyMaterialgo=findViewById(R.id.maths_study_material_go);
    }
    private Boolean Validatemathsstudymaterialclass() {

        final String userenteredclass = maths_studyMaterialclass.getEditText().getText().toString().trim();
        if (userenteredclass.isEmpty()) {
            maths_studyMaterialclass.setError("Field cannot be Empty");
            return false;
        }else if (userenteredclass.length()>2){
            maths_studyMaterialclass.setError("Invalid Class");
            return false;

        }
        else {
            maths_studyMaterialclass.setError(null);
            maths_studyMaterialclass.setErrorEnabled(false);
            return true;
        }
    }

    public void openmathsstudymaterial(View view) {
        if ( !Validatemathsstudymaterialclass() ) {
            return;

        }else {
            final String userenteredclass = maths_studyMaterialclass.getEditText().getText().toString().trim();

            if (userenteredclass.equals(class_7)){

                Intent intent = new Intent(maths_study_material_class.this,maths7thStudymaterial.class);
                startActivity(intent);

            }else if (userenteredclass.equals(class_8)){
                Intent intent = new Intent(maths_study_material_class.this,maths8th_studymaterial.class);
                startActivity(intent);
            }
            else if (userenteredclass.equals(class_9)){
                Intent intent = new Intent(maths_study_material_class.this,maths9th_studymaterial.class);
                startActivity(intent);
            }
            else if (userenteredclass.equals(class_10)){
                Intent intent = new Intent(maths_study_material_class.this,maths10th_studymaterial.class);
                startActivity(intent);
            }
            else
            {
                maths_studyMaterialclass.setError("Enter correct class");
                return;

            }
        }
    }
}

