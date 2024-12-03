package com.example.testdemo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testdemo.gson.GsonChange;
import com.example.testdemo.retrofit.RetrofitActivity;
import com.example.testdemo.testgson.TestGson1;

import java.util.List;

public class MyRvAdapater extends RecyclerView.Adapter<MyRvAdapater.MyViewHolder>{

    private List<FruitBean> list;
    private Context context;

    public MyRvAdapater(List<FruitBean> list,Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyRvAdapater.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_linear_list, null));
    }

    @Override
    public void onBindViewHolder(@NonNull MyRvAdapater.MyViewHolder holder, int position) {

        holder.im.setImageResource(list.get(position).getSrc());
        holder.tv.setText(list.get(position).getString());
        holder.itemMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (position){
                    case 0:
                        Intent intent1 = new Intent(context,GlidActivity.class);
                        context.startActivity(intent1);
                        break;
                    case 1:
                        Intent intent2 = new Intent(context,OkHttpActivity.class);
                        context.startActivity(intent2);
                        break;
                    case 2:
                        Intent intent3 = new Intent(context,OkHttpUpVersionActivity.class);
                        context.startActivity(intent3);
                        break;
                    case 3:
                        Intent intent4 = new Intent(context, RetrofitActivity.class);
                        context.startActivity(intent4);
                        break;
                    case 4:
                        Intent intent5 = new Intent(context, GsonChange.class);
                        context.startActivity(intent5);
                        break;
                    case 5:
                        Intent intent6 = new Intent(context, TestGson1.class);
                        context.startActivity(intent6);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        LinearLayout itemMain;
        ImageView im;
        TextView tv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            im = itemView.findViewById(R.id.item_image);
            tv = itemView.findViewById(R.id.item_tv);
            itemMain = itemView.findViewById(R.id.item_main);
        }
    }
}
