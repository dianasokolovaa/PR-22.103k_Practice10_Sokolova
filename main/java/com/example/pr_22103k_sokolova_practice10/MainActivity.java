package com.example.pr_22103k_sokolova_practice10;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Picture;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Draw2D draw2D = new Draw2D(this);
//        setContentView(draw2D);
        MyPicture myPicture = new MyPicture(this);
        setContentView(myPicture);
    }
}