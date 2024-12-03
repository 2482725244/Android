package com.example.perfectapp.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.perfectapp.R;
import com.example.perfectapp.adapter.AllSeverFragmentGridAdapater;
import com.example.perfectapp.bean.Sever;

import java.util.ArrayList;
import java.util.List;

public class AllFragment extends Fragment {

    private Bundle bundle;
    private View rootView;
    private Context context;
    private RecyclerView recyclerView;
    private List<Sever> list;
    private TextView textView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(rootView == null){
            rootView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_all,null);
        }
        context = rootView.getContext();
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView();
        initAllSeverList();
        initRecycleView();

    }

    private void initRecycleView() {

        GridLayoutManager gridLayoutManager = new GridLayoutManager(context,5);
        recyclerView.setAdapter(new AllSeverFragmentGridAdapater(list,context));
        recyclerView.setLayoutManager(gridLayoutManager);

    }

    private void initAllSeverList() {
        list = new ArrayList<>();

        list.add(new Sever(R.drawable.newpager,"新闻"));
        list.add(new Sever(R.drawable.i_an,"智慧安防"));
        list.add(new Sever(R.drawable.i_huan,"智慧环保"));
        list.add(new Sever(R.drawable.i_jiao,"智慧交通"));
        list.add(new Sever(R.drawable.i_wu,"智慧物流"));
        list.add(new Sever(R.drawable.i_xiao,"智慧校园"));
        list.add(new Sever(R.drawable.i_yang,"智慧养老"));
        list.add(new Sever(R.drawable.i_yi,"智慧医疗"));
        list.add(new Sever(R.drawable.i_zheng,"智慧政务"));
        list.add(new Sever(R.drawable.zhihui,"智慧党建"));
        list.add(new Sever(R.drawable.me,"个人中心"));
        list.add(new Sever(R.drawable.i_nong,"智慧农业"));
        list.add(new Sever(R.drawable.i_lv,"智慧旅游"));
    }

    private void initView() {
        recyclerView = rootView.findViewById(R.id.all_fragment_recycle);
        textView = rootView.findViewById(R.id.topbar_tv);
        textView.setText("全部服务");
    }
}
