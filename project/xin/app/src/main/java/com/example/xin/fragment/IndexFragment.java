package com.example.xin.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.xin.R;
import com.example.xin.adapter.IndexFragmentAdapter;
import com.example.xin.bean.Show;

import java.util.ArrayList;
import java.util.List;


public class IndexFragment extends Fragment implements View.OnClickListener {

    private RecyclerView recyclerView;
    private ImageView i1,i2,i3,i4,i5,i6,i7,i8;
    private TextView topTitle;

    private View rootView;
    private Context indexContext;
    private List<Show> showList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(rootView == null){
            rootView = inflater.inflate(R.layout.fragment_index,container,false);
        }
        indexContext = rootView.getContext();
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //初始化控件
        initConctrol();
        //初始化topBar
        initTopBar();
        //初始化小组件模块
        initwidget();
        //初始化showList
        initShowList();
        //初始化RecycleView
        initRecycleView();

    }

    private void initwidget() {
        i1.setOnClickListener(this);
        i2.setOnClickListener(this);
        i3.setOnClickListener(this);
        i4.setOnClickListener(this);
        i5.setOnClickListener(this);
        i6.setOnClickListener(this);
        i7.setOnClickListener(this);
        i8.setOnClickListener(this);
    }

    private void initRecycleView() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(indexContext,2);
        recyclerView.setAdapter(new IndexFragmentAdapter(indexContext,showList));
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    private void initShowList() {
        showList = new ArrayList<Show>();
        showList.add(new Show(R.drawable.k1,"【登月】月全食怎么看？月球身世之谜"));
        showList.add(new Show(R.drawable.k2,"大豆洋葱成财富密码，数十亿美元白银骗局，期货市场是暴"));
        showList.add(new Show(R.drawable.k3,"中国河流详细介绍，分为九大流域片、七大水系，了解河流"));
        showList.add(new Show(R.drawable.k4,"北京大学陈瑞华教授讲《刑事诉讼法的证据效力》"));
        showList.add(new Show(R.drawable.k5,"艾跃进教授:为什么要女士优先！"));
        showList.add(new Show(R.drawable.k6,"第二十一讲 中国古建筑的梁（一）"));

    }

    private void initTopBar() {
        topTitle.setText("首页");
    }

    private void initConctrol() {
        topTitle = rootView.findViewById(R.id.top_tv);
        recyclerView = rootView.findViewById(R.id.fragment_index_recycleview);
        i1 = rootView.findViewById(R.id.fragment_index_i1);
        i2 = rootView.findViewById(R.id.fragment_index_i2);
        i3 = rootView.findViewById(R.id.fragment_index_i3);
        i4 = rootView.findViewById(R.id.fragment_index_i4);
        i5 = rootView.findViewById(R.id.fragment_index_i5);
        i6 = rootView.findViewById(R.id.fragment_index_i6);
        i7 = rootView.findViewById(R.id.fragment_index_i7);
        i8 = rootView.findViewById(R.id.fragment_index_i8);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.fragment_index_i1:
                Toast.makeText(indexContext, "1", Toast.LENGTH_SHORT).show();

                break;
            case R.id.fragment_index_i2:
                Toast.makeText(indexContext, "2", Toast.LENGTH_SHORT).show();

                break;
            case R.id.fragment_index_i3:
                Toast.makeText(indexContext, "3", Toast.LENGTH_SHORT).show();

                break;
            case R.id.fragment_index_i4:
                Toast.makeText(indexContext, "4", Toast.LENGTH_SHORT).show();

                break;
            case R.id.fragment_index_i5:
                Toast.makeText(indexContext, "5", Toast.LENGTH_SHORT).show();

                break;
            case R.id.fragment_index_i6:
                Toast.makeText(indexContext, "6", Toast.LENGTH_SHORT).show();

                break;
            case R.id.fragment_index_i7:
                Toast.makeText(indexContext, "7", Toast.LENGTH_SHORT).show();

                break;
            case R.id.fragment_index_i8:
                Toast.makeText(indexContext, "8", Toast.LENGTH_SHORT).show();

                break;
        }
    }
}