package com.netfi.banknotechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class NIreland_UB_Fifty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nireland_ub_fifty);

        TextView fiftyFront = findViewById(R.id.niUbFiftyFront);
        fiftyFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.niUbFiftyImage);
                noteImage.setImageResource(R.drawable.ni_ub_fifty_front);

                TextView fiftyBack1 = findViewById(R.id.niUbFiftyFront);
                fiftyBack1.setTextSize(30);

                TextView fiftyFront1 = findViewById(R.id.niUbFiftyBack);
                fiftyFront1.setTextSize(20);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.VISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.INVISIBLE);
            }
        });

        TextView fiftyBack = findViewById(R.id.niUbFiftyBack);
        fiftyBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.niUbFiftyImage);
                noteImage.setImageResource(R.drawable.ni_ub_fifty_back);

                TextView fiftyBack1 = findViewById(R.id.niUbFiftyFront);
                fiftyBack1.setTextSize(20);

                TextView fiftyFront1 = findViewById(R.id.niUbFiftyBack);
                fiftyFront1.setTextSize(30);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.INVISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.VISIBLE);
            }
        });
    }
}
