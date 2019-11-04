package com.example.splash_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    private Button proceed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        proceed=(Button) findViewById(R.id.button_login);
        proceed.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                home_();
            }

        });

    }

    public void home_()
    {
        Intent intent = new Intent(this,bottom_navigation.class);
        startActivity(intent);

    }


}
