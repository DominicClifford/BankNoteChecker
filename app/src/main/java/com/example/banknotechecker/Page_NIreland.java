package com.example.banknotechecker;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Page_NIreland extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_nireland);

        TextView niFiveP = findViewById(R.id.NiFiveP);
        TextView niTenP = findViewById(R.id.NiTenP);
        TextView niTwentyP = findViewById(R.id.NiTwentyP);
        TextView niFiftyP = findViewById(R.id.NiFiftyP);
        TextView niHunP = findViewById(R.id.NiHunP);


        niFiveP.setPaintFlags(niFiveP.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        niTenP.setPaintFlags(niTenP.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        niTwentyP.setPaintFlags(niTwentyP.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        niFiftyP.setPaintFlags(niFiftyP.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        niHunP.setPaintFlags(niHunP.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        //Open NIreland BOI Five Page when button is clicked
        ImageView niBoiFive = findViewById(R.id.NiBoiFive);
        niBoiFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageBoiFiver = new Intent(Page_NIreland.this, NIreland_BOI_Five.class);
                startActivity(pageBoiFiver);
            }
        });

        //Open NIreland UB Five Page when button is clicked
        ImageView niUbFive = findViewById(R.id.NiUbFive);
        niUbFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageUbFiver = new Intent(Page_NIreland.this, NIreland_UB_Five.class);
                startActivity(pageUbFiver);
            }
        });

        //Open NIreland BOI Ten Page when button is clicked
        ImageView niBoiTen = findViewById(R.id.NiBoiTen);
        niBoiTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageBoiTen = new Intent(Page_NIreland.this, NIreland_BOI_Ten.class);
                startActivity(pageBoiTen);
            }
        });

        //Open NIreland UB Ten Page when button is clicked
        ImageView niUbTen = findViewById(R.id.NiUbTen);
        niUbTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageUbTen = new Intent(Page_NIreland.this, NIreland_UB_Ten.class);
                startActivity(pageUbTen);

                
            }
        });


        

        //Open NIreland DB Ten Page when button is clicked
        ImageView niDbTen = findViewById(R.id.NiDbTen);
        niDbTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageDbTen = new Intent(Page_NIreland.this, NIreland_DB_Ten.class);
                startActivity(pageDbTen);
            }
        });

        //Open NIreland BOI Twenty Page when button is clicked
        ImageView niBoiTwenty = findViewById(R.id.NiBoiTwenty);
        niBoiTwenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageBoiTwenty = new Intent(Page_NIreland.this, NIreland_BOI_Twenty.class);
                startActivity(pageBoiTwenty);
            }
        });

        //Open NIreland UB Twenty Page when button is clicked
        ImageView niUbTwenty = findViewById(R.id.NiUbTwenty);
        niUbTwenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageUbTwenty = new Intent(Page_NIreland.this, NIreland_UB_Twenty.class);
                startActivity(pageUbTwenty);
            }
        });

        //Open NIreland BOI Fifty Page when button is clicked
        ImageView niBoiFifty = findViewById(R.id.NiBoiFifty);
        niBoiFifty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageBoiFifty = new Intent(Page_NIreland.this, NIreland_BOI_Fifty.class);
                startActivity(pageBoiFifty);
            }
        });

        //Open NIreland UB Fifty Page when button is clicked
        ImageView niUbFifty = findViewById(R.id.NiUbFifty);
        niUbFifty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageUbFifty = new Intent(Page_NIreland.this, NIreland_UB_Fifty.class);
                startActivity(pageUbFifty);
            }
        });

        //Open NIreland BOI Hundred Page when button is clicked
        ImageView niBoiHun = findViewById(R.id.NiBoiHun);
        niBoiHun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageBoiHun = new Intent(Page_NIreland.this, NIreland_BOI_Hun.class);
                startActivity(pageBoiHun);
            }
        });

        //Open NIreland UB Hundred Page when button is clicked
        ImageView niUbHun = findViewById(R.id.NiUbHun);
        niUbHun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageUbHun = new Intent(Page_NIreland.this, NIreland_UB_Hun.class);
                startActivity(pageUbHun);
            }
        });
    }
}
