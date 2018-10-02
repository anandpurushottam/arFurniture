package com.google.ar.sceneform.samples.hellosceneform;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class HomeScreenActivity extends AppCompatActivity {
    public static int TYPE_CHAIR = 1;
    public static int TYPE_TABLE = 2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);

        findViewById(R.id.chair).setOnClickListener(v -> {
            startActivity(HelloSceneformActivity.createIntent(this, TYPE_CHAIR));
        });

        findViewById(R.id.clock).setOnClickListener(v -> {
            startActivity(HelloSceneformActivity.createIntent(this, TYPE_TABLE));
        });
    }
}
