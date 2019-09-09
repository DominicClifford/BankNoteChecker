package com.example.banknotechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class England_Five extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.england_five);

        TextView fiverFront = findViewById(R.id.FiverFront);
        fiverFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.engFiverImage);
                noteImage.setImageResource(R.drawable.e_five_front);

                TextView fiverBack1 = findViewById(R.id.FiverFront);
                fiverBack1.setTextSize(30);

                TextView fiverFront1 = findViewById(R.id.FiverBack);
                fiverFront1.setTextSize(20);

                LinearLayout frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.VISIBLE);
            }
        });

        TextView fiverBack = findViewById(R.id.FiverBack);
        fiverBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.engFiverImage);
                noteImage.setImageResource(R.drawable.e_five_back);

                TextView fiverBack1 = findViewById(R.id.FiverFront);
                fiverBack1.setTextSize(20);

                TextView fiverFront1 = findViewById(R.id.FiverBack);
                fiverFront1.setTextSize(30);

                LinearLayout frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.INVISIBLE);
            }
        });


    }

}
