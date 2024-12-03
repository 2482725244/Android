package com.example.xin.fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.xin.R;
import com.example.xin.adapter.DiaMoreFragmentAdapter;
import com.example.xin.bean.Messenger;
import com.example.xin.bean.User;

import java.util.ArrayList;
import java.util.List;

public class DiaMoreFragment extends Fragment {

    private LinearLayout top;
    private ImageView topBack,ytx;
    private TextView topName,yMessenger;
    private RecyclerView recyclerView;
    private EditText editText;
    private Button button;
    private Bundle bundle;
    private List<Messenger> messengerList;
    private DiaMoreFragmentAdapter diaMoreFragmentAdapter;

    private View rootView;
    private Context context;

    public static  DiaMoreFragment createDiaMoreFragment(Bundle bundle){
        DiaMoreFragment diaMoreFragment = new DiaMoreFragment();
        diaMoreFragment.setArguments(bundle);
        return diaMoreFragment;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(rootView == null){
            rootView = inflater.inflate(R.layout.fragment_diamore,container,false);
        }
        context = rootView.getContext();
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //初始化控件
        initControl();
        //获取包的内容
        getMyBundle();
        //设置topBar
        setTopBar();
        //初始化对方内容
        initYouMessenger();
        //初始化messengerList
        initMessenger();
        //设置recyview
        setRecycleView();
        //添加消息
        addMessenger();


    }

    private void addMyMessengerList(String messenger){
        messengerList.add(new Messenger(messenger));
        setRecycleView();
        editText.setText("");
    }

    private void addMessenger() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String messenger = editText.getText().toString();
                addMyMessengerList(messenger);
            }
        });
    }

    private void initYouMessenger() {
        ytx.setImageResource(bundle.getInt("src"));
        yMessenger.setText(bundle.getString("content"));
    }

    private void initMessenger() {
        messengerList = new ArrayList<Messenger>();
    }

    private void setRecycleView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        diaMoreFragmentAdapter = new DiaMoreFragmentAdapter(context,messengerList);
        recyclerView.setAdapter(diaMoreFragmentAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void getMyBundle() {
        bundle = getArguments();
    }

    private void setTopBar() {
        topBack.setVisibility(View.VISIBLE);
        topName.setText(bundle.getString("title"));
    }

    private void initControl() {
        top = rootView.findViewById(R.id.topbar_top);
        topName = rootView.findViewById(R.id.top_tv);
        topBack = rootView.findViewById(R.id.topbar_iv);
        ytx = rootView.findViewById(R.id.fragment_diamore_y_tx);
        yMessenger = rootView.findViewById(R.id.fragment_diamore_y_messenger);
        recyclerView = rootView.findViewById(R.id.fragment_diamore_recycleview);
        editText = rootView.findViewById(R.id.fragment_diamore_edit);
        button = rootView.findViewById(R.id.fragment_diamore_button);
    }
}
