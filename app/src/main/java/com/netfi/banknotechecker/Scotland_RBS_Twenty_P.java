package com.netfi.banknotechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class Scotland_RBS_Twenty_P extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scotland_rbs_twenty_p);

        TextView twentypFront = findViewById(R.id.sRbsTwentyPFront);
        twentypFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.sRbsTwentyPImage);
                noteImage.setImageResource(R.drawable.s_rbs_twenty_p_front);

                TextView twentypBack1 = findViewById(R.id.sRbsTwentyPFront);
                twentypBack1.setTextSize(30);

                TextView twentypFront1 = findViewById(R.id.sRbsTwentyPBack);
                twentypFront1.setTextSize(20);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.VISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.INVISIBLE);
            }
        });

        TextView twentypBack = findViewById(R.id.sRbsTwentyPBack);
        twentypBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.sRbsTwentyPImage);
                noteImage.setImageResource(R.drawable.s_rbs_twenty_p_back);

                TextView twentypBack1 = findViewById(R.id.sRbsTwentyPFront);
                twentypBack1.setTextSize(20);

                TextView twentypFront1 = findViewById(R.id.sRbsTwentyPBack);
                twentypFront1.setTextSize(30);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.INVISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.VISIBLE);
            }
        });
    }
}
