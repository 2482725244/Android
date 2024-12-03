package com.example.perfectapp.fragment;

import android.content.Context;
import android.content.Intent;
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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.example.perfectapp.R;
import com.example.perfectapp.activity.MainActivity;
import com.example.perfectapp.adapter.IndexFragmentAdapter;
import com.example.perfectapp.adapter.IndexViewPagerAdapter;
import com.example.perfectapp.bean.NewPager;

import java.util.ArrayList;
import java.util.List;

public class IndexFragment extends Fragment {

    private Bundle bundle;
    private LinearLayout l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    private static final int WPLB = 1;
    private View rootView;
    private TextView textView;
    private ViewPager viewPager;
    private RecyclerView recyclerView;
    private List<View> views;
    private Context context;
    private ViewPager2 mainViewPager2;
    private List<NewPager> newPagerList;
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            if (msg.what == WPLB){
                viewPager.setCurrentItem(msg.arg1);
            }
        }
    };

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(rootView == null){
            rootView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_index,null);
        }
        context = rootView.getContext();
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView();
        initMainViewPager2();
        initList();
        initViews();
        initViewPager();
        initVPLB();
        initLinarLayoutAll();
        initRecycler();

    }

    private void initMainViewPager2() {
        MainActivity mainActivity = (MainActivity) getActivity();
        mainViewPager2 = mainActivity.getViewPager2();
    }

    private void initList() {
        newPagerList = new ArrayList<>();
        newPagerList.add(new NewPager(R.drawable.k1,"【登月】月全食怎么看？月球身世之谜","中国青年报客户端北京5月17电（中青报·中青网记者 邱晨辉）北京时间2023年5月17日10时49分，我国在西昌卫星发射中心用长征三号乙运载火箭，成功发射第五十六颗北斗导航卫星。该卫星属地球静止轨道卫星，是我国北斗三号工程的首颗备份卫星。入轨并完成在轨测试后，将接入北斗卫星导航系统。\n" +
                "\n" +
                "　　此次发射是北斗三号工程高密度组网之后，时隔3年的首发任务。该卫星的发射将进一步提升系统服务性能，对推广北斗系统特色服务、支撑北斗系统规模应用具有重要意义。该卫星实现了对现有地球静止轨道卫星的在轨热备份，将增强系统的可用性和稳健性，提升系统现有区域短报文通信容量三分之一，提高星基增强和精密单点定位服务性能，有助于用户实现快速高精度定位。\n" +
                "\n" +
                "　　此次发射的北斗导航卫星和配套运载火箭由中国航天科技集团有限公司所属的中国空间技术研究院和中国运载火箭技术研究院分别抓总研制。这是长征系列运载火箭的第473次发射。"));
        newPagerList.add(new NewPager(R.drawable.k2,"大豆洋葱成财富密码，数十亿美元白银骗局，期货市场是暴","中国青年报客户端北京5月17电（中青报·中青网记者 邱晨辉）北京时间2023年5月17日10时49分，我国在西昌卫星发射中心用长征三号乙运载火箭，成功发射第五十六颗北斗导航卫星。该卫星属地球静止轨道卫星，是我国北斗三号工程的首颗备份卫星。入轨并完成在轨测试后，将接入北斗卫星导航系统。\n" +
                "\n" +
                "　　此次发射是北斗三号工程高密度组网之后，时隔3年的首发任务。该卫星的发射将进一步提升系统服务性能，对推广北斗系统特色服务、支撑北斗系统规模应用具有重要意义。该卫星实现了对现有地球静止轨道卫星的在轨热备份，将增强系统的可用性和稳健性，提升系统现有区域短报文通信容量三分之一，提高星基增强和精密单点定位服务性能，有助于用户实现快速高精度定位。\n" +
                "\n" +
                "　　此次发射的北斗导航卫星和配套运载火箭由中国航天科技集团有限公司所属的中国空间技术研究院和中国运载火箭技术研究院分别抓总研制。这是长征系列运载火箭的第473次发射。"));
        newPagerList.add(new NewPager(R.drawable.k3,"中国河流详细介绍，分为九大流域片、七大水系，了解河流","中国青年报客户端北京5月17电（中青报·中青网记者 邱晨辉）北京时间2023年5月17日10时49分，我国在西昌卫星发射中心用长征三号乙运载火箭，成功发射第五十六颗北斗导航卫星。该卫星属地球静止轨道卫星，是我国北斗三号工程的首颗备份卫星。入轨并完成在轨测试后，将接入北斗卫星导航系统。\n" +
                "\n" +
                "　　此次发射是北斗三号工程高密度组网之后，时隔3年的首发任务。该卫星的发射将进一步提升系统服务性能，对推广北斗系统特色服务、支撑北斗系统规模应用具有重要意义。该卫星实现了对现有地球静止轨道卫星的在轨热备份，将增强系统的可用性和稳健性，提升系统现有区域短报文通信容量三分之一，提高星基增强和精密单点定位服务性能，有助于用户实现快速高精度定位。\n" +
                "\n" +
                "　　此次发射的北斗导航卫星和配套运载火箭由中国航天科技集团有限公司所属的中国空间技术研究院和中国运载火箭技术研究院分别抓总研制。这是长征系列运载火箭的第473次发射。"));
        newPagerList.add(new NewPager(R.drawable.k4,"北京大学陈瑞华教授讲《刑事诉讼法的证据效力》","中国青年报客户端北京5月17电（中青报·中青网记者 邱晨辉）北京时间2023年5月17日10时49分，我国在西昌卫星发射中心用长征三号乙运载火箭，成功发射第五十六颗北斗导航卫星。该卫星属地球静止轨道卫星，是我国北斗三号工程的首颗备份卫星。入轨并完成在轨测试后，将接入北斗卫星导航系统。\n" +
                "\n" +
                "　　此次发射是北斗三号工程高密度组网之后，时隔3年的首发任务。该卫星的发射将进一步提升系统服务性能，对推广北斗系统特色服务、支撑北斗系统规模应用具有重要意义。该卫星实现了对现有地球静止轨道卫星的在轨热备份，将增强系统的可用性和稳健性，提升系统现有区域短报文通信容量三分之一，提高星基增强和精密单点定位服务性能，有助于用户实现快速高精度定位。\n" +
                "\n" +
                "　　此次发射的北斗导航卫星和配套运载火箭由中国航天科技集团有限公司所属的中国空间技术研究院和中国运载火箭技术研究院分别抓总研制。这是长征系列运载火箭的第473次发射。"));
        newPagerList.add(new NewPager(R.drawable.k5,"艾跃进教授:为什么要女士优先！","中国青年报客户端北京5月17电（中青报·中青网记者 邱晨辉）北京时间2023年5月17日10时49分，我国在西昌卫星发射中心用长征三号乙运载火箭，成功发射第五十六颗北斗导航卫星。该卫星属地球静止轨道卫星，是我国北斗三号工程的首颗备份卫星。入轨并完成在轨测试后，将接入北斗卫星导航系统。\n" +
                "\n" +
                "　　此次发射是北斗三号工程高密度组网之后，时隔3年的首发任务。该卫星的发射将进一步提升系统服务性能，对推广北斗系统特色服务、支撑北斗系统规模应用具有重要意义。该卫星实现了对现有地球静止轨道卫星的在轨热备份，将增强系统的可用性和稳健性，提升系统现有区域短报文通信容量三分之一，提高星基增强和精密单点定位服务性能，有助于用户实现快速高精度定位。\n" +
                "\n" +
                "　　此次发射的北斗导航卫星和配套运载火箭由中国航天科技集团有限公司所属的中国空间技术研究院和中国运载火箭技术研究院分别抓总研制。这是长征系列运载火箭的第473次发射。"));
        newPagerList.add(new NewPager(R.drawable.k6,"第二十一讲 中国古建筑的梁（一）","中国青年报客户端北京5月17电（中青报·中青网记者 邱晨辉）北京时间2023年5月17日10时49分，我国在西昌卫星发射中心用长征三号乙运载火箭，成功发射第五十六颗北斗导航卫星。该卫星属地球静止轨道卫星，是我国北斗三号工程的首颗备份卫星。入轨并完成在轨测试后，将接入北斗卫星导航系统。\n" +
                "\n" +
                "　　此次发射是北斗三号工程高密度组网之后，时隔3年的首发任务。该卫星的发射将进一步提升系统服务性能，对推广北斗系统特色服务、支撑北斗系统规模应用具有重要意义。该卫星实现了对现有地球静止轨道卫星的在轨热备份，将增强系统的可用性和稳健性，提升系统现有区域短报文通信容量三分之一，提高星基增强和精密单点定位服务性能，有助于用户实现快速高精度定位。\n" +
                "\n" +
                "　　此次发射的北斗导航卫星和配套运载火箭由中国航天科技集团有限公司所属的中国空间技术研究院和中国运载火箭技术研究院分别抓总研制。这是长征系列运载火箭的第473次发射。"));

    }

    private void initRecycler() {

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setAdapter(new IndexFragmentAdapter(getContext(),newPagerList));
        recyclerView.setLayoutManager(gridLayoutManager);

    }

    private void initLinarLayoutAll() {

        l1 = rootView.findViewById(R.id.fra_index_row1_l1);
        l2 = rootView.findViewById(R.id.fra_index_row1_l2);
        l3 = rootView.findViewById(R.id.fra_index_row1_l3);
        l4 = rootView.findViewById(R.id.fra_index_row1_l4);
        l5 = rootView.findViewById(R.id.fra_index_row1_l5);
        l6 = rootView.findViewById(R.id.fra_index_row2_l1);
        l7 = rootView.findViewById(R.id.fra_index_row2_l2);
        l8 = rootView.findViewById(R.id.fra_index_row2_l3);
        l9 = rootView.findViewById(R.id.fra_index_row2_l4);
        l10 = rootView.findViewById(R.id.fra_index_row2_l5);

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
        l10.setOnClickListener(linealyoutAllClickListen);




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

    private void initViews() {
        views = new ArrayList<>();

        View v1 = LayoutInflater.from(getContext()).inflate(R.layout.view_index_vp1,null);
        View v2 = LayoutInflater.from(getContext()).inflate(R.layout.view_index_vp2,null);
        View v3 = LayoutInflater.from(getContext()).inflate(R.layout.view_index_vp3,null);

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

    private void initViewPager() {
        viewPager.setAdapter(new IndexViewPagerAdapter(views));
    }

    private void initView() {
        textView = rootView.findViewById(R.id.topbar_tv);
        textView.setText("首页");

        viewPager = rootView.findViewById(R.id.fra_index_vp);
        recyclerView = rootView.findViewById(R.id.fragment_index_newpager_recycleview);
    }

    class LinealyoutAllClickListen implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.fra_index_row1_l1:

                   mainViewPager2.setCurrentItem(3);

                    Toast.makeText(context, "r1l1", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fra_index_row1_l2:
                    Toast.makeText(context, "r1l2", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fra_index_row1_l3:
                    Toast.makeText(context, "r1l3", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fra_index_row1_l4:
                    Toast.makeText(context, "r1l4", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fra_index_row1_l5:
                    Toast.makeText(context, "r1l5", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fra_index_row2_l1:
                    Toast.makeText(context, "r2l1", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fra_index_row2_l2:
                    Toast.makeText(context, "r2l2", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fra_index_row2_l3:
                    Toast.makeText(context, "r2l3", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fra_index_row2_l4:
                    Toast.makeText(context, "r2l4", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fra_index_row2_l5:
                    Toast.makeText(context, "r2l5", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }

}
