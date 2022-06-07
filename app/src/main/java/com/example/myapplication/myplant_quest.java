package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class myplant_quest extends AppCompatActivity {
        @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myplant_quest);

            Button CustomD_btn = (Button) findViewById(R.id.button11);
            CustomD_btn.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),Custom_Dialog.class);
                    startActivity(intent);
                }
            });
            Button CustomD_btn1_btn = (Button) findViewById(R.id.button12);
            CustomD_btn1_btn.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),Custom_Dialog.class);
                    startActivity(intent);
                }
            });
            Button CustomD_btn2_btn = (Button) findViewById(R.id.button13);
            CustomD_btn2_btn.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),Custom_Dialog.class);
                    startActivity(intent);
                }
            });

            Button CustomD_btn3_btn = (Button) findViewById(R.id.button17);
            CustomD_btn3_btn.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),Custom_Dialog.class);
                    startActivity(intent);
                }
            });
            Button myplantgram_info_btn = (Button) findViewById(R.id.button19);
            myplantgram_info_btn.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),plantgram.class);
                    startActivity(intent);
                }
            });

            Button information_info_btn = (Button) findViewById(R.id.button18);
            information_info_btn.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Intent intent = new Intent(getApplicationContext(), information.class);
                    startActivity(intent);
                }
            });
    }
}


