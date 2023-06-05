package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class FirstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        Handler h = new Handler();
        h.postDelayed(new Runnable() {
                          @Override
                          public void run() {
                              startActivity(new Intent(FirstPage.this,FirstPage0.class));
                              finish();
                          }
                      },5000);
    }
}