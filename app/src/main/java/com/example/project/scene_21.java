package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class scene_21 extends AppCompatActivity {

    ConstraintLayout mainLayout;
    TextView darkThemeButton,textView7;
    int color =0;
    ImageView geriButtonn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene21);

        mainLayout = (ConstraintLayout)findViewById(R.id.mainLayout);
        darkThemeButton = (TextView) findViewById(R.id.darkThemeButton);
        color = getIntent().getIntExtra("Color",R.drawable.bg);
        mainLayout.setBackgroundResource(color);
        geriButtonn = (ImageView)findViewById(R.id.geriButtonn);
        textView7 = (TextView)findViewById(R.id.textView7);
        geriButtonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        darkThemeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),scene_11.class);
                intent.putExtra("Color", R.drawable.bg_lite);
                startActivity(intent);
            }
        });
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),scene_11.class);
                startActivity(intent);

            }
        });
    }

}