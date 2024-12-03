package com.example.xin.adapter;

import android.annotation.SuppressLint;
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
import com.example.xin.bean.User;
import com.example.xin.utill.DiaFragmentpost;

import java.util.List;

public class DiaFragmentAdapter extends RecyclerView.Adapter<DiaFragmentAdapter.DiaFragmentViewHolder> {

    private List<User> userList;
    private Context diaFragmentContext;
    private DiaFragmentpost diaFragmentpost;

    public DiaFragmentAdapter(Context context,List<User> userList,DiaFragmentpost diaFragmentpost) {
        this.diaFragmentContext = context;
        this.userList = userList;
        this.diaFragmentpost = diaFragmentpost;
    }

    @NonNull
    @Override
    public DiaFragmentAdapter.DiaFragmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(diaFragmentContext).inflate(R.layout.layout_linearlayoutadapter_dia_item,parent,false);
        DiaFragmentAdapter.DiaFragmentViewHolder viewHolder = new DiaFragmentViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DiaFragmentAdapter.DiaFragmentViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.tx.setImageResource(userList.get(position).getSrc());
        holder.title.setText(userList.get(position).getTitle());
        holder.content.setText(userList.get(position).getContent());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diaFragmentpost.diaPost(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    class DiaFragmentViewHolder extends RecyclerView.ViewHolder{

        private ImageView tx;
        private TextView title,content;

        public DiaFragmentViewHolder(@NonNull View itemView) {
            super(itemView);
            tx = itemView.findViewById(R.id.fragment_dia_item_iv);
            title = itemView.findViewById(R.id.fragment_dia_item_title);
            content = itemView.findViewById(R.id.fragment_dia_item_messenger);
        }
    }
}
