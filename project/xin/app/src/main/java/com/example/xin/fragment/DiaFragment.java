package com.example.xin.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.xin.R;
import com.example.xin.activity.DiaFragmentMoreActivity;
import com.example.xin.activity.MainActivity;
import com.example.xin.adapter.DiaFragmentAdapter;
import com.example.xin.bean.User;
import com.example.xin.utill.DiaFragmentpost;

import java.util.ArrayList;
import java.util.List;


public class DiaFragment extends Fragment implements DiaFragmentpost {

    private TextView toptitle;
    private RecyclerView recyclerView;
    private View rootView;
    private Context diaFragmentContext;
    private List<User> userList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(rootView == null){
            rootView = inflater.inflate(R.layout.fragment_dia,container,false);
        }
        diaFragmentContext = rootView.getContext();
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //初始化控件
        initControl();
        //初始化topbar
        initTopBar();
        //初始化userList
        initUserList();
        //初始化RecycleView
        initRecycleView();

    }

    private void initUserList() {
        userList = new ArrayList<User>();
        userList.add(new User(R.drawable.x1,"小韩","去吃饭吗"));
        userList.add(new User(R.drawable.x2,"班长","快来上课，马上！"));
        userList.add(new User(R.drawable.x3,"小枫","周末出去玩？"));
        userList.add(new User(R.drawable.x4,"李林","啥时候去哈尔滨"));
        userList.add(new User(R.drawable.x5,"社长","今年纳新，别忘了去"));
        userList.add(new User(R.drawable.x6,"飞飞","点外卖吗"));

    }

    private void initRecycleView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(diaFragmentContext);
        recyclerView.setAdapter(new DiaFragmentAdapter(diaFragmentContext,userList,this));
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    private void initTopBar() {
        toptitle.setText("聊天");
    }

    private void initControl() {
        toptitle = rootView.findViewById(R.id.top_tv);
        recyclerView = rootView.findViewById(R.id.fragment_dia_recycleview);
    }

    @Override
    public void diaPost(int position) {

        Intent intent = new Intent(getActivity(),DiaFragmentMoreActivity.class);
        Bundle bundle = new Bundle();

        bundle.putInt("src",userList.get(position).getSrc());
        bundle.putString("title",userList.get(position).getTitle());
        bundle.putString("content",userList.get(position).getContent());

        intent.putExtras(bundle);
        startActivity(intent);

    }
}