package com.example.textproject.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.textproject.R;
import com.example.textproject.UserBean;

public class LoginActivity extends AppCompatActivity {

    private EditText user,pwd;
    private Button button;
    private TextView textView;
    private UserBean userBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textView = findViewById(R.id.ac_login_tv);
        user = findViewById(R.id.ac_login_user);
        pwd = findViewById(R.id.ac_login_pwd);
        button = findViewById(R.id.ac_login_btn);
        userBean = UserBean.GetUserBean();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (userBean.getUser() != null && userBean.getPwd() != null){
                    if(user.getText().toString().equals(userBean.getUser())){
                        if(pwd.getText().toString().equals(userBean.getPwd())){
                            Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                            startActivity(intent);
                        }else{
                            Toast.makeText(LoginActivity.this, "密码错误", Toast.LENGTH_SHORT).show();

                        }
                    }else {
                        Toast.makeText(LoginActivity.this, "未找到该用户，请先注册", Toast.LENGTH_SHORT).show();

                    }
                }else{
                    Toast.makeText(LoginActivity.this, "未找到该用户，请先注册", Toast.LENGTH_SHORT).show();
                }
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });



    }
}