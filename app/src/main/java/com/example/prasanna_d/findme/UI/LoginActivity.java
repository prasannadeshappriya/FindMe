package com.example.prasanna_d.findme.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.prasanna_d.findme.Constants;
import com.example.prasanna_d.findme.R;

public class LoginActivity extends AppCompatActivity {
    private EditText input_email;
    private EditText input_password;
    private Button btn_login;
    private TextView link_signup;

    private void init(){
        input_email = (EditText)findViewById(R.id.input_email);
        input_password = (EditText)findViewById(R.id.input_password);
        btn_login = (Button)findViewById(R.id.btn_login);
        link_signup = (TextView)findViewById(R.id.link_signup);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Initialize components
        init();

        //Configure click listeners
        btn_login.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        loginUser(v);
                    }
                }
        );

        link_signup.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showRegisterPage(v);
                    }
                }
        );
    }

    private void showRegisterPage(View v) {
        Intent i = new Intent(this, RegisterActivity.class);
        startActivity(i);
        overridePendingTransition(android.R.anim.slide_in_left,
                android.R.anim.slide_out_right);
    }

    private void loginUser(View v) {
        Constants.printLog("Login button pressed");
    }
}
