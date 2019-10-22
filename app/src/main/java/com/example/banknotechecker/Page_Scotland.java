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

        //Open England Page when english button is clicked
        ImageView sBosFive = findViewById(R.id.sBosFive);
        sBosFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set animation on click
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_animation);
                v.startAnimation(animation);
                //open new activity on click (Temp return to home)
                Intent pageEngFiver = new Intent(Page_Scotland.this, Scotland_BOS_Five.class);
                startActivity(pageEngFiver);
            }
        });


    }
}
