package com.example.xin.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

public class ViewpagerAdapter extends FragmentStateAdapter {

    private List<Fragment> mlist;
    private FragmentManager fragmentManager;


    public ViewpagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle,List<Fragment> mlist) {
        super(fragmentManager, lifecycle);
        this.fragmentManager = fragmentManager;
        this.mlist = mlist;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        return mlist.get(position);
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }
}
