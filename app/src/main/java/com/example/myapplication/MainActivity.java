package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myplant_in_info_btn = (Button) findViewById(R.id.button5);
        myplant_in_info_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), mypalnt.class);
                startActivity(intent);
            }
        });
        Button fav_info_btn = (Button) findViewById(R.id.button6);
        fav_info_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), fav.class);
                startActivity(intent);
            }
        });



        Button myplant_in_info_btn2 = (Button) findViewById(R.id.button8);
        myplant_in_info_btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), plantgram.class);
                startActivity(intent);
            }
        });

        Button myplant_in_info_btn3 = (Button) findViewById(R.id.button7);
        myplant_in_info_btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), information.class);
                startActivity(intent);
            }
        });


    }

}