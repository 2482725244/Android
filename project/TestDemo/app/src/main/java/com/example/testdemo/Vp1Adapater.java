package com.example.testdemo;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class Vp1Adapater extends PagerAdapter {
    private List<View> views;
    private Context context;

    public Vp1Adapater(List<View> views, Context context) {
        this.views = views;
        this.context = context;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(views.get(position));

//        if(position == 2){
//            views.get(position).setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent intent = new Intent(context,MainActivity.class);
//                    context.startActivity(intent);
//                }
//            });
//        }
//        if(position == 2){
//            views.get(position).findViewById(R.id.index3_button).setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent intent = new Intent(context,MainActivity.class);
//                    context.startActivity(intent);
//                }
//            });
//        }

        return views.get(position);
    }

    @Override
    public int getCount() {
        return views.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(views.get(position));
    }
}
