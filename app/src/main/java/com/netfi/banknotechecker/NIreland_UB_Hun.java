package com.netfi.banknotechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class NIreland_UB_Hun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nireland_ub_hun);

        TextView hunFront = findViewById(R.id.niUbHunFront);
        hunFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.niUbHunImage);
                noteImage.setImageResource(R.drawable.ni_ub_hun_front);

                TextView hunBack1 = findViewById(R.id.niUbHunFront);
                hunBack1.setTextSize(30);

                TextView hunFront1 = findViewById(R.id.niUbHunBack);
                hunFront1.setTextSize(20);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.VISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.INVISIBLE);
            }
        });

        TextView hunBack = findViewById(R.id.niUbHunBack);
        hunBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.niUbHunImage);
                noteImage.setImageResource(R.drawable.ni_ub_hun_back);

                TextView hunBack1 = findViewById(R.id.niUbHunFront);
                hunBack1.setTextSize(20);

                TextView hunFront1 = findViewById(R.id.niUbHunBack);
                hunFront1.setTextSize(30);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.INVISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.VISIBLE);
            }
        });
    }
}
