package com.example.firebase_practice_android;
import android.content.Intent;
import android.os.Bundle;//
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;  //


public class MainActivity extends AppCompatActivity { //

    private Button register;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//
        setContentView(R.layout.activity_main);

        register = findViewById(R.id.register);
        login = findViewById(R.id.login);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RegisterActivity2.class));
                finish();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginActivity2.class));
                finish();
            }
        });

    }


}