package com.example.banknotechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class England_Twenty_P extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.england_twenty_p);

        TextView twentyPFront = findViewById(R.id.TwentyPFront);
        twentyPFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.engTwentyPImage);
                noteImage.setImageResource(R.drawable.e_twenty_p_front);

                TextView twentyPBack1 = findViewById(R.id.TwentyPFront);
                twentyPBack1.setTextSize(30);

                TextView twentyPFront1 = findViewById(R.id.TwentyPBack);
                twentyPFront1.setTextSize(20);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.VISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.INVISIBLE);
            }
        });

        TextView twentyPBack = findViewById(R.id.TwentyPBack);
        twentyPBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.engTwentyPImage);
                noteImage.setImageResource(R.drawable.e_twenty_p_back);

                TextView twentyPBack1 = findViewById(R.id.TwentyPFront);
                twentyPBack1.setTextSize(20);

                TextView twentyPFront1 = findViewById(R.id.TwentyPBack);
                twentyPFront1.setTextSize(30);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.INVISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.VISIBLE);
            }
        });

    }
}
