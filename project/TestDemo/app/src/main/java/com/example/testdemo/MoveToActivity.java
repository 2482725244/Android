package com.example.testdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public class MoveToActivity extends AppCompatActivity {

    private Bundle bundle;
    private Serializable ser;
    private RoomBean rb;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_to);

        tv = findViewById(R.id.ac_moveto_tv);


        if(getIntent().getSerializableExtra("roomBean") != null){
            rb = (RoomBean) getIntent().getSerializableExtra("roomBean");
            tv.setText(rb.getList().get(0).getName());
            Toast.makeText(this, rb.getName(), Toast.LENGTH_SHORT).show();
        }



    }
}