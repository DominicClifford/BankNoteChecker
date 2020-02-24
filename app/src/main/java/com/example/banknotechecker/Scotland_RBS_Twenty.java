package com.example.banknotechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class Scotland_RBS_Twenty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scotland_rbs_twenty);

        TextView twentyFront = findViewById(R.id.sRbsTwentyFront);
        twentyFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.sRbsTwentyImage);
                noteImage.setImageResource(R.drawable.s_rbs_twenty_front);

                TextView fiverBack1 = findViewById(R.id.sRbsTwentyFront);
                fiverBack1.setTextSize(30);

                TextView fiverFront1 = findViewById(R.id.sRbsTwentyBack);
                fiverFront1.setTextSize(20);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.VISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.INVISIBLE);
            }
        });

        TextView twentyBack = findViewById(R.id.sRbsTwentyBack);
        twentyBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.sRbsTwentyImage);
                noteImage.setImageResource(R.drawable.s_rbs_twenty_back);

                TextView fiverBack1 = findViewById(R.id.sRbsTwentyFront);
                fiverBack1.setTextSize(20);

                TextView fiverFront1 = findViewById(R.id.sRbsTwentyBack);
                fiverFront1.setTextSize(30);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.INVISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.VISIBLE);
            }
        });

    }
}
