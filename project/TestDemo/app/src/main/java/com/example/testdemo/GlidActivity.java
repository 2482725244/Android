package com.example.testdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.disklrucache.DiskLruCache;


public class GlidActivity extends AppCompatActivity {

    private ImageView im1,im2;
    private Button b;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glid);

        im1 = findViewById(R.id.ac_glid_im1);
        im2 = findViewById(R.id.ac_glid_im2);
        b = findViewById(R.id.ac_gr_btn);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GlidActivity.this,GlideRecycleActivity.class);
                startActivity(intent);
            }
        });

        String url = "https://img2.baidu.com/it/u=1040006583,576637529&fm=253&fmt=auto&app=138&f=JPEG?w=690&h=468";
        Glide.with(this).load(url).error(R.drawable.m2).into(im1);
        Glide.with(this).load(R.drawable.m1).into(im2);
    }
}
