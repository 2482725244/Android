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

public class RegisterActivity extends AppCompatActivity {

    private EditText user,pwd;
    private Button button;
    UserBean userBean;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        textView = findViewById(R.id.ac_register_tv);
        user = findViewById(R.id.ac_register_user);
        pwd = findViewById(R.id.ac_register_pwd);
        button = findViewById(R.id.ac_register_btn);

        userBean = UserBean.GetUserBean();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!user.getText().toString().equals("")  && !pwd.getText().toString().equals("")){
                    userBean.setUser(user.getText().toString());
                    userBean.setPwd(pwd.getText().toString());
                    textView.setText("注册完成");
                    Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(RegisterActivity.this, "请设置账号密码后再注册", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}