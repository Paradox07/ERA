package com.arya.era;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignUp extends AppCompatActivity {

    TextInputLayout signupfullname, signupusername, signupemail, signupphone, signuppassword;
    Button Signupbutton, calllogin;

    FirebaseDatabase rootnode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_up);

        signupfullname = findViewById(R.id.signupfullname);
        signupusername = findViewById(R.id.signupusername);
        signupemail = findViewById(R.id.signupemail);
        signupphone = findViewById(R.id.signupphone);
        signuppassword = findViewById(R.id.signuppassword);
        Signupbutton = findViewById(R.id.Signupbutton);




    }
    public void signuptologin(View view) {
        Intent intent = new Intent(SignUp.this,LoginActivity.class);
        startActivity(intent);
        finish();

    }

    private Boolean Validatefullname() {
        String fullname = signupfullname.getEditText().getText().toString().trim();

        if (fullname.isEmpty()) {
            signupfullname.setError("Field cannot be Empty");
            return false;
        } else {
            signupfullname.setError(null);
            signupfullname.setErrorEnabled(false);
            return true;
        }
    }

    private Boolean Validateusername() {
        String username = signupusername.getEditText().getText().toString().trim();
        String noWhitespace = "\\A\\w{4,20}\\z";

        if (username.isEmpty()) {
            signupusername.setError("Field cannot be Empty");
            return false;
        } else if (username.length() >= 10) {
            signupusername.setError("Username must have less than 10 characters");
            return false;
        } else if (!username.matches(noWhitespace)) {
            signupusername.setError("No Whitespaces allowed");
            return false;

        } else {
            signupusername.setError(null);
           signupusername.setErrorEnabled(false);
            return true;
        }
    }

    private Boolean Validateemail() {
        String email = signupemail.getEditText().getText().toString().trim();
        String emailpattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        if (email.isEmpty()) {
            signupemail.setError("Field cannot be Empty");
            return false;
        } else if (!email.matches(emailpattern)) {
            signupemail.setError("Invalid Email Address");
            return false;
        } else {
            signupemail.setError(null);
            signupemail.setErrorEnabled(false);
            return true;
        }
    }

    private Boolean Validatephone() {
        String phone = signupphone.getEditText().getText().toString().trim();

        if (phone.isEmpty()) {
            signupphone.setError("Field cannot be Empty");
            return false;
        }else if (phone.length()<10){
			signupphone.setError("Invalid Phone No.");
			return false;

		}
        else {
            signupfullname.setError(null);
            signupphone.setErrorEnabled(false);
            return true;
        }
    }

    private Boolean Validatepassword() {
        String password = signuppassword.getEditText().getText().toString().trim();
        String passwordVal = "^" +
                //"(?=.*[0-9])" +         //at least 1 digit
                //"(?=.*[a-z])" +         //at least 1 lower case letter
                //"(?=.*[A-Z])" +         //at least 1 upper case letter
               // "(?=.*[a-zA-Z])" +      //any letter
               // "(?=.*[@#$%^&+=])" +    //at least 1 special character
             //   "(?=\\S+$)" +           //no white spaces
                ".{4,}" +               //at least 4 characters
                "$";

        if (password.isEmpty()) {
            signuppassword.setError("Field cannot be Empty");
            return false;
        } else if (!password.matches(passwordVal)) {
            signuppassword.setError("Password is too weak");
            return false;
        } else {
            signuppassword.setError(null);
			signuppassword.setErrorEnabled(false);
        return true;
    }
    }

    public void registerUser(View view) {

        if (!Validatefullname() | !Validatepassword() | !Validatephone() | !Validateemail() | !Validateusername()) {
            return;

        }else {
			rootnode = FirebaseDatabase.getInstance();
			reference = rootnode.getReference("users");

			String fullname = signupfullname.getEditText().getText().toString();
			String username = signupusername.getEditText().getText().toString();
			String email = signupemail.getEditText().getText().toString();
			String phone = signupphone.getEditText().getText().toString();
			String password = signuppassword.getEditText().getText().toString();

			UserHelperClass helperClass = new UserHelperClass(fullname, username, email, phone, password);
			reference.child(phone).setValue(helperClass);

			Toast.makeText(getApplicationContext(),
					"You are Registered. Continue Login ", Toast.LENGTH_LONG).show();
			signuptologin(view);
        }

    }






}
