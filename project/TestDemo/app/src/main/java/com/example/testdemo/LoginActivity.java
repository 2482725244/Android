package com.example.testdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private Button btn;
    private EditText user,pwd;
    private int count = 3;

    private TextView test;
    private String username,password;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn = findViewById(R.id.ac_login_btn);
        user = findViewById(R.id.ac_login_user);
        pwd = findViewById(R.id.ac_login_pwd);
        test = findViewById(R.id.ac_login_more);

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = user.getText().toString();
                password = pwd.getText().toString();
                if(username.equals("12345678900")){
                    if(password.equals("abcdefg123")){
                        Toast.makeText(LoginActivity.this, "欢迎回来尊敬的"+username+"用户", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                        startActivity(intent);
                    }else{
                        count--;
                        Toast.makeText(LoginActivity.this, "密码错误,还有"+count+"次机会", Toast.LENGTH_SHORT).show();
                        pwd.setText("");
                        if (count == 0){
                            finish();
                        }
                    }
                }else{
                    Toast.makeText(LoginActivity.this, "用户名或密码错误", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}
