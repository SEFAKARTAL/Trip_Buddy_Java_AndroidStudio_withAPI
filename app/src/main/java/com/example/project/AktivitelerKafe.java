package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AktivitelerKafe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktiviteler_kafe);
    }
    public void Buton_AnasayfayaGit(View view)
    {
        Intent Buton_AnasayfayaGit = new Intent(AktivitelerKafe.this, scene_11.class);
        Buton_AnasayfayaGit.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(Buton_AnasayfayaGit);
        finish();
    }
    public void Buton_Gezi(View view)
    {
        Intent Buton_Gezi = new Intent(AktivitelerKafe.this, Aktiviteler.class);
        Buton_Gezi.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(Buton_Gezi);
        finish();
    }

    public void Buton_Oyun(View view)
    {
        Intent Buton_Oyun = new Intent(AktivitelerKafe.this, AktivitelerOyun.class);
        Buton_Oyun.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(Buton_Oyun);
        finish();
    }

    public void Buton_Kafe(View view)
    {
        Intent Buton_Kafe = new Intent(AktivitelerKafe.this, AktivitelerKafe.class);
        Buton_Kafe.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(Buton_Kafe);
        finish();
    }

}