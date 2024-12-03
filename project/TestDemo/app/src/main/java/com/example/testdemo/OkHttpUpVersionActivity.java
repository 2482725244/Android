package com.example.testdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OkHttpUpVersionActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private OkHttpClient okHttpClient = new OkHttpClient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ok_http_up_version);
        button = findViewById(R.id.ac_oup_btn);
        textView = findViewById(R.id.ac_oup_tv);
        initBUtton();

    }

    private void initBUtton() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                synGet();
//                synPost();
//                unSynGet();
                unSynPost();


            }
        });
    }

    private void synGet() {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                String url = "https://www.baidu.com";
                Request request = new Request.Builder()
                        .url(url)
                        .build();

                try {
                    Response response = okHttpClient.newCall(request).execute();
                    String result = response.body().string();

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            textView.setText(result);
                        }
                    });

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();
    }

    private void unSynGet() {
        String url = "https://www.baidu.com/";

        Request request = new Request.Builder()
                .url(url)
                .build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        textView.setText("获取失败");
                    }
                });
            }

            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                    String result = response.body().string();
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            textView.setText(result);
                        }
                    });
            }
        });

    }

    private void synPost() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                String url = "https://www.baidu.com/";
                FormBody formBody = new FormBody.Builder()
                        .add("test","null")
                        .build();
                RequestBody requestBody = RequestBody.create("aaa", MediaType.parse("aaa"));

                Request request = new Request.Builder()
                        .url(url)
                        .post(formBody)
                        .build();

                try {
                    Response response = okHttpClient.newCall(request).execute();
                    String result = response.body().string();

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            textView.setText(result);
                        }
                    });

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        }).start();

    }

    private void unSynPost() {
        String url = "https://www.baidu.com/";
        FormBody formBody = new FormBody.Builder()
                .add("test","null")
                .build();

        RequestBody requestBody = RequestBody.create("test", MediaType.parse("null"));

        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .build();

        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        textView.setText("获取失败");
                    }
                });
            }

            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                String result = response.body().string();

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        textView.setText(result);
                    }
                });
            }
        });

    }


}