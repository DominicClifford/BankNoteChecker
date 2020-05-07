package com.example.banknotechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class NIreland_BOI_Ten extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nireland_boi_ten);

        TextView fiverFront = findViewById(R.id.niBoiTenFront);
        fiverFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.niBoiTenImage);
                noteImage.setImageResource(R.drawable.ni_boi_ten_front);

                TextView fiverBack1 = findViewById(R.id.niBoiTenFront);
                fiverBack1.setTextSize(30);

                TextView fiverFront1 = findViewById(R.id.niBoiTenBack);
                fiverFront1.setTextSize(20);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.VISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.INVISIBLE);
            }
        });

        TextView fiverBack = findViewById(R.id.niBoiTenBack);
        fiverBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.niBoiTenImage);
                noteImage.setImageResource(R.drawable.ni_boi_ten_back);

                TextView fiverBack1 = findViewById(R.id.niBoiTenFront);
                fiverBack1.setTextSize(20);

                TextView fiverFront1 = findViewById(R.id.niBoiTenBack);
                fiverFront1.setTextSize(30);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.INVISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.VISIBLE);
            }
        });
    }
}
