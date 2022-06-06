package com.example.myapplication;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class Custom_Dialog extends Dialog {
    private TextView txt_contents;
    private Button shutdownClick;

    public Custom_Dialog(@NonNull Context context, TextView txt_contents) {
        super(context);
        this.txt_contents = txt_contents;
        setContentView(R.layout.activity_custom_dialog2);

        txt_contents = findViewById(R.id.txt_contents);
        //txt_contents.setText(contents);
        shutdownClick = findViewById(R.id.btn_shutdown);
        shutdownClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }
}
