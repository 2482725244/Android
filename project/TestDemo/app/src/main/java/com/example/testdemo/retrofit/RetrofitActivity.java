package com.example.testdemo.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.ScriptIntrinsicConvolve3x3;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.testdemo.R;
import com.example.testdemo.User;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitActivity extends AppCompatActivity {

    private Button btn;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        btn = findViewById(R.id.ac_rt_btn);
        tv = findViewById(R.id.ac_rt_tv);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService apiService = retrofit.create(ApiService.class);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Response<String> response = apiService.test("aaa").execute();
                    response.body();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        apiService.test("test").enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                response.body();
            }

            @Override
            public void onFailure(Call<String> call, Throwable throwable) {

            }
        });

        apiService.testPost("aaa").enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {

            }

            @Override
            public void onFailure(Call<String> call, Throwable throwable) {

            }
        });

        try {
            Response<String> response = apiService.testPost("aa").execute();
            String s = response.body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Map<String,String> map = new HashMap<>();
        map.put("a","aaaaa");
        apiService.tt(map).enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                String s = response.body();
            }

            @Override
            public void onFailure(Call<String> call, Throwable throwable) {

            }
        });


        apiService.ttaa(new User("name")).enqueue(new Callback<ResponsData<String>>() {
            @Override
            public void onResponse(Call<ResponsData<String>> call, Response<ResponsData<String>> response) {
                   ResponsData<String> responsData =  response.body();
            }

            @Override
            public void onFailure(Call<ResponsData<String>> call, Throwable throwable) {

            }
        });

    }






}