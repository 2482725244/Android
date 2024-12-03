package com.example.testdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MoveActivity extends AppCompatActivity {

    private List<RoomBean> list;
    private Button btn,bbanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);

        list = new ArrayList<>();
        list.add(new RoomBean("c语言",18));

        String text = "传输文本";

        btn = findViewById(R.id.ac_move_btn);

        bbanner = findViewById(R.id.ac_move_to_banner);

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MoveActivity.this,MoveToActivity.class);
//                Bundle bundle = new Bundle();
//                bundle.putString("text",text);
//                intent.putExtra("bundle",bundle);
//
//                startActivity(intent);
//            }
//        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MoveActivity.this,MoveToActivity.class);
                intent.putExtra("roomBean",list.get(0));

                startActivity(intent);
            }
        });
        bbanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MoveActivity.this,MyBannerActivity.class);
                startActivity(intent);
            }
        });


    }
}