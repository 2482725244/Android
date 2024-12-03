package com.example.myapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.example.myapp.R;
import com.example.myapp.adapater.IndexViewPagerAdapater;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewPager viewPager;
    private Button bLogin,bRegister;
    private View v1,v2,v3,v4,v5;
    private List<View> views;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        viewOnClick();
        initviews();
        initViewPager();

    }

    private void viewOnClick() {

        bLogin = v5.findViewById(R.id.ac_index_login);
        bRegister = v5.findViewById(R.id.ac_index_register);

        bLogin.setOnClickListener(this);
        bRegister.setOnClickListener(this);

    }

    private void initView() {
        v1 = LayoutInflater.from(this).inflate(R.layout.index_vp1,null);
        v2 = LayoutInflater.from(this).inflate(R.layout.index_vp2,null);
        v3 = LayoutInflater.from(this).inflate(R.layout.index_vp3,null);
        v4 = LayoutInflater.from(this).inflate(R.layout.index_vp4,null);
        v5 = LayoutInflater.from(this).inflate(R.layout.index_vp5,null);
    }

    private void initviews() {

        views = new ArrayList<View>();
        views.add(v1);
        views.add(v2);
        views.add(v3);
        views.add(v4);
        views.add(v5);

    }

    private void initViewPager() {
        viewPager = findViewById(R.id.ac_mian_viewpage);
        IndexViewPagerAdapater indexViewPagerAdapater = new IndexViewPagerAdapater(views);
        viewPager.setAdapter(indexViewPagerAdapater);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ac_index_login:
                Intent intent1 = new Intent(this,LoginActivity.class);
                startActivity(intent1);
                break;
            case R.id.ac_index_register:
                Intent intent2 = new Intent(this,RegisterActivity.class);
                startActivity(intent2);
                break;
        }
    }
}