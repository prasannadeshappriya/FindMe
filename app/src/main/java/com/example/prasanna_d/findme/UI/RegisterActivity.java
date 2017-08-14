package com.example.prasanna_d.findme.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.prasanna_d.findme.R;

public class RegisterActivity extends AppCompatActivity {
    private EditText input_name;
    private EditText input_email;
    private EditText input_password;
    private EditText input_repassword;
    private Button btn_signup;
    private TextView link_login;

    private void init(){
        input_name = (EditText) findViewById(R.id.input_name);
        input_email = (EditText) findViewById(R.id.input_email);
        input_password = (EditText) findViewById(R.id.input_password);
        input_repassword = (EditText) findViewById(R.id.input_repassword);
        btn_signup = (Button) findViewById(R.id.btn_signup);
        link_login = (TextView) findViewById(R.id.link_login);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //Initialize components
        init();

        link_login.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showLoginPage(v);
                    }
                }
        );

        btn_signup.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        registerUser(v);
                    }
                }
        );
    }

    private void registerUser(View v) {
    }

    private void showLoginPage(View v) {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
        overridePendingTransition(android.R.anim.slide_out_right,
                android.R.anim.slide_in_left);
    }
}
