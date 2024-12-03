package com.example.textproject.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.example.textproject.R;
import com.example.textproject.adapater.MyPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class StartActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private List<View> views;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        viewPager = findViewById(R.id.ac_start_vp);

        views = new ArrayList<>();

        views.add(LayoutInflater.from(this).inflate(R.layout.view_item_start,null));
        views.add(LayoutInflater.from(this).inflate(R.layout.view_item_start2,null));

        View view = LayoutInflater.from(this).inflate(R.layout.view_item_start3,null);
        Button button = view.findViewById(R.id.ac_start_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

        views.add(view);

        MyPagerAdapter myPagerAdapter= new MyPagerAdapter(views);
        viewPager.setAdapter(myPagerAdapter);




    }
}