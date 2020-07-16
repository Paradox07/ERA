package com.arya.era;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class maths_class extends AppCompatActivity {

    TextInputLayout maths_class;
    Button maths_go;
    String class_7 = "7";
    String class_8 = "8";
    String class_9 = "9";
    String class_10 = "10";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_maths_class);

        maths_class= findViewById(R.id.maths_class);
        maths_go = findViewById(R.id.maths_go);



    }

    private Boolean Validatemathsclass() {

        final String userenteredclass = maths_class.getEditText().getText().toString().trim();
        String class_7 = "7";
        String class_8 = "8";
        String class_9 = "9";
        String class_10 = "10";
        if (userenteredclass.isEmpty()) {
            maths_class.setError("Field cannot be Empty");
            return false;
        }else if (userenteredclass.length()>2){
            maths_class.setError("Invalid Class");
            return false;

        }
        else {
            maths_class.setError(null);
            maths_class.setErrorEnabled(false);
            return true;
        }
    }

    public void openmathssyllabus(View view) {
        if ( !Validatemathsclass() ) {
            return;

        }else {
            final String userenteredclass = maths_class.getEditText().getText().toString().trim();

            if (userenteredclass.equals(class_7)){

                Intent intent = new Intent(maths_class.this,class7mathssyallbus.class);
                startActivity(intent);

            }else if (userenteredclass.equals(class_8)){
                Intent intent = new Intent(maths_class.this,class8mathssyallbus.class);
                startActivity(intent);
            }
            else if (userenteredclass.equals(class_9)){
                Intent intent = new Intent(maths_class.this,class9mathssyallbus.class);
                startActivity(intent);
            }
            else if (userenteredclass.equals(class_10)){
                Intent intent = new Intent(maths_class.this,class10mathssyallbus.class);
                startActivity(intent);
            }else
            {
                maths_class.setError("Enter correct class");
                return;

            }
        }
    }
}
