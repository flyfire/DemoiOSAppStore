package com.solarexsoft.demoimageview;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView iv = findViewById(R.id.iv);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BigPictureActivity.class);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation
                        (MainActivity.this, iv, "transition:image");
                startActivity(intent, options.toBundle());
            }
        });
    }
}
