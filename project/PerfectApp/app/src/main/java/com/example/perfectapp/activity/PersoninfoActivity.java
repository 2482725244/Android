package com.example.perfectapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.perfectapp.R;

public class PersoninfoActivity extends AppCompatActivity {

    private TextView title;
    private ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personinfo);

        title = findViewById(R.id.topbar_tv);
        back = findViewById(R.id.topbar_back);
        back.setVisibility(View.VISIBLE);

        title.setText("个人信息");
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PersoninfoActivity.this.finish();
            }
        });


    }
}