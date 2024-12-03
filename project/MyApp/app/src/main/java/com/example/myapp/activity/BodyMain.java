package com.example.myapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.myapp.Fragment.FindFragment;
import com.example.myapp.Fragment.IndexFragment;
import com.example.myapp.Fragment.MeFragment;
import com.example.myapp.Fragment.MoreFragmrnt;
import com.example.myapp.R;
import com.example.myapp.adapater.MyViewPager2Adapater;

import java.util.ArrayList;
import java.util.List;

public class BodyMain extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout l1,l2,l3,l4;
    private Fragment indexFragment,findFragment,meFragment,moreFragment;
    private List<Fragment> fragmens;
    private ViewPager2 viewPager2;
    private FragmentManager fragmentManager;
    private ImageView im1,im2,im3,im4,im5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_main);

        initFragmentManager();
        InitFragmens();
        initViewPager2();
        initBottom();


    }

    private void initFragmentManager() {
        fragmentManager = getSupportFragmentManager();
    }

    private void InitFragmens() {
        fragmens = new ArrayList<>();

        indexFragment = IndexFragment.createFragment();
        findFragment = FindFragment.createFragment();
        meFragment = MeFragment.createFragment();
        moreFragment = MoreFragmrnt.createFragment();

        fragmens.add(indexFragment);
        fragmens.add(findFragment);
        fragmens.add(moreFragment);
        fragmens.add(meFragment);


    }

    private void initViewPager2() {

        viewPager2 = findViewById(R.id.ac_body_vp);
        MyViewPager2Adapater myViewPager2Adapater = new MyViewPager2Adapater(fragmentManager,getLifecycle(),fragmens);
        viewPager2.setAdapter(myViewPager2Adapater);

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                im5.setSelected(false);
                switch (position){
                    case 0:
                        im5 = im1;
                        im5.setSelected(true);
                        break;
                    case 1:
                        im5 = im2;
                        im5.setSelected(true);
                        break;
                    case 2:
                        im5 = im3;
                        im5.setSelected(true);
                        break;
                    case 3:
                        im5 = im4;
                        im5.setSelected(true);
                        break;

                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });





    }

    private void initBottom() {
        l1 = findViewById(R.id.bottom_b1);
        l2 = findViewById(R.id.bottom_b2);
        l3 = findViewById(R.id.bottom_b3);
        l4 = findViewById(R.id.bottom_b4);

        im1 = findViewById(R.id.bottom_b1_iv);
        im2 = findViewById(R.id.bottom_b2_iv);
        im3 = findViewById(R.id.bottom_b3_iv);
        im4 = findViewById(R.id.bottom_b4_iv);


        im1.setSelected(true);
        im5 = im1;


        l1.setOnClickListener(this);
        l2.setOnClickListener(this);
        l3.setOnClickListener(this);
        l4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        im5.setSelected(false);

        switch (view.getId()){
            case R.id.bottom_b1:
                im5 = im1;
                im5.setSelected(true);
                viewPager2.setCurrentItem(0);
                Toast.makeText(this, "111", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bottom_b2:
                im5 = im2;
                im5.setSelected(true);
                viewPager2.setCurrentItem(1);

                Toast.makeText(this, "222", Toast.LENGTH_SHORT).show();

                break;
            case R.id.bottom_b3:
                im5 = im3;
                im5.setSelected(true);
                viewPager2.setCurrentItem(2);

                Toast.makeText(this, "333", Toast.LENGTH_SHORT).show();

                break;
            case R.id.bottom_b4:
                im5 = im4;
                im5.setSelected(true);
                viewPager2.setCurrentItem(3);

                Toast.makeText(this, "444", Toast.LENGTH_SHORT).show();

                break;

        }


    }
}