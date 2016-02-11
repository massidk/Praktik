package com.lora.bournonvillesflow;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login_Page extends AppCompatActivity implements View.OnClickListener{

    Button mLogin, mLoginToReg;
    EditText mUsername,mPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__page);

        mUsername = (EditText) findViewById(R.id.edit_userText);
        mPassword = (EditText) findViewById(R.id.edit_passwordText);
        mLogin = (Button) findViewById(R.id.login_button);
        mLoginToReg = (Button) findViewById(R.id.login_ToReg_button);

        mLogin.setOnClickListener(this);
        mLoginToReg.setOnClickListener(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login_button:

                break;
            case R.id.login_ToReg_button:
                startActivity(new Intent(this, Register.class));
                break;

        }
    }
}
