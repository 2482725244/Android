package com.example.testdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.testdemo.fragment.MyFragment1;
import com.example.testdemo.fragment.MyFragment2;

public class TestFragmentActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt,bf;
    private MyFragment1 f1;
    private FragmentManager fragmentManager = getSupportFragmentManager();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testfragment);

        initFragment();
        initButton();

    }

    private void initFragment() {

        f1 = new MyFragment1();
        fragmentManager.beginTransaction().add(R.id.fragment_place,f1).addToBackStack(null).commit();
    }

    private void initButton() {

        bt = findViewById(R.id.bt);
        bf = findViewById(R.id.bf);

        bt.setOnClickListener(this);
        bf.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){

            case R.id.bt:
                f1.setTextView("我在外面改的文字啊！");
                break;
            case R.id.bf:
                MyFragment2 f2 = new MyFragment2();
                fragmentManager.beginTransaction().replace(R.id.fragment_place,f2).addToBackStack(null).commit();
                break;
        }
    }
}
