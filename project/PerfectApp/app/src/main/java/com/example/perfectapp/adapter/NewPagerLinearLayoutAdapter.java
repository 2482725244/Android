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
import com.example.perfectapp.bean.LineanNewPage;

import java.util.List;

public class NewPagerLinearLayoutAdapter extends RecyclerView.Adapter<NewPagerLinearLayoutAdapter.LinearLayoutViewHolder> {

    private Context context;
    private List<LineanNewPage> list;

    public NewPagerLinearLayoutAdapter(Context context, List<LineanNewPage> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public LinearLayoutViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view  = LayoutInflater.from(context).inflate(R.layout.layout_newpage_linear_item,parent,false);
        LinearLayoutViewHolder viewHolder = new LinearLayoutViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LinearLayoutViewHolder holder, int position) {

        holder.image.setImageResource(list.get(position).getImgSrc());
        holder.personNumber.setText("观看人数为："+list.get(position).getPersonNumber());
        holder.zanNumber.setText("点赞数为："+list.get(position).getZanNumber());
        holder.title.setText(list.get(position).getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, NewPagerActivityMore.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("lineanNewPager",list.get(position));
                intent.putExtra("lineanNewPagerBundle",bundle);

                context.startActivity(intent);

                Toast.makeText(context, "未开发", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class LinearLayoutViewHolder extends RecyclerView.ViewHolder{

        private ImageView image;
        private TextView title,personNumber,zanNumber;

        public LinearLayoutViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.fra_newpager_linear_item_iv);
            title = itemView.findViewById(R.id.fra_newpager_linear_item_title);
            personNumber = itemView.findViewById(R.id.fra_newpager_linear_item_personnumber);
            zanNumber = itemView.findViewById(R.id.fra_newpager_linear_item_zannumber);

        }
    }

}
