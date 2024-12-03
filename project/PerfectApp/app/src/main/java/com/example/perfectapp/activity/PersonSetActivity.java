package com.example.perfectapp.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.perfectapp.R;

public class PersonSetActivity extends AppCompatActivity {

    private TextView title;
    private ImageView back;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personset);

        title = findViewById(R.id.topbar_tv);
        back = findViewById(R.id.topbar_back);
        button = findViewById(R.id.ac_set_btn);
        back.setVisibility(View.VISIBLE);

        title.setText("修改密码");
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PersonSetActivity.this.finish();
            }
        });



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PersonSetActivity.this, "修改成功", Toast.LENGTH_SHORT).show();
                PersonSetActivity.this.finish();
            }
        });
    }
}