package com.example.serviceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Lobby extends AppCompatActivity {

    ImageView mElect,mCons,mCarp,mPaint,mMech,mPlumb;
    Button mLogin;
    TextView mClick,mAbout,mContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);

        mElect = findViewById(R.id.electButton);
        mCons = findViewById(R.id.consButton);
        mCarp = findViewById(R.id.carpButton);
        mPaint = findViewById(R.id.paintButton);
        mMech = findViewById(R.id.mechButton);
        mPlumb = findViewById(R.id.plumbButton);

        mLogin = findViewById(R.id.loginBtn);

        mClick = findViewById(R.id.textView4);
        mAbout = findViewById(R.id.AboutUs);
        mContact = findViewById(R.id.ContactUs);

        mElect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lobby.this,Electrician.class);
                startActivity(intent);
            }
        });

        mCons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lobby.this,Constructor.class);
                startActivity(intent);
            }
        });

        mCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lobby.this,Carpenter.class);
                startActivity(intent);
            }
        });

        mPaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lobby.this,Painter.class);
                startActivity(intent);
            }
        });

        mMech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lobby.this,Mechanic.class);
                startActivity(intent);
            }
        });

        mPlumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lobby.this,Plumber.class);
                startActivity(intent);
            }
        });

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lobby.this,Login.class);
                startActivity(intent);
            }
        });

        mClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lobby.this,Register.class);
                startActivity(intent);
            }
        });

        






    }
}