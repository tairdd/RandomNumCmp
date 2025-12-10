package com.example.randomnumcmp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    //tvs and btns
    TextView tvNum1, tvNum2, tvResult;
    Button btnGenerate, btnGreater, btnLess, btnEqual;

    //vars
    int num1 = 0, num2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find ids
        tvNum1 = findViewById(R.id.tvNum1);
        tvNum2 = findViewById(R.id.tvNum2);
        tvResult = findViewById(R.id.tvResult);

        btnGenerate = findViewById(R.id.btnGenerate);
        btnGreater = findViewById(R.id.btnGreater);
        btnLess = findViewById(R.id.btnLess);
        btnEqual = findViewById(R.id.btnEqual);

        btnGenerate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //gen random numbers and set it in tvs
                Random rnd = new Random();
                num1 = rnd.nextInt(1000);
                num2 = rnd.nextInt(1000);

                tvNum1.setText(String.valueOf(num1));
                tvNum2.setText(String.valueOf(num2));
            }
        });

        btnGreater.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tvResult.setText(num1 > num2 ? "True" : "False"); //check if greater
            }
        });

        btnLess.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tvResult.setText(num1 < num2 ? "True" : "False"); //check if smaller
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                tvResult.setText(num1 == num2 ? "True" : "False"); //check if equal
            }
        });
    }
}