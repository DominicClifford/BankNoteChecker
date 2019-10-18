package com.example.banknotechecker;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Page_Scotland extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_scotland);

        TextView sFiveP = findViewById(R.id.SFiveP);
        sFiveP.setPaintFlags(sFiveP.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

    }
}
