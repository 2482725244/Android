package com.example.perfectapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.perfectapp.R;

public class InternetSetActivity extends AppCompatActivity {

    private TextView title;
    private ImageView back;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internet_set);

        initView();
        initButton();


    }

    private void initButton() {

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(InternetSetActivity.this, "保存成功", Toast.LENGTH_SHORT).show();
                InternetSetActivity.this.finish();
            }
        });

    }

    private void initView() {

        title = findViewById(R.id.topbar_tv);
        back = findViewById(R.id.topbar_back);
        button = findViewById(R.id.ac_wel_button);



    }
}