package com.example.perfectapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.perfectapp.R;
import com.example.perfectapp.activity.PersonSetActivity;
import com.example.perfectapp.activity.PersonShopingActivity;
import com.example.perfectapp.activity.PersonSpeakActivity;
import com.example.perfectapp.activity.PersonUser;
import com.example.perfectapp.activity.PersoninfoActivity;
import com.example.perfectapp.bean.MySet;

import java.util.List;

public class LinearLayoutAdapter extends RecyclerView.Adapter<LinearLayoutAdapter.LinearLayoutViewHolder> {

    private Context context;
    private List<MySet> mySetList;
    private TextView headTitle,headPersonlity,headPersonid;
    private ImageView headIv;
    private LinearLayout head;

    public LinearLayoutAdapter(Context context, List<MySet> list,TextView headPersonid,ImageView headIv,TextView headTitle,TextView headPersonlity,LinearLayout head) {
        this.context = context;
        this.mySetList = list;
        this.headPersonid = headPersonid;
        this.headIv = headIv;
        this.headTitle = headTitle;
        this.headPersonlity = headPersonlity;
        this.head = head;
    }

    @NonNull
    @Override
    public LinearLayoutViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.layout_linearlayoutadapter_me_item,parent,false);
        LinearLayoutViewHolder linearLayoutViewHolder = new LinearLayoutViewHolder(view);

        return linearLayoutViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LinearLayoutViewHolder holder, int position) {

        holder.icon.setImageResource(mySetList.get(position).getIcon());
        holder.more.setImageResource(mySetList.get(position).getMore());
        holder.content.setText(mySetList.get(position).getContent());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (position){

                    case 0:
                        Intent intent1 = new Intent(context, PersoninfoActivity.class);
                        context.startActivity(intent1);
                        break;
                    case 1:
                        Intent intent2 = new Intent(context, PersonUser.class);
                        context.startActivity(intent2);
                        break;
                    case 2:
                        Intent intent3 = new Intent(context, PersonShopingActivity.class);
                        context.startActivity(intent3);
                        break;
                    case 3:
                        Intent intent4 = new Intent(context, PersonSetActivity.class);
                        context.startActivity(intent4);
                        break;
                    case 4:
                        Intent intent5 = new Intent(context, PersonSpeakActivity.class);
                        context.startActivity(intent5);
                        break;
                    case 5:
                        headPersonid.setText("ID:xxxxxxxxxxxxxxx");
                        headIv.setImageResource(R.drawable.me_mo_tt);
                        headTitle.setText("请登录");
                        headPersonlity.setText("还未登录，请登录");
                        head.setBackgroundResource(R.drawable.fragment_me_car);
                        Toast.makeText(context, "退出成功", Toast.LENGTH_SHORT).show();
                        break;



                }
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
