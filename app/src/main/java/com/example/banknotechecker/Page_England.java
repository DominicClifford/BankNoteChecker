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
        ImageView engFiver = findViewById(R.id.engFiverButton);
        engFiver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageEngFiver = new Intent(Page_England.this, Page_Home.class);
                startActivity(pageEngFiver);
            }
        });



    }
}
