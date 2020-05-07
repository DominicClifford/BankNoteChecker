package com.example.banknotechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class NIreland_BOI_Fifty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nireland_boi_fifty);

        TextView fiverFront = findViewById(R.id.niBoiFiftyFront);
        fiverFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.niBoiFiftyImage);
                noteImage.setImageResource(R.drawable.ni_boi_fifty_front);

                TextView fiftyBack1 = findViewById(R.id.niBoiFiftyFront);
                fiftyBack1.setTextSize(30);

                TextView fiftyFront1 = findViewById(R.id.niBoiFiftyBack);
                fiftyFront1.setTextSize(20);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.VISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.INVISIBLE);
            }
        });

        TextView fiverBack = findViewById(R.id.niBoiFiftyBack);
        fiverBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.niBoiFiftyImage);
                noteImage.setImageResource(R.drawable.ni_boi_fifty_back);

                TextView fiftyBack1 = findViewById(R.id.niBoiFiftyFront);
                fiftyBack1.setTextSize(20);

                TextView fiftyFront1 = findViewById(R.id.niBoiFiftyBack);
                fiftyFront1.setTextSize(30);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.INVISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.VISIBLE);
            }
        });
    }
}
