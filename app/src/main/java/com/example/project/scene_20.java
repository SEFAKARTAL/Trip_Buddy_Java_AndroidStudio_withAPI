package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class scene_20 extends AppCompatActivity {
    TextView yabancıDilButton;
    ConstraintLayout mainLayout;
    int color = 0;
    ImageView geriButtonn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene20);

        yabancıDilButton = (TextView)findViewById(R.id.yabancıDilButton);
        mainLayout = (ConstraintLayout)findViewById(R.id.mainLayout);
        color = getIntent().getIntExtra("Color",R.drawable.bg);
        mainLayout.setBackgroundResource(color);
        geriButtonn = (ImageView)findViewById(R.id.geriButtonn);

        geriButtonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}