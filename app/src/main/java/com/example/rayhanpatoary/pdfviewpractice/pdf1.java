package com.example.rayhanpatoary.pdfviewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdf1 extends AppCompatActivity {

    PDFView cv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf1);
        cv1 = (PDFView)findViewById(R.id.cv1);

        cv1.fromAsset("Rayhan_SwE_t.pdf").load();
    }
}
