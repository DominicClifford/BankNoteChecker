package com.example.banknotechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class Scotland_BOS_Twenty_P extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scotland_bos_twenty_p);

        TextView twentypFront = findViewById(R.id.sBosTwentyPFront);
        twentypFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.sBosTwentyPImage);
                noteImage.setImageResource(R.drawable.s_bos_twenty_p_front);

                TextView twentypBack1 = findViewById(R.id.sBosTwentyPFront);
                twentypBack1.setTextSize(30);

                TextView twentypFront1 = findViewById(R.id.sBosTwentyPBack);
                twentypFront1.setTextSize(20);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.VISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.INVISIBLE);
            }
        });

        TextView twentypBack = findViewById(R.id.sBosTwentyPBack);
        twentypBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.sBosTwentyPImage);
                noteImage.setImageResource(R.drawable.s_bos_twenty_p_back);

                TextView twentypBack1 = findViewById(R.id.sBosTwentyPFront);
                twentypBack1.setTextSize(20);

                TextView twentypFront1 = findViewById(R.id.sBosTwentyPBack);
                twentypFront1.setTextSize(30);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.INVISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.VISIBLE);
            }
        });
    }
}
