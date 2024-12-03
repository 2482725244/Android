package com.example.testdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class GlideRecycleAdapater extends RecyclerView.Adapter<GlideRecycleAdapater.ViewHolder2> {

    private Context context;

    public GlideRecycleAdapater(Context context) {
        this.context = context;
    }

    private String[] urls = new String[]{
       "https://img1.baidu.com/it/u=1588925855,1352489313&fm=253&fmt=auto&app=138&f=JPEG?w=511&h=500",
       "https://img2.baidu.com/it/u=4262101982,457432342&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=666",
       "https://img0.baidu.com/it/u=967440659,3019749068&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=666"
    };
    @NonNull
    @Override
    public GlideRecycleAdapater.ViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder2(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gliderecycle,null));
    }

    @Override
    public void onBindViewHolder(@NonNull GlideRecycleAdapater.ViewHolder2 holder, int position) {
        Glide.with(context).load(urls[position]).error(R.drawable.m1).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return urls.length;
    }

    static class ViewHolder2 extends RecyclerView.ViewHolder{
        private ImageView imageView;
        public ViewHolder2(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.item_iv);

        }
    }
}
