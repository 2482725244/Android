package com.example.myapp.adapater;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapp.R;
import com.example.myapp.bean.IndexBean;

import java.util.List;

public class IndexFragmentRecyclerAdapter extends RecyclerView.Adapter<IndexFragmentRecyclerAdapter.MyViewHodel> {

    private List<IndexBean> bs;

    public IndexFragmentRecyclerAdapter(List<IndexBean> bs) {
        this.bs = bs;
    }

    @NonNull
    @Override
    public IndexFragmentRecyclerAdapter.MyViewHodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHodel(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler,null));
    }

    @Override
    public void onBindViewHolder(@NonNull IndexFragmentRecyclerAdapter.MyViewHodel holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 26;
    }

    class MyViewHodel extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView textView;

        public MyViewHodel(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.re_item_im);
            textView = itemView.findViewById(R.id.re_item_tv);

        }
    }
}
