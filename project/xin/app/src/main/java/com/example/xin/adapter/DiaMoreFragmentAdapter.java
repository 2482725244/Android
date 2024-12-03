package com.example.xin.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.xin.R;
import com.example.xin.bean.Messenger;

import java.util.List;

public class DiaMoreFragmentAdapter extends RecyclerView.Adapter<DiaMoreFragmentAdapter.DiaMoreViewHolder> {

    private Context mContext;
    private List<Messenger> messengerList;

    public DiaMoreFragmentAdapter(Context Context,List<Messenger> messengerList) {
        this.mContext = Context;
        this.messengerList = messengerList;
    }

    @NonNull
    @Override
    public DiaMoreFragmentAdapter.DiaMoreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.fragment_diamore_item_me,parent,false);
        DiaMoreViewHolder viewHolder = new DiaMoreViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DiaMoreFragmentAdapter.DiaMoreViewHolder holder, int position) {
        holder.myMessenger.setText(messengerList.get(position).getMessenger());
    }

    @Override
    public int getItemCount() {
        return messengerList.size();
    }
    class DiaMoreViewHolder extends RecyclerView.ViewHolder{
        private TextView myMessenger;

        public DiaMoreViewHolder(@NonNull View itemView) {
            super(itemView);
            myMessenger = itemView.findViewById(R.id.fragment_diamore_me_messenger);
        }
    }
}
