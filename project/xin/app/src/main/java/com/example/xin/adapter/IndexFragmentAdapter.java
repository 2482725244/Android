package com.example.xin.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.xin.R;
import com.example.xin.bean.Show;

import java.util.List;

public class IndexFragmentAdapter extends RecyclerView.Adapter<IndexFragmentAdapter.IndexFragmentViewHolder> {

    private Context indexContext;
    private List<Show> showList;

    public IndexFragmentAdapter(Context context,List<Show> list) {
        this.indexContext = context;
        this.showList = list;
    }

    @NonNull
    @Override
    public IndexFragmentAdapter.IndexFragmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(indexContext).inflate(R.layout.layout_gridlayout_index_item,parent,false);
        IndexFragmentViewHolder viewHolder = new IndexFragmentViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull IndexFragmentAdapter.IndexFragmentViewHolder holder, int position) {
        holder.textView.setText(showList.get(position).getContent());
        holder.imageView.setImageResource(showList.get(position).getSrc());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(indexContext, "未开发", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return showList.size();
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
