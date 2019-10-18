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
        TextView sTenP = findViewById(R.id.STenP);
        TextView sTwentyP = findViewById(R.id.STwentyP);
        TextView sFiftyP = findViewById(R.id.SFiftyP);
        TextView sHunP = findViewById(R.id.SHunP);


        sFiveP.setPaintFlags(sFiveP.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        sTenP.setPaintFlags(sFiveP.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        sTwentyP.setPaintFlags(sFiveP.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        sFiftyP.setPaintFlags(sFiveP.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        sHunP.setPaintFlags(sFiveP.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

    }
}
