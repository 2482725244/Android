package com.example.testdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class StartActivity extends AppCompatActivity {
    private ViewPager vp;
    private List<View> views;
    private View v1,v2,v3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        views = new ArrayList<>();

        v1 = LayoutInflater.from(this).inflate(R.layout.index_view,null);
        v2 = LayoutInflater.from(this).inflate(R.layout.index_view2,null);
        v3 = LayoutInflater.from(this).inflate(R.layout.index_view3,null);

        v3.findViewById(R.id.index3_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

        views.add(v1);
        views.add(v2);
        views.add(v3);

        vp = findViewById(R.id.ac_start_vp);
        vp.setAdapter(new Vp1Adapater(views,this));


    }
}
