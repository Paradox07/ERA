package com.arya.era;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class LoginActivity extends AppCompatActivity {
    Button callsignup,forgotpassword,login;
    TextView login_era, loginslogan;
    ImageView loginlogo;
    TextInputLayout loginUsername, loginpassword;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        callsignup = findViewById(R.id.callsignup);
        loginlogo = findViewById(R.id.LoginLogo);
        login_era = findViewById(R.id.login_era);
        loginslogan = findViewById(R.id.loginslogan);
        loginUsername = findViewById(R.id.loginusername);
        loginpassword = findViewById(R.id.loginpassword);
        forgotpassword = findViewById(R.id.forgotpassword);
        login = findViewById(R.id.Login);
        progressBar = findViewById(R.id.loginbar);

        callsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,SignUp.class);
                Pair[] pairs =new Pair[8];
                pairs[0] = new Pair<View,String>(loginlogo,"logo_image");
                pairs[1] = new Pair<View,String>(login_era,"logo_Text");
                pairs[2] = new Pair<View,String>(loginslogan,"logo_Slogan");
                pairs[3] = new Pair<View,String>(loginUsername,"Username");
                pairs[4] = new Pair<View,String>(loginpassword,"password_trans");
                pairs[5] = new Pair<View,String>(forgotpassword,"forgotpasswordtrans");
                pairs[6] = new Pair<View,String>(login,"button_Trans");
                pairs[7] = new Pair<View,String>(callsignup,"login_signup_transition");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(LoginActivity.this,pairs);
                startActivity(intent,options.toBundle());

            }
        });
  

    }
    private Boolean Validateusername() {
        String username = loginUsername.getEditText().getText().toString().trim();


        if (username.isEmpty()) {
            loginUsername.setError("Field cannot be Empty");
            return false;
        } else {
            loginUsername.setError(null);
            loginUsername.setErrorEnabled(false);
            return true;
        }
    }
    private Boolean Validatepassword() {
        String password = loginpassword.getEditText().getText().toString().trim();


        if (password.isEmpty()) {
            loginpassword.setError("Field cannot be Empty");
            return false;
        } else {
            loginpassword.setError(null);
            loginpassword.setErrorEnabled(false);
            return true;
        }
    }

    public void loginUser(View view) {

        if(!Validateusername() | !Validatepassword()){
            return;
        }
        else {
            isUser();
        }
    }

    private void isUser() {
        progressBar.setVisibility(View.VISIBLE);
        final String userenteredUsername = loginUsername.getEditText().getText().toString().trim();
        final String userenteredpassword = loginpassword.getEditText().getText().toString().trim();

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("users");
        Query checkUser = reference.orderByChild("username").equalTo(userenteredUsername);

        checkUser.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if (dataSnapshot.exists()){
                    loginUsername.setError(null);
                    loginUsername.setErrorEnabled(false);


                    String passwordfromDb = dataSnapshot.child(userenteredUsername).child("password").getValue(String.class);

                    Intent intent = new Intent(LoginActivity.this,homepage.class);
                    startActivity(intent);
                    finish();


                  /* if (passwordfromDb.equals(userenteredpassword)){

                        loginpassword.setError(null);
                        loginpassword.setErrorEnabled(false);

                        //String fullnameFromDB = dataSnapshot.child(userenteredUsername).child("name").getValue(String.class);
                        //String usernameFromDB = dataSnapshot.child(userenteredUsername).child("username").getValue(String.class);
                        //String phoneNoFromDB = dataSnapshot.child(userenteredUsername).child("phoneNo").getValue(String.class);
                        //String emailFromDB = dataSnapshot.child(userenteredUsername).child("email").getValue(String.class);
                        Intent intent = new Intent(getApplicationContext(),homepage.class);
                        //intent.putExtra("name", fullnameFromDB);
                        //intent.putExtra("username", usernameFromDB);
                        //intent.putExtra("email", emailFromDB);
                        //intent.putExtra("phoneNo", phoneNoFromDB);
                        //intent.putExtra("password", passwordfromDb);
                        startActivity(intent);
                        finish();
                    }
                    else{
                        progressBar.setVisibility(View.GONE);
                        loginpassword.setError("wrong Password");
                        loginpassword.requestFocus();
                    }*/
                }else{
                    progressBar.setVisibility(View.GONE);
                    loginUsername.setError("No Such user Exists");
                    loginUsername.requestFocus();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}
