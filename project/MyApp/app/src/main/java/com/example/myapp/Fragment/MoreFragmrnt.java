package com.example.myapp.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapp.R;

public class MoreFragmrnt extends Fragment {

    private LinearLayout textl;
    private Bundle bundle;
    private View rootView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(this.getArguments() != null){

            bundle = this.getArguments();

        }
    }

    private MoreFragmrnt(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(rootView == null){
            rootView = inflater.inflate(R.layout.fragment_more,null);
        }
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



    }

    public static MoreFragmrnt createFragment(){
        MoreFragmrnt moreFragment = new MoreFragmrnt();
        Bundle bundle = new Bundle();
        bundle.putString("aa","aaaa");
        moreFragment.setArguments(bundle);
        return moreFragment;
    }



}
