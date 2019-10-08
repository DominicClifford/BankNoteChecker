package com.example.banknotechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class England_Ten extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.england_ten);


        TextView tennerFront = findViewById(R.id.TenFront);
        tennerFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.engTenImage);
                noteImage.setImageResource(R.drawable.e_ten_front);

                TextView tennerBack1 = findViewById(R.id.TenFront);
                tennerBack1.setTextSize(30);

                TextView tennerFront1 = findViewById(R.id.TenBack);
                tennerFront1.setTextSize(20);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.VISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.INVISIBLE);
            }
        });

        TextView tennerBack = findViewById(R.id.TenBack);
        tennerBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.engTenImage);
                noteImage.setImageResource(R.drawable.e_ten_back);

                TextView tennerBack1 = findViewById(R.id.TenFront);
                tennerBack1.setTextSize(20);

                TextView tennerFront1 = findViewById(R.id.TenBack);
                tennerFront1.setTextSize(30);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.INVISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.VISIBLE);
            }
        });

    }
}
