package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class fav extends AppCompatActivity {
    int i = 0;
    ImageView imageview = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav);


        Button button = (Button)findViewById(R.id.button14);
        imageview = (ImageView)findViewById(R.id.imageView6);
        TextView textview = (TextView) findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int index = i % 3;

                if ( index == 0 ){
                    imageview.setImageResource(R.drawable.img_8);
                    textview.setText("아레카야자");
                }
                if (index == 1) {
                    imageview.setImageResource(R.drawable.img_9);
                    textview.setText("산세베리아");

                }if (index == 2){
                    imageview.setImageResource(R.drawable.img_10);
                    textview.setText("스투키");
                }
                i++;
            }
        });
    }

}




