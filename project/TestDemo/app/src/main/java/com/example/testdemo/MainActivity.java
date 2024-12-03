package com.example.testdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private List<FruitBean> fruits;
    private ButtonOnClickListener buttonOnClickListener = new ButtonOnClickListener();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButton();
        initFruits();
        initRecyclerView();

    }



    private void initFruits() {
        fruits = new ArrayList<>();
        fruits.add(new FruitBean(R.drawable.m1,"GlidBasic"));
        fruits.add(new FruitBean(R.drawable.m1,"OkHttp"));
        fruits.add(new FruitBean(R.drawable.m1,"OkHttpUpVersion"));
        fruits.add(new FruitBean(R.drawable.m1,"Retrofit"));
        fruits.add(new FruitBean(R.drawable.m1,"Gson"));
        fruits.add(new FruitBean(R.drawable.m1,"TestJson"));
        fruits.add(new FruitBean(R.drawable.m2,"好吃的水果7"));
        fruits.add(new FruitBean(R.drawable.m3,"很多的水果8"));
    }

    private void initRecyclerView() {
        rv = findViewById(R.id.rv_linear_list);

        MyRvAdapater adapater = new MyRvAdapater(fruits,MainActivity.this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(adapater);


    }

    private void initButton() {
        Button bBf,bVpF,bi,bl,bm;

        bBf = findViewById(R.id.to_fragment);
        bBf.setOnClickListener(buttonOnClickListener);

        bi = findViewById(R.id.to_index);
        bi.setOnClickListener(buttonOnClickListener);

        bVpF = findViewById(R.id.to_vpfragment);
        bVpF.setOnClickListener(buttonOnClickListener);

        bl = findViewById(R.id.to_login);
        bl.setOnClickListener(buttonOnClickListener);

        bm = findViewById(R.id.to_move);
        bm.setOnClickListener(buttonOnClickListener);

    }

    class ButtonOnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.to_fragment:
                    Intent intent1 = new Intent(MainActivity.this,TestFragmentActivity.class);
                        startActivity(intent1);
                    break;
                case R.id.to_vpfragment:
                    Intent intent2 = new Intent(MainActivity.this,VpFragmentActivity.class);
                    startActivity(intent2);
                    break;
                case R.id.to_index:
                    Intent intent3 = new Intent(MainActivity.this,StartActivity.class);
                    startActivity(intent3);
                    break;
                case R.id.to_login:
                    Intent intent4 = new Intent(MainActivity.this,LoginActivity.class);
                    startActivity(intent4);
                    break;
                case R.id.to_move:
                    Intent intent5 = new Intent(MainActivity.this,MoveActivity.class);
                    startActivity(intent5);
                    break;
            }
        }
    }


}