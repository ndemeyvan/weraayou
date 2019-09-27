package com.apps.devbee.weareyou.splashScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.apps.devbee.weareyou.MainActivity;
import com.apps.devbee.weareyou.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler(  ).postDelayed (new Runnable () {
            @Override
            public void run() {
                Intent gotochoice= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(gotochoice);
                finish();
            }
        }, 3000 );
        //SystemClock.sleep(3000);


    }
}
