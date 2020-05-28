package com.netfi.banknotechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class NIreland_DB_Twenty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nireland_db_twenty);

        TextView twentyFront = findViewById(R.id.niDbTwentyFront);
        twentyFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.niDbTwentyImage);
                noteImage.setImageResource(R.drawable.ni_db_twenty_front);

                TextView twentyBack1 = findViewById(R.id.niDbTwentyFront);
                twentyBack1.setTextSize(30);

                TextView twentyFront1 = findViewById(R.id.niDbTwentyBack);
                twentyFront1.setTextSize(20);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.VISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.INVISIBLE);
            }
        });

        TextView twentyBack = findViewById(R.id.niDbTwentyBack);
        twentyBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.niDbTwentyImage);
                noteImage.setImageResource(R.drawable.ni_db_twenty_back);

                TextView twentyBack1 = findViewById(R.id.niDbTwentyFront);
                twentyBack1.setTextSize(20);

                TextView twentyFront1 = findViewById(R.id.niDbTwentyBack);
                twentyFront1.setTextSize(30);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.INVISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.VISIBLE);
            }
        });
    }
}
