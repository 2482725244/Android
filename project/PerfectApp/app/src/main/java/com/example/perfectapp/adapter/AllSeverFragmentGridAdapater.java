package com.example.perfectapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.perfectapp.R;
import com.example.perfectapp.bean.Sever;

import java.util.List;

public class AllSeverFragmentGridAdapater extends RecyclerView.Adapter<AllSeverFragmentGridAdapater.MyViewHolder> {

    private List<Sever> list;
    private Context context;

    public AllSeverFragmentGridAdapater(List<Sever> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public AllSeverFragmentGridAdapater.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.layout_fra_all_grid,parent,false);

        AllSeverFragmentGridAdapater.MyViewHolder viewHolder = new MyViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AllSeverFragmentGridAdapater.MyViewHolder holder, int position) {

        holder.textView.setText(list.get(position).getName());
        holder.imageView.setImageResource(list.get(position).getImgSrc());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "未开发", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.fra_all_item_iv);
            textView = itemView.findViewById(R.id.fra_all_item_name);

        }
    }
}
