package com.netfi.banknotechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class NIreland_BOI_Twenty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nireland_boi_twenty);

        TextView fiverFront = findViewById(R.id.niBoiTwentyFront);
        fiverFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.niBoiTwentyImage);
                noteImage.setImageResource(R.drawable.ni_boi_twenty_front);

                TextView twentyBack1 = findViewById(R.id.niBoiTwentyFront);
                twentyBack1.setTextSize(30);

                TextView twentyFront1 = findViewById(R.id.niBoiTwentyBack);
                twentyFront1.setTextSize(20);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.VISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.INVISIBLE);
            }
        });

        TextView fiverBack = findViewById(R.id.niBoiTwentyBack);
        fiverBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.niBoiTwentyImage);
                noteImage.setImageResource(R.drawable.ni_boi_twenty_back);

                TextView twentyBack1 = findViewById(R.id.niBoiTwentyFront);
                twentyBack1.setTextSize(20);

                TextView twentyFront1 = findViewById(R.id.niBoiTwentyBack);
                twentyFront1.setTextSize(30);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.INVISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.VISIBLE);
            }
        });
    }
}
