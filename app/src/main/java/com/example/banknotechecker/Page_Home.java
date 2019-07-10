package com.example.banknotechecker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Page_Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_home);

        //Open England Page
        ImageView eng = findViewById(R.id.engButton);
        eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pageEng = new Intent(Page_Home.this, Page_England.class);
                startActivity(pageEng);
            }
        });

        //Open Scotland page
        ImageView scot = findViewById(R.id.scotButton);
        scot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pageScot = new Intent(Page_Home.this, Page_Scotland.class);
                startActivity(pageScot);
            }
        });

    }




}
