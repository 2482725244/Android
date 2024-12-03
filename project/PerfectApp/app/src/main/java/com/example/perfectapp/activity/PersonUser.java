package com.example.perfectapp.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.perfectapp.R;

public class PersonUser extends AppCompatActivity {

    private TextView title;
    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personuser);

        title = findViewById(R.id.topbar_tv);
        back = findViewById(R.id.topbar_back);
        back.setVisibility(View.VISIBLE);

        title.setText("账户");
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PersonUser.this.finish();
            }
        });
    }
}