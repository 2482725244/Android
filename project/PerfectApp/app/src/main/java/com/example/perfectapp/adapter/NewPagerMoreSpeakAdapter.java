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
import com.example.perfectapp.bean.MySet;
import com.example.perfectapp.bean.Speak;

import java.util.List;

public class NewPagerMoreSpeakAdapter extends RecyclerView.Adapter<NewPagerMoreSpeakAdapter.LinearLayoutViewHolder> {

    private Context context;
    private List<Speak> speakList;

    public NewPagerMoreSpeakAdapter(Context context, List<Speak> list) {
        this.context = context;
        this.speakList = list;
    }

    @NonNull
    @Override
    public LinearLayoutViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.layout_newpagermore_speak_item,parent,false);
        LinearLayoutViewHolder linearLayoutViewHolder = new LinearLayoutViewHolder(view);

        return linearLayoutViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LinearLayoutViewHolder holder, int position) {

        holder.imageView.setImageResource(speakList.get(position).getImgSrc());
        holder.content.setText(speakList.get(position).getContent());

    }

    @Override
    public int getItemCount() {
        return speakList.size();
    }

    class LinearLayoutViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView content;

        public LinearLayoutViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.newpagermore_speak_iv);
            content = itemView.findViewById(R.id.newpagermore_speak_content);

        }
    }
}
