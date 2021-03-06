package com.netfi.banknotechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class NIreland_UB_Ten extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nireland_ub_ten);

        TextView tenFront = findViewById(R.id.niUbTenFront);
        tenFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.niUbTenImage);
                noteImage.setImageResource(R.drawable.ni_ub_ten_front);

                TextView tenBack1 = findViewById(R.id.niUbTenFront);
                tenBack1.setTextSize(30);

                TextView tenFront1 = findViewById(R.id.niUbTenBack);
                tenFront1.setTextSize(20);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.VISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.INVISIBLE);
            }
        });

        TextView tenBack = findViewById(R.id.niUbTenBack);
        tenBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.niUbTenImage);
                noteImage.setImageResource(R.drawable.ni_ub_ten_back);

                TextView tenBack1 = findViewById(R.id.niUbTenFront);
                tenBack1.setTextSize(20);

                TextView tenFront1 = findViewById(R.id.niUbTenBack);
                tenFront1.setTextSize(30);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.INVISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.VISIBLE);
            }
        });
    }
}
