package com.example.splash_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button login;
    private Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signup=(Button) findViewById(R.id.splash_signup);
        signup.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                signup_();
            }

        });

        login=(Button) findViewById(R.id.splash_login);


        login.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                login_();
            }

        });
    }

    public void login_()
    {
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);
    }

    public void signup_()
    {
        Intent intent = new Intent(this,Signup.class);
        startActivity(intent);
    }
}
