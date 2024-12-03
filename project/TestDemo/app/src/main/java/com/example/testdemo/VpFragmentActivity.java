package com.example.testdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.example.testdemo.fragment.MyFragment1;
import com.example.testdemo.fragment.MyFragment2;
import com.example.testdemo.fragment.MyFragment3;

import java.util.ArrayList;
import java.util.List;

public class VpFragmentActivity extends AppCompatActivity implements View.OnClickListener {

    private Button b1,b2,b3;
    private ViewPager2 viewPager;
    private List<Fragment> fragments;
    private Fragment f1,f2,f3;
    private FragmentManager fragmentManager = getSupportFragmentManager();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vpfragment);

        initFragments();
        initButton();
        initViewPager();


    }

    private void initFragments() {
        fragments = new ArrayList<>();
        f1 = new MyFragment1();
        f2 = new MyFragment2();
        f3 = new MyFragment3();

        fragments.add(f1);
        fragments.add(f2);
        fragments.add(f3);


    }

    private void initViewPager() {

        viewPager = findViewById(R.id.vpac_frame);
        viewPager.setAdapter(new VpAdapater(fragmentManager,getLifecycle(),fragments));
    }

    private void initButton() {
        b1 = findViewById(R.id.acvp_bottom1);
        b2 = findViewById(R.id.acvp_bottom2);
        b3 = findViewById(R.id.acvp_bottom3);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.acvp_bottom1:
                viewPager.setCurrentItem(0);
                break;
            case R.id.acvp_bottom2:
                viewPager.setCurrentItem(1);

                break;
            case R.id.acvp_bottom3:
                viewPager.setCurrentItem(2);

                break;
        }
    }
}
