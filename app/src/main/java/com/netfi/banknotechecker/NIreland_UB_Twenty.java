package com.netfi.banknotechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class NIreland_UB_Twenty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nireland_ub_twenty);

        TextView twentyFront = findViewById(R.id.niUbTwentyFront);
        twentyFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.niUbTwentyImage);
                noteImage.setImageResource(R.drawable.ni_ub_twenty_front);

                TextView twentyBack1 = findViewById(R.id.niUbTwentyFront);
                twentyBack1.setTextSize(30);

                TextView twentyFront1 = findViewById(R.id.niUbTwentyBack);
                twentyFront1.setTextSize(20);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.VISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.INVISIBLE);
            }
        });

        TextView twentyBack = findViewById(R.id.niUbTwentyBack);
        twentyBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.niUbTwentyImage);
                noteImage.setImageResource(R.drawable.ni_ub_twenty_back);

                TextView twentyBack1 = findViewById(R.id.niUbTwentyFront);
                twentyBack1.setTextSize(20);

                TextView twentyFront1 = findViewById(R.id.niUbTwentyBack);
                twentyFront1.setTextSize(30);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.INVISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.VISIBLE);
            }
        });
    }
}
