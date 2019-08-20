package com.example.banknotechecker;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Page_Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_home);

        //Open England Page when english button is clicked
        ImageView eng = findViewById(R.id.engButton);
        eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click
                Intent pageEng = new Intent(Page_Home.this, Page_England.class);
                startActivity(pageEng);
            }
        });

        //Open Scotland page when scottish button is clicked
        ImageView scot = findViewById(R.id.scotButton);
        scot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click
                Intent pageScot = new Intent(Page_Home.this, Page_Scotland.class);
                startActivity(pageScot);
            }
        });

        //Open Northern Ireland page when norther Ireland button is clicked
        ImageView NIre = findViewById(R.id.nIrelandButton);
        NIre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click
                Intent pageNIre = new Intent(Page_Home.this, Page_NIreland.class);
                startActivity(pageNIre);
            }
        });

        //Opens Euro page when the Euro Button is clicked
        ImageView Euro = findViewById(R.id.euroButton);
        Euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click
                Intent pageEuro = new Intent(Page_Home.this, Page_Euro.class);
                startActivity(pageEuro);
            }
        });


    }




}
