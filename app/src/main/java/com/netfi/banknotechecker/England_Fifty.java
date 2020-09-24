package com.netfi.banknotechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;


public class England_Fifty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.england_fifty);

        TextView fiftyFront = findViewById(R.id.FiftyFront);
        fiftyFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.engFiftyImage);
                noteImage.setImageResource(R.drawable.e_fifty_front_v3);

                TextView fiftyBack1 = findViewById(R.id.FiftyFront);
                fiftyBack1.setTextSize(30);

                TextView fiftyFront1 = findViewById(R.id.FiftyBack);
                fiftyFront1.setTextSize(20);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.VISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.INVISIBLE);
            }
        });

        TextView fiftyBack = findViewById(R.id.FiftyBack);
        fiftyBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.engFiftyImage);
                noteImage.setImageResource(R.drawable.e_fifty_back_v3);

                TextView fiftyBack1 = findViewById(R.id.FiftyFront);
                fiftyBack1.setTextSize(20);

                TextView fiftyFront1 = findViewById(R.id.FiftyBack);
                fiftyFront1.setTextSize(30);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.INVISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.VISIBLE);
            }
        });

        /*
        ImageView frontOn = findViewById(R.id.front);
        frontOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView frontOn1 = findViewById(R.id.front);
                frontOn1.setImageResource(R.drawable.front_on);

                ImageView backOff1 = findViewById(R.id.back);
                backOff1.setImageResource(R.drawable.back_off);

                ImageView noteImage = findViewById(R.id.engFiftyImage);
                noteImage.setImageResource(R.drawable.e_fifty_front_v3);

                ScrollView frontOnMain1 = findViewById(R.id.frontMain1);
                frontOnMain1.setVisibility(View.VISIBLE);

                ScrollView frontOnMain2 = findViewById(R.id.frontMain2);
                frontOnMain2.setVisibility(View.INVISIBLE);
            }
        });

        ImageView backOn = findViewById(R.id.back);
        backOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView frontOn = findViewById(R.id.front);
                frontOn.setImageResource(R.drawable.front_off);

                ImageView backOff = findViewById(R.id.back);
                backOff.setImageResource(R.drawable.back_on);

                ImageView noteImage = findViewById(R.id.engFiftyImage);
                noteImage.setImageResource(R.drawable.e_fifty_front_v3);

                ScrollView frontOnMain1 = findViewById(R.id.frontMain1);
                frontOnMain1.setVisibility(View.VISIBLE);

                ScrollView frontOnMain2 = findViewById(R.id.frontMain2);
                frontOnMain2.setVisibility(View.INVISIBLE);
            }
        });
        */

    }
}
