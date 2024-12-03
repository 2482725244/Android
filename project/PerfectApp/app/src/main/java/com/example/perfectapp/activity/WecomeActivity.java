package com.example.perfectapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.perfectapp.R;
import com.example.perfectapp.adapter.IndexViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class WecomeActivity extends AppCompatActivity implements View.OnClickListener {

    private List<View> views;
    private ViewPager viewPager;
    private View bv1,bv2,bv3,bv4,bv5,bv6;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wecome);

        initView();
        initViews();
        initBV();
        initViewPager();


    }

    private void initBV() {
        bv6 = bv1;
        bv6.setSelected(true);

        bv1.setOnClickListener(this);
        bv2.setOnClickListener(this);
        bv3.setOnClickListener(this);
        bv4.setOnClickListener(this);
        bv5.setOnClickListener(this);

    }

    private void initViewPager() {
        viewPager.setAdapter(new IndexViewPagerAdapter(views));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                bv6.setSelected(false);
                switch (position){
                    case 0:
                        bv6 = bv1;
                        bv6.setSelected(true);
                        break;
                    case 1:
                        bv6 = bv2;
                        bv6.setSelected(true);
                        break;
                    case 2:
                        bv6 = bv3;
                        bv6.setSelected(true);
                        break;
                    case 3:
                        bv6 = bv4;
                        bv6.setSelected(true);
                        break;
                    case 4:
                        bv6 = bv5;
                        bv6.setSelected(true);
                        break;


                }



            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initViews() {
        views = new ArrayList<>();

        View v1 = LayoutInflater.from(this).inflate(R.layout.view_welcom_f1,null);
        View v2 = LayoutInflater.from(this).inflate(R.layout.view_welcom_f2,null);
        View v3 = LayoutInflater.from(this).inflate(R.layout.view_welcom_f3,null);
        View v4 = LayoutInflater.from(this).inflate(R.layout.view_welcom_f4,null);
        View v5 = LayoutInflater.from(this).inflate(R.layout.view_welcom_f5,null);

        Button b1 = v5.findViewById(R.id.ac_we_inbtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WecomeActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Button b2 = v5.findViewById(R.id.ac_we_wbtn);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WecomeActivity.this,InternetSetActivity.class);
                startActivity(intent);
            }
        });



        views.add(v1);
        views.add(v2);
        views.add(v3);
        views.add(v4);
        views.add(v5);

    }

    private void initView() {
        viewPager = findViewById(R.id.ac_welcom_vp);

        bv1 = findViewById(R.id.ac_wel_bv1);
        bv2 = findViewById(R.id.ac_wel_bv2);
        bv3 = findViewById(R.id.ac_wel_bv3);
        bv4 = findViewById(R.id.ac_wel_bv4);
        bv5 = findViewById(R.id.ac_wel_bv5);


    }

    @Override
    public void onClick(View view) {

        bv6.setSelected(false);
        switch (view.getId()){
            case R.id.ac_wel_bv1:

                bv6 = bv1;
                bv6.setSelected(true);
                viewPager.setCurrentItem(0);
                break;
            case R.id.ac_wel_bv2:
                bv6 = bv2;
                bv6.setSelected(true);
                viewPager.setCurrentItem(1);
                break;
            case R.id.ac_wel_bv3:
                bv6 = bv3;
                bv6.setSelected(true);
                viewPager.setCurrentItem(2);
                break;
            case R.id.ac_wel_bv4:
                bv6 = bv4;
                bv6.setSelected(true);
                viewPager.setCurrentItem(3);
                break;
            case R.id.ac_wel_bv5:
                bv6 = bv5;
                bv6.setSelected(true);
                viewPager.setCurrentItem(4);
                break;


        }
    }
}
