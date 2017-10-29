package com.example.falcon.rauhuuco.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.falcon.rauhuuco.R;

/**
 * Created by falcon on 15/10/2017.
 */

public class SignInActivity extends AppCompatActivity{

    Button btnDN,btnDK;
    EditText edtPhone,edtPass;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        addControlls();
        addEvents();
    }

    private void addControlls() {
        btnDN = (Button) findViewById(R.id.btnDN);
        btnDK = (Button) findViewById(R.id.btnDK);
        edtPhone = (EditText) findViewById(R.id.edtPhone);
        edtPass = (EditText) findViewById(R.id.edtPass);
    }

    private void addEvents() {
        btnDK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });
        btnDN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(SignInActivity.this,ManHinhChinh.class);
                startActivity(it);
            }
        });
    }
}
