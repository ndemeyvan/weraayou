package com.apps.devbee.weareyou.noconnexionActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.apps.devbee.weareyou.R;

public class NoConnexionActivity extends AppCompatActivity {
    private Button no_connexion_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_connexion);
        no_connexion_button=findViewById(R.id.no_connexion_button);
        no_connexion_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
