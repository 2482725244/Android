package com.example.testdemo;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OkHttpActivity extends AppCompatActivity {

    private static final int GET = 0;
    private static final int POST = 1;
    private Button gb,pb;
    private TextView gtv,ptv;
    private OkHttpClient okHttpClient = new OkHttpClient();

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            if(msg.what == GET){
                gtv.setText((String)msg.obj);
            } else if (msg.what == POST) {
                ptv.setText((String)msg.obj);
            }

        }
    };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okhttp);

        gb = findViewById(R.id.ac_ok_gbtn);
        gtv = findViewById(R.id.ac_ok_gtv);
        gb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String url ="https://translate.volcengine.com/?category=&home_language=zh&source_language=detect&target_language=en&text=%E7%BB%93%E6%9E%9C";
                        String result = "";

                        Request request = new Request.Builder()
                                .url(url)
                                .build();
                        try {
                            Response response = okHttpClient.newCall(request).execute();
                            result = response.body().string();

                            Message msg = new Message();
                            msg.what = 0;
                            msg.obj = result;
                            handler.sendMessage(msg);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                });

                thread.start();

            }
        });













        pb = findViewById(R.id.ac_ok_pbtn);
        ptv = findViewById(R.id.ac_ok_ptv);

        pb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        String url = "https://www.iqiyi.com/cloudCinema?vfrm=pcw_home&vfrmblk=712211_topNav&vfrmrst=712211_channel_yunyingyuan";
                    String song = "";
                    String result = "";

                    RequestBody body = RequestBody.create(song, MediaType.parse(song));

                    Request request = new Request.Builder()
                            .url(url)
                            .post(body)
                            .build();
                        try {
                            Response response = okHttpClient.newCall(request).execute();
                            result = response.body().string();

                            Message msg = new Message();
                            msg.what = POST;
                            msg.obj = result;

                            handler.sendMessage(msg);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }


                    }
                });
                thread.start();
            }
        });





    }
}
