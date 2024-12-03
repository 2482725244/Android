package com.example.xin.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.xin.R;
import com.example.xin.adapter.LinearLayoutAdapter;
import com.example.xin.bean.MySet;
import com.example.xin.bean.User;

import java.util.ArrayList;
import java.util.List;


public class MeFragment extends Fragment implements View.OnClickListener {

    private LinearLayout head;
    private TextView topTv1,headTitle,headPersonlity,headPersonid;
    private ImageView headIv;
    private RecyclerView recyclerView;
    private View rootView;
    private Context context;
    private List<MySet> mySetList;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(rootView == null){
            rootView = inflater.inflate(R.layout.fragment_me,container,false);
        }
        context = rootView.getContext();
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //初始化控件
        initControl();
        //初始化topbar
        initTopbar();
        //初始化mySetList
        initmySetList();
        //初始化recycleView
        initRecycleView();
        //判定登录(未完善)
        judgementLogin();

    }

    private void initmySetList() {
        mySetList = new ArrayList<MySet>();
        mySetList.add(new MySet(R.drawable.dianying,R.drawable.more,"观影"));
        mySetList.add(new MySet(R.drawable.jiankang,R.drawable.more,"健康"));
        mySetList.add(new MySet(R.drawable.ditie,R.drawable.more,"乘车"));
        mySetList.add(new MySet(R.drawable.shoucang,R.drawable.more,"收藏"));
        mySetList.add(new MySet(R.drawable.quanzi,R.drawable.more,"圈子"));
        mySetList.add(new MySet(R.drawable.set,R.drawable.more,"设置"));

    }

    private void initRecycleView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        recyclerView.setAdapter(new LinearLayoutAdapter(context,mySetList));
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void initTopbar() {
        topTv1.setText("我的");
    }

    private void judgementLogin() {
        head.setOnClickListener(this);

    }

    private void initControl() {
        topTv1 = rootView.findViewById(R.id.top_tv);
        head = rootView.findViewById(R.id.fragment_me_head);
        headIv = rootView.findViewById(R.id.fragment_me_head_iv);
        headTitle = rootView.findViewById(R.id.fragment_me_head_title);
        headPersonlity = rootView.findViewById(R.id.fragment_me_head_personlity);
        headPersonid = rootView.findViewById(R.id.fragment_me_head_personid);
        recyclerView = rootView.findViewById(R.id.fragment_me_recycleview);
    }

    @Override
    public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                View loginView = getLayoutInflater().inflate(R.layout.login,null);

                EditText user = loginView.findViewById(R.id.login_user);
                EditText password = loginView.findViewById(R.id.login_password);
                Button comit = loginView.findViewById(R.id.login_conmit);
                comit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String userContent = user.getText().toString();
                        String passwordContent = password.getText().toString();
                        if(userContent.equals("123456789")){

                            if(passwordContent.equals("qweqwe")){
                                Toast.makeText(loginView.getContext(), "登陆成功", Toast.LENGTH_SHORT).show();
                                headPersonid.setText("ID:330212830622316");
                                headIv.setImageResource(R.drawable.me_tx);
                                headTitle.setText("早点睡");
                                headPersonlity.setText("记得说晚安哦");
                                head.setBackgroundResource(R.drawable.fragment_me_car_set);
                            }else{
                                Toast.makeText(loginView.getContext(), "账号或密码输入错误", Toast.LENGTH_SHORT).show();
                            }

                        }else{
                            Toast.makeText(loginView.getContext(), "账号或密码输入错误", Toast.LENGTH_SHORT).show();
                        }

                    }
                });

                builder.setTitle("登录").setView(loginView).show();

    }
}