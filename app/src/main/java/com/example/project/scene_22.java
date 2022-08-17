package com.example.project;





import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class scene_22 extends AppCompatActivity {
    LinearLayout mainLayout;
    int color = 0;
    ImageView geriButtonn;
    protected LocationManager locationManager;
    protected LocationListener locationListener;
    protected Context context;

    TextView textView4,textView5,textView1,textView2,textView3;
    FusedLocationProviderClient fusedLocationProviderClient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene22);

        mainLayout = (LinearLayout)findViewById(R.id.mainLayout);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        geriButtonn = (ImageView)findViewById(R.id.geriButtonn);



        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);



        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ActivityCompat.checkSelfPermission(scene_22.this,
                        Manifest.permission.ACCESS_FINE_LOCATION)== PackageManager.PERMISSION_GRANTED){
                    getLocation();
                }else{
                    ActivityCompat.requestPermissions(scene_22.this,
                            new String[]{Manifest.permission.ACCESS_FINE_LOCATION},44);
                }
            }
        });

        geriButtonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        //Renk değiştirme
        color = getIntent().getIntExtra("Color",R.drawable.bg);
        mainLayout.setBackgroundResource(color);

    }

    @SuppressLint("MissingPermission")
    private void getLocation() {
        fusedLocationProviderClient.getLastLocation().addOnCompleteListener(new OnCompleteListener<Location>() {
            @Override
            public void onComplete(@NonNull Task<Location> task) {
                Location location= task.getResult();
                if(location != null){

                    try {
                        Geocoder geocoder = new Geocoder(scene_22.this, Locale.getDefault());
                        List<Address> addresses = geocoder.getFromLocation(
                                location.getLatitude(),location.getLongitude(),1
                        );
                        textView1.setText(Html.fromHtml(
                                "<font color='#6200EE'><b>adress:</b><br></font>"
                                        + addresses.get(0).getLatitude()
                        ));
                        textView2.setText(Html.fromHtml(
                                "<font color='#6200EE'><b>adress:</b><br></font>"
                                        + addresses.get(0).getLongitude()
                        ));
                        textView3.setText(Html.fromHtml(
                                "<font color='#6200EE'><b>adress:</b><br></font>"
                                        + addresses.get(0).getCountryName()
                        ));
                        textView4.setText(Html.fromHtml(
                              "Konumunun Belirlendi"
                        ));

                        textView5.setText(Html.fromHtml(
                                "<font color='#6200EE'><b>adress:</b><br></font>"
                                        + addresses.get(0).getAddressLine(0)
                        ));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}



