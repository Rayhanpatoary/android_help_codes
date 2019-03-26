package com.example.rayhanpatoary.pdfviewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdf2 extends AppCompatActivity {

    PDFView cv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf2);
        cv2 = (PDFView)findViewById(R.id.cv2);
        cv2.fromAsset("mazed_cv.pdf").load();
    }
}
