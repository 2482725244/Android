package com.example.perfectapp.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.perfectapp.R;

public class PersonSpeakActivity extends AppCompatActivity {

    private TextView title;
    private ImageView back;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personspeak);

        title = findViewById(R.id.topbar_tv);
        back = findViewById(R.id.topbar_back);
        button = findViewById(R.id.ac_spaek_btn);
        back.setVisibility(View.VISIBLE);

        title.setText("意见反馈");
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PersonSpeakActivity.this.finish();
            }
        });



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PersonSpeakActivity.this, "提交成功，感谢您的支持", Toast.LENGTH_SHORT).show();
                PersonSpeakActivity.this.finish();
            }
        });

    }
}