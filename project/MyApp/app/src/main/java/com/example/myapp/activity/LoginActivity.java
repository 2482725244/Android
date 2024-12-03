package com.example.myapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapp.R;

public class LoginActivity extends AppCompatActivity {

    private EditText user,pwd;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initCtrlo();
        initTextView();
        buttonLogin();

        //测试用例

        TextView textView1 = findViewById(R.id.ac_login_admin);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,BodyMain.class);
                startActivity(intent);
            }
        });


    }

    private void initTextView() {
        textView = findViewById(R.id.ac_login_toregister);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

    }

    private void buttonLogin() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usertext = String.valueOf(user.getText());
                String pwdtext = String.valueOf(pwd.getText());
                if(usertext.equals("1234567890")){

                    pwd.setText("");
                    if(pwdtext.equals("1234567890")){
                       Intent intent = new Intent(LoginActivity.this,BodyMain.class);
                       startActivity(intent);
                    }
                }
            }
        });

    }

    private void initCtrlo() {

        user = findViewById(R.id.ac_login_user);
        pwd = findViewById(R.id.ac_login_pwd);
        button = findViewById(R.id.ac_login_btn);


    }
}