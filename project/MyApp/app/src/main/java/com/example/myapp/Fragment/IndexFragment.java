package com.example.myapp.Fragment;

import static java.lang.Thread.sleep;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
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
import androidx.viewpager.widget.ViewPager;

import com.example.myapp.R;
import com.example.myapp.adapater.IndexFragmentRecyclerAdapter;
import com.example.myapp.adapater.IndexFragmentVplbAdapater;
import com.example.myapp.bean.IndexBean;

import java.util.ArrayList;
import java.util.List;

public class IndexFragment extends Fragment {

    private ViewPager viewPager;
    private static final int VPLB = 1;
    private TextView topTv;
    private Bundle bundle;
    private List<View> views;
    private View v1,v2,v3;
    private View rootView;
    private List<IndexBean> bs;
    private RecyclerView recyclerView;

    private Handler handler;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(this.getArguments() != null){

            bundle = this.getArguments();

        }
    }

    private IndexFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(rootView == null){
            rootView = inflater.inflate(R.layout.fragment_index,null);
        }
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initCtrol();
        initHandler();
        initTopTv();
        initViews();
        initViewPager();
        initCreateThread();
        initMoreFunction();
        initRecyclerView();



    }

    private void initRecyclerView() {
        bs = new ArrayList<>();
        recyclerView.setAdapter(new IndexFragmentRecyclerAdapter(bs));
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
    }

    private void initMoreFunction() {


    }

    private void initCreateThread() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true){
                    Message message = new Message();
                    message.what = VPLB;
                    message.arg1 = i % 3;
                    handler.sendMessage(message);
                    i++;
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }).start();
    }

    private void initHandler() {

        handler = new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);

                if(msg.what == VPLB){
                    switch (msg.arg1){
                        case 0:
                            viewPager.setCurrentItem(0);
                            break;
                        case 1:
                            viewPager.setCurrentItem(1);

                            break;
                        case 2:
                            viewPager.setCurrentItem(2);

                            break;
                    }
                }
            }
        };
    }

    private void initViews() {

        views = new ArrayList<>();

        v1 = LayoutInflater.from(getContext()).inflate(R.layout.vp_item1,null);
        v2 = LayoutInflater.from(getContext()).inflate(R.layout.vp_item2,null);
        v3 = LayoutInflater.from(getContext()).inflate(R.layout.vp_item3,null);

        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "1111", Toast.LENGTH_SHORT).show();
            }
        });
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "2222", Toast.LENGTH_SHORT).show();

            }
        });
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "3333", Toast.LENGTH_SHORT).show();

            }
        });

        views.add(v1);
        views.add(v2);
        views.add(v3);

    }

    private void initViewPager() {

        IndexFragmentVplbAdapater indexFragmentVplbAdapater = new IndexFragmentVplbAdapater(views);
        viewPager.setAdapter(indexFragmentVplbAdapater);


    }

    private void initTopTv() {
        topTv.setText("主页");
    }

    private void initCtrol() {
        topTv = rootView.findViewById(R.id.action_bar_tv);
        viewPager = rootView.findViewById(R.id.fragment_index_vp);
        recyclerView = rootView.findViewById(R.id.fragment_index_recycler);

    }

    public static IndexFragment createFragment(){
        IndexFragment indexFragment = new IndexFragment();
        Bundle bundle = new Bundle();
        bundle.putString("aa","aaaa");
        indexFragment.setArguments(bundle);
        return indexFragment;
    }

}
