package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class myplant_quest extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myplant_quest);
    }



}

//public class myplant_quest_in extends AppCompatActivity {
    //@Override
    //protected void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_myplant_quest);
        //다이얼로그 밖의 화면은 흐리게 만들어줌
        //WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        //layoutParams.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        //layoutParams.dimAmount = 0.8f;
        //getWindow().setAttributes(layoutParams);

    //}


    //public void btnOnclick(View view) {
        //switch (view.getId()) {
            //case R.id.button10:
                //CustomDialog = new CustomDialog(this,"다이어로그에 들어갈 내용입니다.");
                //CustomDialog.show();
                //break;

        //}
    //}
//}