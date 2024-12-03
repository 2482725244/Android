package com.example.perfectapp.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.perfectapp.R;

public class PersonShopingActivity extends AppCompatActivity {

    private TextView title;
    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personshoping);

        title = findViewById(R.id.topbar_tv);
        back = findViewById(R.id.topbar_back);
        back.setVisibility(View.VISIBLE);

        title.setText("订单");
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PersonShopingActivity.this.finish();
            }
        });
    }
}