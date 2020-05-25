package com.example.banknotechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class NIreland_UB_Five extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nireland_ub_five);

        TextView fiverFront = findViewById(R.id.niUbFiverFront);
        fiverFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.niUbFiverImage);
                noteImage.setImageResource(R.drawable.ni_ub_five_front);

                TextView fiverBack1 = findViewById(R.id.niUbFiverFront);
                fiverBack1.setTextSize(30);

                TextView fiverFront1 = findViewById(R.id.niUbFiverBack);
                fiverFront1.setTextSize(20);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.VISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.INVISIBLE);
            }
        });

        TextView fiverBack = findViewById(R.id.niUbFiverBack);
        fiverBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.niUbFiverImage);
                noteImage.setImageResource(R.drawable.ni_ub_five_back);

                TextView fiverBack1 = findViewById(R.id.niUbFiverFront);
                fiverBack1.setTextSize(20);

                TextView fiverFront1 = findViewById(R.id.niUbFiverBack);
                fiverFront1.setTextSize(30);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.INVISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.VISIBLE);
            }
        });
    }
}
