package com.example.testdemo.gson;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.testdemo.R;

import java.util.List;

public class GsonChange extends AppCompatActivity {

    private TextView tv;
    private Button btn,bm;
    private GsonUtil gsonUtil;
    private TestBean b1;
    private List<TestBean> beans;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gsonchange);

        gsonUtil = new GsonUtil();
        b1 = new TestBean();

        tv = findViewById(R.id.ac_gson_tv);
        btn = findViewById(R.id.ac_gson_btn);
        bm = findViewById(R.id.ac_gson_move);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                b1 = gsonUtil.parseJson();
//                tv.setText(b1.getCode()+","+b1.getName());

                beans = gsonUtil.parseJsonArray();

                String s = "";
                for (int i = 0; i < beans.size(); i++) {

                    s += beans.get(i).getName()+","+beans.get(i).getCode();
                    s +="\n";

                }
                tv.setText(s);



            }
        });

        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GsonChange.this,AdGsonActivirt.class);
                startActivity(intent);
            }
        });
    }
}
