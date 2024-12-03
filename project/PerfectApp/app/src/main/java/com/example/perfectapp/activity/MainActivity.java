package com.example.perfectapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.perfectapp.R;
import com.example.perfectapp.adapter.MainViewPager2Adapter;
import com.example.perfectapp.fragment.AllFragment;
import com.example.perfectapp.fragment.IndexFragment;
import com.example.perfectapp.fragment.MeFragment;
import com.example.perfectapp.fragment.NewPagerFragment;
import com.example.perfectapp.fragment.ZhiHuiFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout l1,l2,l3,l4,l5;
    private ImageView i1,i2,i3,i4,i5,i6;
    private ViewPager2 viewPager2;
    private Fragment indexfragment,allfragment,zhihuifragment,newpagefragment,mefragment;
    private List<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initFragmens();
        initViewPager2();
        initLinealayoutBottom();

    }


    private void initLinealayoutBottom() {

        l1.setOnClickListener(this);
        l2.setOnClickListener(this);
        l3.setOnClickListener(this);
        l4.setOnClickListener(this);
        l5.setOnClickListener(this);


    }

    private void initViewPager2() {

        viewPager2.setAdapter(new MainViewPager2Adapter(getSupportFragmentManager(),getLifecycle(),fragments));

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);

                i6.setSelected(false);
                switch (position){
                    case 0:
                        i6 = i1;
                        i6.setSelected(true);
                        break;
                    case 1:
                        i6 = i2;
                        i6.setSelected(true);
                        break;
                    case 2:
                        i6 = i3;
                        i6.setSelected(true);
                        break;
                    case 3:
                        i6 = i4;
                        i6.setSelected(true);
                        break;
                    case 4:
                        i6 = i5;
                        i6.setSelected(true);
                        break;
                }
            }
        });
    }

    private void initFragmens() {
        fragments = new ArrayList<>();

        indexfragment = new IndexFragment();
        allfragment = new AllFragment();
        zhihuifragment = new ZhiHuiFragment();
        newpagefragment = new NewPagerFragment();
        mefragment = new MeFragment();

        fragments.add(indexfragment);
        fragments.add(allfragment);
        fragments.add(zhihuifragment);
        fragments.add(newpagefragment);
        fragments.add(mefragment);


    }

    private void initView() {
        l1 = findViewById(R.id.ac_main_bootom_l1);
        l2 = findViewById(R.id.ac_main_bootom_l2);
        l3 = findViewById(R.id.ac_main_bootom_l3);
        l4 = findViewById(R.id.ac_main_bootom_l4);
        l5 = findViewById(R.id.ac_main_bootom_l5);

        i1 = findViewById(R.id.ac_main_bootom_i1);
        i2 = findViewById(R.id.ac_main_bootom_i2);
        i3 = findViewById(R.id.ac_main_bootom_i3);
        i4 = findViewById(R.id.ac_main_bootom_i4);
        i5 = findViewById(R.id.ac_main_bootom_i5);
        i6 = i1;
        i6.setSelected(true);

        viewPager2 = findViewById(R.id.ac_main_vp2);
    }

    @Override
    public void onClick(View view) {

        i6.setSelected(false);
        switch (view.getId()){
            case R.id.ac_main_bootom_l1:
                i6 = i1;
                i6.setSelected(true);
                viewPager2.setCurrentItem(0);
                break;
            case R.id.ac_main_bootom_l2:
                i6 = i2;
                i6.setSelected(true);
                viewPager2.setCurrentItem(1);
                break;
            case R.id.ac_main_bootom_l3:
                i6 = i3;
                i6.setSelected(true);
                viewPager2.setCurrentItem(2);
                break;
            case R.id.ac_main_bootom_l4:
                i6 = i4;
                i6.setSelected(true);
                viewPager2.setCurrentItem(3);
                break;
            case R.id.ac_main_bootom_l5:
                i6 = i5;
                i6.setSelected(true);
                viewPager2.setCurrentItem(4);
                break;
        }
    }

    public ViewPager2 getViewPager2(){
        return viewPager2;
    }

}