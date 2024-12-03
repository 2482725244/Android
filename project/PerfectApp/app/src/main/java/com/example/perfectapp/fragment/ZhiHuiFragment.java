package com.example.perfectapp.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.perfectapp.R;
import com.example.perfectapp.adapter.IndexViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ZhiHuiFragment extends Fragment {

    private Bundle bundle;
    private LinearLayout l1,l2,l3,l4,l5,l6,l7,l8,l9;
    private static final int WPLB = 1;
    private ViewPager viewPager;
    private List<View> views;
    private Context context;
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            if (msg.what == WPLB){
                viewPager.setCurrentItem(msg.arg1);
            }
        }
    };
    private View rootView;
    private TextView textView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(rootView == null){
            rootView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_zhihui,null);
        }
        context = rootView.getContext();
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView();
        initViews();
        initViewPager();
        initVPLB();
        initLinarLayoutAll();

    }

    private void initLinarLayoutAll() {

        l1 = rootView.findViewById(R.id.fra_zhihui_row1_l1);
        l2 = rootView.findViewById(R.id.fra_zhihui_row1_l2);
        l3 = rootView.findViewById(R.id.fra_zhihui_row1_l3);
        l4 = rootView.findViewById(R.id.fra_zhihui_row2_l1);
        l5 = rootView.findViewById(R.id.fra_zhihui_row2_l2);
        l6 = rootView.findViewById(R.id.fra_zhihui_row2_l3);
        l7 = rootView.findViewById(R.id.fra_zhihui_row3_l1);
        l8 = rootView.findViewById(R.id.fra_zhihui_row3_l2);
        l9 = rootView.findViewById(R.id.fra_zhihui_row3_l3);

        LinealyoutAllClickListen linealyoutAllClickListen = new LinealyoutAllClickListen();

        l1.setOnClickListener(linealyoutAllClickListen);
        l2.setOnClickListener(linealyoutAllClickListen);
        l3.setOnClickListener(linealyoutAllClickListen);
        l4.setOnClickListener(linealyoutAllClickListen);
        l5.setOnClickListener(linealyoutAllClickListen);
        l6.setOnClickListener(linealyoutAllClickListen);
        l7.setOnClickListener(linealyoutAllClickListen);
        l8.setOnClickListener(linealyoutAllClickListen);
        l9.setOnClickListener(linealyoutAllClickListen);

    }

    private void initVPLB() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;

                while (true){
                    Message message = new Message();
                    message.what = WPLB;
                    message.arg1 = i%3;
                    handler.sendMessage(message);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    i++;
                }

            }
        }).start();

    }

    private void initViewPager() {
        viewPager.setAdapter(new IndexViewPagerAdapter(views));

    }

    private void initViews() {
        views = new ArrayList<>();

        View v1 = LayoutInflater.from(getContext()).inflate(R.layout.view_zhihui_vp1,null);
        View v2 = LayoutInflater.from(getContext()).inflate(R.layout.view_zhihui_vp2,null);
        View v3 = LayoutInflater.from(getContext()).inflate(R.layout.view_zhihui_vp3,null);

        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "未找到跳转页面", Toast.LENGTH_SHORT).show();
            }
        });
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "未找到跳转页面", Toast.LENGTH_SHORT).show();
            }
        });
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "未找到跳转页面", Toast.LENGTH_SHORT).show();
            }
        });

        views.add(v1);
        views.add(v2);
        views.add(v3);

    }

    private void initView() {
        textView = rootView.findViewById(R.id.topbar_tv);
        textView.setText("智慧党建");

        viewPager = rootView.findViewById(R.id.fra_zhihui_vp);
    }

    class LinealyoutAllClickListen implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.fra_zhihui_row1_l1:
                    Toast.makeText(context, "r1l1", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fra_zhihui_row1_l2:
                    Toast.makeText(context, "r1l2", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fra_zhihui_row1_l3:
                    Toast.makeText(context, "r1l3", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fra_zhihui_row2_l1:
                    Toast.makeText(context, "r2l1", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fra_zhihui_row2_l2:
                    Toast.makeText(context, "r2l2", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fra_zhihui_row2_l3:
                    Toast.makeText(context, "r2l3", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fra_zhihui_row3_l1:
                    Toast.makeText(context, "r3l1", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fra_zhihui_row3_l2:
                    Toast.makeText(context, "r3l2", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fra_zhihui_row3_l3:
                    Toast.makeText(context, "r3l3", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }
}
