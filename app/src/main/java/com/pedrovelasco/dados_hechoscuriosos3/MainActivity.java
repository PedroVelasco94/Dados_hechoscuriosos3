package com.pedrovelasco.dados_hechoscuriosos3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView factnum = (TextView) findViewById(R.id.textView);
        Button b4 = (Button) findViewById(R.id.btn_4);
        Button b6 = (Button) findViewById(R.id.btn_6);
        Button b8 = (Button) findViewById(R.id.btn_8);
        Button b10 = (Button) findViewById(R.id.btn_10);
        Button b20 = (Button) findViewById(R.id.btn_20);
        Button b12 = (Button) findViewById(R.id.btn_12);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = "";
                Random randomGenenerator = new Random();
                int randomNumber = randomGenenerator.nextInt(4);
                num = Integer.toString(randomNumber+ 1);
                factnum.setText(num);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = "";
                Random randomGenenerator = new Random();
                int randomNumber = randomGenenerator.nextInt(6);
                num = Integer.toString(randomNumber+ 1);
                factnum.setText(num);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = "";
                Random randomGenenerator = new Random();
                int randomNumber = randomGenenerator.nextInt(8);
                num = Integer.toString(randomNumber+ 1);
                factnum.setText(num);
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = "";
                Random randomGenenerator = new Random();
                int randomNumber = randomGenenerator.nextInt(10);
                num = Integer.toString(randomNumber+ 1);
                factnum.setText(num);
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = "";
                Random randomGenenerator = new Random();
                int randomNumber = randomGenenerator.nextInt(12);
                num = Integer.toString(randomNumber+ 1);
                factnum.setText(num);
            }
        });

        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = "";
                Random randomGenenerator = new Random();
                int randomNumber = randomGenenerator.nextInt(20);
                num = Integer.toString(randomNumber+ 1);
                factnum.setText(num);
            }
        });







    }
}
