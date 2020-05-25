package com.netfi.banknotechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class Scotland_CB_Twenty_P extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scotland_cb_twenty_p);

        TextView twentypFront = findViewById(R.id.sCbTwentyPFront);
        twentypFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.sCbTwentyPImage);
                noteImage.setImageResource(R.drawable.s_cb_twenty_p_front);

                TextView twentypBack1 = findViewById(R.id.sCbTwentyPFront);
                twentypBack1.setTextSize(30);

                TextView twentypFront1 = findViewById(R.id.sCbTwentyPBack);
                twentypFront1.setTextSize(20);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.VISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.INVISIBLE);
            }
        });

        TextView twentypBack = findViewById(R.id.sCbTwentyPBack);
        twentypBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.sCbTwentyPImage);
                noteImage.setImageResource(R.drawable.s_cb_twenty_p_back);

                TextView twentypBack1 = findViewById(R.id.sCbTwentyPFront);
                twentypBack1.setTextSize(20);

                TextView twentypFront1 = findViewById(R.id.sCbTwentyPBack);
                twentypFront1.setTextSize(30);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.INVISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.VISIBLE);
            }
        });
    }
}
