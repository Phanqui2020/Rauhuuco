package com.example.falcon.rauhuuco.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.falcon.rauhuuco.R;

/**
 * Created by falcon on 26/10/2017.
 */

public class SignUpActivity extends AppCompatActivity{

    EditText edtPhone,edtPass,edtRePass;
    Button btnSignUp,btnSingIn;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_sign_up);

        addControls();
        addEvents();

    }

    private void addEvents() {
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this,SignInActivity.class);
                startActivity(intent);
            }
        });
    }

    private void addControls() {
        edtPhone = (EditText) findViewById(R.id.edtPhone);
        edtPass = (EditText) findViewById(R.id.edtPass);
        edtRePass = (EditText) findViewById(R.id.edtRePass);



    }
}
