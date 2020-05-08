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

public class Page_Scotland extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_scotland);

        TextView sFiveP = findViewById(R.id.SFiveP);
        TextView sTenP = findViewById(R.id.STenP);
        TextView sTwentyP = findViewById(R.id.STwentyP);
        TextView sFiftyP = findViewById(R.id.SFiftyP);
        TextView sHunP = findViewById(R.id.SHunP);


        sFiveP.setPaintFlags(sFiveP.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        sTenP.setPaintFlags(sTenP.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        sTwentyP.setPaintFlags(sTwentyP.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        sFiftyP.setPaintFlags(sFiftyP.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        sHunP.setPaintFlags(sHunP.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        //Open Scotland Bos Five Page when button is clicked
        ImageView sBosFive = findViewById(R.id.sBosFive);
        sBosFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageBosFiver = new Intent(Page_Scotland.this, Scotland_BOS_Five.class);
                startActivity(pageBosFiver);
            }
        });

        //Open Scotland CB Five Page when button is clicked
        ImageView sCBFive = findViewById(R.id.sCbFive);
        sCBFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageCBFiver = new Intent(Page_Scotland.this, Scotland_CB_Five.class);
                startActivity(pageCBFiver);
            }
        });

        //Open Scotland RBS Five Page when button is clicked
        ImageView sRbsFive = findViewById(R.id.sRbsFive);
        sRbsFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageRbsFiver = new Intent(Page_Scotland.this, Scotland_RBS_Five.class);
                startActivity(pageRbsFiver);
            }
        });

        //Open Scotland BOS Ten Page when button is clicked
        ImageView sBosTen = findViewById(R.id.sBosTen);
        sBosTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageBosTen = new Intent(Page_Scotland.this, Scotland_BOS_Ten.class);
                startActivity(pageBosTen);
            }
        });

        //Open Scotland CB Ten Page when button is clicked
        ImageView sCbTen = findViewById(R.id.sCbTen);
        sCbTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageCbTen = new Intent(Page_Scotland.this, Scotland_CB_Ten.class);
                startActivity(pageCbTen);
            }
        });

        //Open Scotland RBS Ten Page when button is clicked
        ImageView sRbsTen = findViewById(R.id.sRbsTen);
        sRbsTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageRbsTen = new Intent(Page_Scotland.this, Scotland_RBS_Ten.class);
                startActivity(pageRbsTen);
            }
        });

        //Open Scotland BOS Twenty Page when button is clicked
        ImageView sBosTwentyP = findViewById(R.id.sBosTwentyP);
        sBosTwentyP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageBosTwentyP = new Intent(Page_Scotland.this, Scotland_BOS_Twenty_P.class);
                startActivity(pageBosTwentyP);
            }
        });

        //Open Scotland BOS Twenty Page when button is clicked
        ImageView sBosTwenty = findViewById(R.id.sBosTwenty);
        sBosTwenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageBosTwenty = new Intent(Page_Scotland.this, Scotland_BOS_Twenty.class);
                startActivity(pageBosTwenty);
            }
        });

        //Open Scotland CB Twenty Page when button is clicked
        ImageView sCbTwenty = findViewById(R.id.sCbTwenty);
        sCbTwenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageCbTwenty = new Intent(Page_Scotland.this, Scotland_CB_Twenty.class);
                startActivity(pageCbTwenty);
            }
        });

        //Open Scotland Royal Bank of Scotland Twenty Page when button is clicked
        ImageView sRbsTwenty = findViewById(R.id.sRbsTwenty);
        sRbsTwenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageRbsTwenty = new Intent(Page_Scotland.this, Scotland_RBS_Twenty.class);
                startActivity(pageRbsTwenty);
            }
        });

        //Open Scotland Bank of Scotland Fifty Page when button is clicked
        ImageView sBosFifty = findViewById(R.id.sBosFifty);
        sBosFifty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageBosFifty = new Intent(Page_Scotland.this, Scotland_BOS_Fifty.class);
                startActivity(pageBosFifty);
            }
        });

        //Open Scotland CB Bank Fifty Page when button is clicked
        ImageView sCbFifty = findViewById(R.id.sCbFifty);
        sCbFifty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageCBFifty = new Intent(Page_Scotland.this, Scotland_CB_Fifty.class);
                startActivity(pageCBFifty);
            }
        });

        //Open Scotland Royal Bank of Scotland Fifty Page when button is clicked
        ImageView sRbsFifty = findViewById(R.id.sRbsFifty);
        sRbsFifty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageRBSFifty = new Intent(Page_Scotland.this, Scotland_RBS_Fifty.class);
                startActivity(pageRBSFifty);
            }
        });

        //Open Scotland Bank of Scotland Hundred Page when button is clicked
        ImageView sBosHun = findViewById(R.id.sBosHun);
        sBosHun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageBOSHun = new Intent(Page_Scotland.this, Scotland_BOS_Hun.class);
                startActivity(pageBOSHun);
            }
        });

        //Open Scotland CB Bank Hundred Page when button is clicked
        ImageView sCbHun = findViewById(R.id.sCbHun);
        sCbHun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageCbHun = new Intent(Page_Scotland.this, Scotland_CB_Hun.class);
                startActivity(pageCbHun);
            }
        });

        //Open Scotland Royal Bank of Scotland Bank Hundred Page when button is clicked
        ImageView sRbsHun = findViewById(R.id.sRbsHun);
        sRbsHun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageRbsHun = new Intent(Page_Scotland.this, Scotland_RBS_Hun.class);
                startActivity(pageRbsHun);
            }
        });
    }
}
