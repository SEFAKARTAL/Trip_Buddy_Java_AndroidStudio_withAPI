package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class scene_25 extends AppCompatActivity {
    LinearLayout mainLayout;
    int color = 0;
    ImageView geriButtonn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene25);
        mainLayout = (LinearLayout)findViewById(R.id.mainLayout);
        //Renk değiştirme
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