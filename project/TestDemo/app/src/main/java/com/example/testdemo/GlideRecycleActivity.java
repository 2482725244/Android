package com.example.testdemo;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GlideRecycleActivity extends AppCompatActivity {

    private RecyclerView rv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide_recycle);

        rv = findViewById(R.id.ac_gr_rv);

        rv.setAdapter(new GlideRecycleAdapater(this));
        rv.setLayoutManager(new LinearLayoutManager(this));




    }
}
