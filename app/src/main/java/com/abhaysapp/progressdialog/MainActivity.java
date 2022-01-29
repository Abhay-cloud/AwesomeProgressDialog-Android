package com.abhaysapp.progressdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);

        CustomDialog customDialog = new CustomDialog(MainActivity.this);
        customDialog.setStyle(CustomDialog.STYLE_LOADING_WHEEL);
        customDialog.addTitle("Simple Loading...");
        customDialog.hideTitle();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customDialog.showDialog();
            }
        });


    }
}