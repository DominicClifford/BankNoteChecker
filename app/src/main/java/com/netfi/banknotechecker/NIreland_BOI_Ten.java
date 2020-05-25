package com.netfi.banknotechecker;

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

        TextView tenFront = findViewById(R.id.niBoiTenFront);
        tenFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.niBoiTenImage);
                noteImage.setImageResource(R.drawable.ni_boi_ten_front);

                TextView tenBack1 = findViewById(R.id.niBoiTenFront);
                tenBack1.setTextSize(30);

                TextView tenFront1 = findViewById(R.id.niBoiTenBack);
                tenFront1.setTextSize(20);

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

                TextView tenBack1 = findViewById(R.id.niBoiTenFront);
                tenBack1.setTextSize(20);

                TextView tenFront1 = findViewById(R.id.niBoiTenBack);
                tenFront1.setTextSize(30);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.INVISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.VISIBLE);
            }
        });
    }
}
