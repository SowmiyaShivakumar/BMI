package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1;
    TextView tv;
    double final_wt,final_ht,bmi,ans,height;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
    public void onClick(View v) {
        e1=findViewById(R.id.editTextTextPersonName4);
        e2=findViewById(R.id.editTextTextPersonName5);
        String wS = e1.getText().toString();
        String hS = e2.getText().toString();
        final_wt = Double.parseDouble(wS);
        final_ht = Double.parseDouble(hS);
        height = final_ht/100;
        bmi= final_wt/(height*height);
        DecimalFormat df = new DecimalFormat("#.#");
        ans = Double.parseDouble(df.format(bmi));

        String BMI_Cat ="";
        if(bmi<18.5)
            BMI_Cat = "Underweight";
        else if(bmi>=18.5 && bmi<24.9)
            BMI_Cat = "Healthy";
        else if(bmi>=25 && bmi<29.9)
            BMI_Cat = "Overweight";
        else if(bmi>=30)
            BMI_Cat = "Obese";
        tv = findViewById(R.id.textView4);
        tv.setText(Double.toString(ans)+"-"+BMI_Cat);
            }
        });
    }
}