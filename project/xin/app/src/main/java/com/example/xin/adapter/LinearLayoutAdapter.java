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
import com.example.xin.bean.MySet;

import java.util.List;

public class LinearLayoutAdapter extends RecyclerView.Adapter<LinearLayoutAdapter.LinearLayoutViewHolder> {

    private Context context;
    private List<MySet> mySetList;

    public LinearLayoutAdapter(Context context, List<MySet> list) {
        this.context = context;
        this.mySetList = list;
    }

    @NonNull
    @Override
    public LinearLayoutAdapter.LinearLayoutViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.layout_linearlayoutadapter_me_item,parent,false);
        LinearLayoutAdapter.LinearLayoutViewHolder linearLayoutViewHolder = new LinearLayoutViewHolder(view);

        return linearLayoutViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LinearLayoutAdapter.LinearLayoutViewHolder holder, int position) {

        holder.icon.setImageResource(mySetList.get(position).getIcon());
        holder.more.setImageResource(mySetList.get(position).getMore());
        holder.content.setText(mySetList.get(position).getContent());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "未开发", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mySetList.size();
    }

    class LinearLayoutViewHolder extends RecyclerView.ViewHolder{

        private ImageView icon,more;
        private TextView content;

        public LinearLayoutViewHolder(@NonNull View itemView) {
            super(itemView);

            icon = itemView.findViewById(R.id.fragment_me_item_icon);
            more = itemView.findViewById(R.id.fragment_me_item_more);
            content = itemView.findViewById(R.id.fragment_me_item_content);

        }
    }
}
