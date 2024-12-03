package com.example.testdemo.testgson;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.testdemo.R;

import java.lang.reflect.Type;

public class TestGson1 extends AppCompatActivity {

    private TextView textView;

    private String s = "";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_test);

        textView = findViewById(R.id.TestJson_tv);

        String sNext = PathJson(s);

        textView.setText(sNext);
    }

    private String PathJson(String s) {
        return "";
    }
}
