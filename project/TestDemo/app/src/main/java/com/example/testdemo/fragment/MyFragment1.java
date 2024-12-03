package com.example.testdemo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.testdemo.R;

public class MyFragment1 extends Fragment {
    private View rootView;

    private Button bchange;
    private TextView textView;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(rootView == null){
            rootView = inflater.inflate(R.layout.fragment_t1,null);
        }
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView = rootView.findViewById(R.id.f_tv);
        bchange = rootView.findViewById(R.id.f_bchange);

        bchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               setTextView("我变化了文字");
            }
        });


    }
    public void setTextView(String str){
        textView.setText(str);
    }
}
