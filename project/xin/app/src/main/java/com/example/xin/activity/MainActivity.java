package com.example.xin.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.xin.R;
import com.example.xin.adapter.ViewpagerAdapter;
import com.example.xin.fragment.DiaFragment;
import com.example.xin.fragment.IndexFragment;
import com.example.xin.fragment.MeFragment;
import com.example.xin.fragment.SpaFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private List<Fragment> mlist;
    private ViewPager2 vp2;
    private LinearLayout l1,l2,l3,l4;
    private ImageView i1,i2,i3,i4,i5,tp_i;
    private TextView t1,t2,t3,t4,tp_t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件
        initlaControl();
        //初始化FrgmentList
        initFragmentList();
        //使用头部控件
        //useTopbarControl();
        //使用viewpager
        useViewpagerControl();
        //bottom和view pager联动
        clickBottomandviewpager();
        //bottom和viewpager反联动
        movePagerAndBottom();



    }

    private void movePagerAndBottom() {
       vp2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
           @Override
           public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
               super.onPageScrolled(position, positionOffset, positionOffsetPixels);
           }

           @Override
           public void onPageSelected(int position) {
               super.onPageSelected(position);

               i5.setSelected(false);

               switch (position){
                   case 0:
                       i1.setSelected(true);
                       i5 = i1;
                       break;

                   case 1:
                       i2.setSelected(true);
                       i5 = i2;
                       break;

                   case 2:
                       i3.setSelected(true);
                       i5 = i3;
                       break;

                   case 3:
                       i4.setSelected(true);
                       i5 = i4;
                       break;

               }
           }
       });
    }

    private void clickBottomandviewpager() {

        i1.setSelected(true);
        i5 = i1;

        l1.setOnClickListener(this);
        l2.setOnClickListener(this);
        l3.setOnClickListener(this);
        l4.setOnClickListener(this);


    }

    private void initFragmentList() {
        mlist =new ArrayList<Fragment>();
        mlist.add(new IndexFragment());
        mlist.add(new DiaFragment());
        mlist.add(new SpaFragment());
        mlist.add(new MeFragment());
    }

    private void useViewpagerControl() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        ViewpagerAdapter viewpagerAdapter = new ViewpagerAdapter(fragmentManager,getLifecycle(),mlist);
        vp2.setAdapter(viewpagerAdapter);

    }

    private void useTopbarControl() {
        //tp_t.setText("首页");
    }

    private void initlaControl() {
        vp2 = findViewById(R.id.main_viewpager);

        l1 = findViewById(R.id.main_bottom1);
        l2 = findViewById(R.id.main_bottom2);
        l3 = findViewById(R.id.main_bottom3);
        l4 = findViewById(R.id.main_bottom4);

        i1 = findViewById(R.id.main_bottm_iv1);
        i2 = findViewById(R.id.main_bottm_iv2);
        i3 = findViewById(R.id.main_bottm_iv3);
        i4 = findViewById(R.id.main_bottm_iv4);

        //tp_i = findViewById(R.id.topbar_iv);
        //tp_t = findViewById(R.id.top_tv);

    }

    @Override
    public void onClick(View view) {

        i5.setSelected(false);

        switch (view.getId()){
            case R.id.main_bottom1:
                i1.setSelected(true);
                i5 = i1;
                vp2.setCurrentItem(0);
                break;

            case R.id.main_bottom2:
                i2.setSelected(true);
                i5 = i2;
                vp2.setCurrentItem(1);

                break;

            case R.id.main_bottom3:
                i3.setSelected(true);
                i5 = i3;
                vp2.setCurrentItem(2);

                break;

            case R.id.main_bottom4:
                i4.setSelected(true);
                i5 = i4;
                vp2.setCurrentItem(3);

                break;

        }
    }
}