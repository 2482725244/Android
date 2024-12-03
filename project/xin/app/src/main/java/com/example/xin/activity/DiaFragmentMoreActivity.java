package com.example.xin.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.xin.R;
import com.example.xin.fragment.DiaMoreFragment;

public class DiaFragmentMoreActivity extends AppCompatActivity {

    private DiaMoreFragment diaMoreFragment;
    private FrameLayout frameLayout;
    private FragmentManager fragmentManager;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia_fragment_more);

        //初始化控件
        initControl();
        //获取自身bundle
        getMyBundle();
        //组装创建DiaMoreFragment对象
        setDiaMoreFragment();
        //放置/刷新 DiaMoreFragment对象
        updateDiaMoreFragment();

    }

    private void getMyBundle() {
        bundle = getIntent().getExtras();
    }

    private void updateDiaMoreFragment() {
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.activaty_diamore_framelayout,diaMoreFragment).commit();
    }

    private void setDiaMoreFragment() {
        diaMoreFragment = DiaMoreFragment.createDiaMoreFragment(bundle);
    }

    private void initControl() {
       frameLayout = findViewById(R.id.activaty_diamore_framelayout);
    }
}