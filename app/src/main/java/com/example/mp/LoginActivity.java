package com.example.mp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    //로그인화면 : 이메일주소 입력칸, 비밀번호 입력칸, 로그인하기 버튼
    EditText ed_mail, ed_pw;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //로그인 화면
        setContentView(R.layout.login);
        ed_mail = findViewById(R.id.ed_mail);
        ed_pw = findViewById(R.id.ed_pw);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail = ed_mail.getText().toString();
                String password = ed_pw.getText().toString();
                if (mail.equals("") || password.equals("")) {
                    Toast.makeText(getApplicationContext(), "사용자 이메일과 비밀번호를 입력해주세요.", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(getApplicationContext(), MenuActivity.class);

                }

            }
        });
    }
}
