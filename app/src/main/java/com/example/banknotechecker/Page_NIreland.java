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

    }
}
