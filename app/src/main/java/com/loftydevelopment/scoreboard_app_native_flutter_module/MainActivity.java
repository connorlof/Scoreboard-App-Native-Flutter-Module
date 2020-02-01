package com.loftydevelopment.scoreboard_app_native_flutter_module;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import io.flutter.embedding.android.FlutterActivity;


public class MainActivity extends AppCompatActivity {

    private static final int SPLASH_SCREEN_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        startActivity(FlutterActivity.createDefaultIntent(this));
        
        new Handler().postDelayed(() -> {
            Intent i = new Intent(MainActivity.this,
                    CounterActivity.class);
            startActivity(i);
            finish();

        }, SPLASH_SCREEN_TIME_OUT);
    }
}