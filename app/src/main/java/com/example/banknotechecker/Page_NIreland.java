package com.example.banknotechecker;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Page_NIreland extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_nireland);

        TextView niFiveP = findViewById(R.id.NiFiveP);
        TextView niTenP = findViewById(R.id.NiTenP);
        TextView niTwentyP = findViewById(R.id.NiTwentyP);
        TextView niFiftyP = findViewById(R.id.NiFiftyP);
        TextView niHunP = findViewById(R.id.NiHunP);


        niFiveP.setPaintFlags(niFiveP.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        niTenP.setPaintFlags(niTenP.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        niTwentyP.setPaintFlags(niTwentyP.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        niFiftyP.setPaintFlags(niFiftyP.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        niHunP.setPaintFlags(niHunP.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);



    }
}
