package com.example.testdemo.gson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.testdemo.R;

public class AdGsonActivirt extends AppCompatActivity {

    private Button button;
    private TextView textView;

    private GsonUtil gsonUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_gson_activirt);

        gsonUtil = new GsonUtil();

        button = findViewById(R.id.ac_agson_btn);
        textView = findViewById(R.id.ac_agson_tv);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}