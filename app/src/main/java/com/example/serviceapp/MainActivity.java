package com.example.serviceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int SPLASH_SCREEN = 5000 ;
    Animation topAnim,bottomAnim;
    TextView header,footer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //animations

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_anime);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_anime);

        //hooks

        header = findViewById(R.id.Header);
        footer = findViewById(R.id.Footer);

        header.setAnimation(topAnim);
        footer.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Lobby.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);


    }
}