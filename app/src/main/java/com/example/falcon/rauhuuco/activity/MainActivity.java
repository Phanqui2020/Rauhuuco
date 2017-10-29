package com.example.falcon.rauhuuco.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.falcon.rauhuuco.R;

public class MainActivity extends AppCompatActivity {

    Button btnSIA, btnSUA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }


    private void addControls() {
        btnSIA = (Button) findViewById(R.id.btnSIA);
        btnSUA = (Button) findViewById(R.id.btnSUA);


    }

    private void addEvents() {
        btnSIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // chuyển đến màn hình tạo tài khoản
                Intent intent = new Intent(MainActivity.this,SignInActivity.class);
                startActivity(intent);
            }
        });
        btnSUA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,SignUpActivity.class);
                startActivity(it);
            }
        });



    }

    private void Xulydangnhap() {


    }


}
