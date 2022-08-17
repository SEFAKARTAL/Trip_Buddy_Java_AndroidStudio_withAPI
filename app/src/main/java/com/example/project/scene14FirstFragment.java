package com.example.project;

import static androidx.constraintlayout.motion.widget.Debug.getLocation;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import java.io.IOException;
import java.util.List;
import java.util.Locale;


public class scene14FirstFragment extends Fragment {
    private ViewGroup container;
    Button acilAraButton,navigateToMapsOne,navigateToMapsTwo;
    protected LocationManager locationManager;
    protected LocationListener locationListener;
    protected Context context;
    TextView konumText;
    FusedLocationProviderClient fusedLocationProviderClient;


    public scene14FirstFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first_scene14, container, false); //MainActivity'de 112 Arama butonu yaparsak bütün tablarda görünür. Fragment'ta yapmak istiyorsak view ile button id si aratmamız gerekiyor.
        Init(view);

        navigateToMaps();

        return view;

    }

    public void Init(View view){
        acilAraButton = (Button)view.findViewById(R.id.acilAraButton);
        navigateToMapsOne = (Button)view.findViewById(R.id.navigateToMapsOne);
        navigateToMapsTwo = (Button)view.findViewById(R.id.navigateToMapsTwo);
        konumText = (TextView)view.findViewById(R.id.konumText);


    }




    public void navigateToMaps(){
        navigateToMapsOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:03762126160");
                Intent intent = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);
            }
        });    navigateToMapsTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:03762126160");
                Intent intent = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);
            }
        });

    }


}