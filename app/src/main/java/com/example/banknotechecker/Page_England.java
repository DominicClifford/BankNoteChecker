package com.example.banknotechecker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.view.View.OnClickListener;

public class Page_England extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_england);

        //Open England Page when english button is clicked
        ImageView engFiver = findViewById(R.id.engFiver);
        engFiver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageEngFiver = new Intent(Page_England.this, England_Five.class);
                startActivity(pageEngFiver);
            }
        });

        //Open England Page when english button is clicked
        ImageView engTenner = findViewById(R.id.engTennerButton);
        engTenner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageEngTenner = new Intent(Page_England.this, England_Ten.class);
                startActivity(pageEngTenner);
            }
        });

        //Open England Page when english button is clicked
        ImageView engTwenty = findViewById(R.id.engTwentyButton);
        engTwenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageEngTwenty = new Intent(Page_England.this, Page_Home.class);
                startActivity(pageEngTwenty);
            }
        });

        //Open England Page when english button is clicked
        ImageView engFifty = findViewById(R.id.engFiftyButton);
        engFifty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageEngFifty = new Intent(Page_England.this, Page_Home.class);
                startActivity(pageEngFifty);
            }
        });
    }
}
