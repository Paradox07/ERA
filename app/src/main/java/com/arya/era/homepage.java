package com.arya.era;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.VideoView;
import android.widget.ViewFlipper;

import com.google.android.material.navigation.NavigationView;


public class homepage extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    androidx.appcompat.widget.Toolbar toolbar;

    ViewFlipper v_flipper;

    private ViewPager mslideViewPager;
    private LinearLayout mdotLayout;

    private TextView[] mDots;

    private SliderAdapter sliderAdapter;
    private Button prev_button;
    private Button next_button;

    private int mcurrentpage;
    Button taketest;
    Button hiringdetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        taketest=findViewById(R.id.take_test);
        hiringdetails=findViewById(R.id.hiringdetails);

        ImageButton buttonplayvideo = (ImageButton) findViewById(R.id.start_again);
        getWindow().setFormat(PixelFormat.UNKNOWN);

        VideoView mvideoView = (VideoView) findViewById(R.id.video_view);
        String uriPath = "android.resource://com.arya.era/" + R.raw.anim_era_video;
        Uri uri = Uri.parse(uriPath);
        mvideoView.setVideoURI(uri);
        mvideoView.requestFocus();
        mvideoView.start();

        buttonplayvideo.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoView mvideoView = findViewById(R.id.video_view);
                String uriPath = "android.resource://com.arya.era/" + R.raw.anim_era_video;
                Uri uri = Uri.parse(uriPath);
                mvideoView.setVideoURI(uri);
                mvideoView.requestFocus();
                mvideoView.start();

            }
        });

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_View);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);

        int images[] = {R.drawable.era_customer_3, R.drawable.era_customer_1, R.drawable.era_customer_2,R.drawable.era_customer_4};

        v_flipper =findViewById(R.id.v_flipper);
//for loop
       /*for (int i=0;i<images.length;i++){
            flipperImages(images[i]);
        }*/
//for each image
         for (int image:images){
            flipperImages(image);
        }

         mslideViewPager= findViewById(R.id.View_Pager);
         mdotLayout=findViewById(R.id.testimonial_dots);

         sliderAdapter = new SliderAdapter(this);
         mslideViewPager.setAdapter(sliderAdapter);

         addDotsIndicator(0);

         mslideViewPager.addOnPageChangeListener(viewListener);

         prev_button=findViewById(R.id.prev_button);
         next_button=findViewById(R.id.next_button);

         next_button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 mslideViewPager.setCurrentItem(mcurrentpage+1);
             }
         });
        prev_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mslideViewPager.setCurrentItem(mcurrentpage-1);
            }
        });



    }

    public void addDotsIndicator(int position){
        mDots = new TextView[3];
        mdotLayout.removeAllViews();
        for(int i =0; i < mDots.length ;i++){

            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(60);
            mDots[i].setTextColor(getResources().getColor(R.color.colorTrnsparentWhite));

            mdotLayout.addView(mDots[i]);
        }

        if (mDots.length > 0){
            mDots[position].setTextColor(getResources().getColor(R.color.colorGrey));


        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {

            addDotsIndicator(i);

            mcurrentpage = i;

            if (i==0){
                next_button.setEnabled(true);
                prev_button.setEnabled(false);
                prev_button.setVisibility(View.INVISIBLE);

                next_button.setText("Next");
                prev_button.setText("");
            }else if (i == mDots.length-1){

                next_button.setEnabled(true);
                prev_button.setEnabled(true);
                prev_button.setVisibility(View.VISIBLE);

                next_button.setText("");
                prev_button.setText("Prev");


            }else {

                next_button.setEnabled(true);
                prev_button.setEnabled(true);
                prev_button.setVisibility(View.VISIBLE);

                next_button.setText("Next");
                prev_button.setText("Prev");
            }

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    public  void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(2000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setInAnimation(this,android.R.anim.slide_out_right);


    }

    @Override
    public void onBackPressed() {


        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);

        }else{
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Confirm Exit..!!");
            builder.setIcon(R.drawable.exit_icon);
            builder.setMessage("Are you sure you want to Exit?")
                    .setCancelable(true)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            finish();

                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();


        }

    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if (id==R.id.nav_maths){
            startActivity(new Intent(homepage.this,Mathematics.class));
        }
        else if (id==R.id.nav_Science){
            startActivity(new Intent(homepage.this,Science.class));
        }
        else if (id==R.id.nav_Apptitude_and_logical_reasoning){
            startActivity(new Intent(homepage.this,Aptitude_and_Logical_Reasoning.class));
        }
        else if (id==R.id.nav_SoftSkills){
            startActivity(new Intent(homepage.this,SoftSkills.class));
        }
        else if (id==R.id.nav_liveclassroom){
            Uri uri = Uri.parse("http://www.era-co.in/eraLive");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }
        else if (id==R.id.nav_visitwebsite){
            Uri uri = Uri.parse("http://www.era-co.in");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }


        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    public void taketest(View view) {

        Intent intent = new Intent(homepage.this,Take_Test.class);
        startActivity(intent);

    }

    public void hiringdetails(View view) {

        Intent intent = new Intent(homepage.this,hiring_details.class);
        startActivity(intent);


    }
}
