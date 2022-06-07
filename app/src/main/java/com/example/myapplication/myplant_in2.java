package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class myplant_in2 extends AppCompatActivity {
    int i = 0;
    ImageView imageview = null;
    private Button shutdownClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myplant_in2);


        Button button = (Button)findViewById(R.id.button23);
        Button button1 = (Button)findViewById(R.id.button16);
        Button button2 = (Button)findViewById(R.id.button21);
        Button button3 = (Button)findViewById(R.id.button22);
        TextView textview = (TextView) findViewById(R.id.textView9);
        TextView textview1 = (TextView) findViewById(R.id.textView11);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int index = i % 3;

                if ( index == 0 ){
                    button1.setText("초보자");
                    button2.setText("경험자");
                    button3.setText("전문가");
                    textview.setText("1/3");
                    textview1.setText("식물집사가 된 지 어느정도  되셨나요?");
                }
                if (index == 1) {
                    button1.setText("실내깊이 300~500cm");
                    button2.setText("실내깊이 150~300cm");
                    button3.setText("실내깊이 50~150cm");
                    textview.setText("2/3");
                    textview1.setText("식물을 키울 곳은 햇빛이 들어오는     깊이가 어떤가요?");

                }if (index == 2){
                    button1.setText("초보자");
                    button2.setText("경험자");
                    button3.setText("전문가");
                    textview.setText("3/3");
                    textview1.setText("성장속도가                                          어떤 식물을 키우고 싶나요? ");
                }
                i++;
            }
        });



    }

}




