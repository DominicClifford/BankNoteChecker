package com.netfi.banknotechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class Scotland_CB_Hun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scotland_cb_hun);

        TextView hunFront = findViewById(R.id.sCBHunFront);
        hunFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.sCBHunImage);
                noteImage.setImageResource(R.drawable.s_cb_hun_front);

                TextView fiverBack1 = findViewById(R.id.sCBHunFront);
                fiverBack1.setTextSize(30);

                TextView fiverFront1 = findViewById(R.id.sCBHunBack);
                fiverFront1.setTextSize(20);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.VISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.INVISIBLE);
            }
        });

        TextView hunBack = findViewById(R.id.sCBHunBack);
        hunBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView noteImage = findViewById(R.id.sCBHunImage);
                noteImage.setImageResource(R.drawable.s_cb_hun_back);

                TextView fiverBack1 = findViewById(R.id.sCBHunFront);
                fiverBack1.setTextSize(20);

                TextView fiverFront1 = findViewById(R.id.sCBHunBack);
                fiverFront1.setTextSize(30);

                ScrollView frontMain1 = findViewById(R.id.frontMain1);
                frontMain1.setVisibility(View.INVISIBLE);

                ScrollView frontMain2 = findViewById(R.id.frontMain2);
                frontMain2.setVisibility(View.VISIBLE);
            }
        });
    }
}
