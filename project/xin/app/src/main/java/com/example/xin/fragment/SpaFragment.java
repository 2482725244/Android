package com.example.xin.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.xin.R;


public class SpaFragment extends Fragment {

    private LinearLayout head;
    private ImageView headTx;
    private TextView headpersonlity,bodycontent,toptitle;
    private View rootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(rootView == null){
            rootView = inflater.inflate(R.layout.fragment_spa,container,false);
        }
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //初始化控件
        initControl();
        //初始化topbar
        initTopBar();
        //登陆判定（未完成）
    }

    private void initTopBar() {
        toptitle.setText("社区");
    }

    private void initControl() {
        toptitle = rootView.findViewById(R.id.top_tv);
        head = rootView.findViewById(R.id.fragment_spa_head);
        headTx = rootView.findViewById(R.id.fragment_spa_head_tx);
        headpersonlity = rootView.findViewById(R.id.fragment_spa_head_personlity);
        bodycontent = rootView.findViewById(R.id.fragment_spa_body_content);
    }
}