package com.example.perfectapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.perfectapp.R;
import com.example.perfectapp.activity.NewPagerActivityMore;
import com.example.perfectapp.bean.NewPager;

import java.util.List;

public class IndexFragmentAdapter extends RecyclerView.Adapter<IndexFragmentAdapter.IndexFragmentViewHolder> {

    private Context indexContext;
    private List<NewPager> newPagerList;

    public IndexFragmentAdapter(Context context, List<NewPager> list) {
        this.indexContext = context;
        this.newPagerList = list;
    }

    @NonNull
    @Override
    public IndexFragmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(indexContext).inflate(R.layout.layout_gridlayout_index_fragment_item,parent,false);
        IndexFragmentViewHolder viewHolder = new IndexFragmentViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull IndexFragmentViewHolder holder, int position) {
        holder.textView.setText(newPagerList.get(position).getTitle());
        holder.imageView.setImageResource(newPagerList.get(position).getImgSrc());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(indexContext, NewPagerActivityMore.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("newPager",newPagerList.get(position));
                intent.putExtra("newPagerBundle",bundle);

                indexContext.startActivity(intent);
                Toast.makeText(indexContext, "未开发", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return newPagerList.size();
    }
    class IndexFragmentViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView textView;

        public IndexFragmentViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.fragment_index_item_iv);
            textView = itemView.findViewById(R.id.fragment_index_item_tv);
        }
    }
}
