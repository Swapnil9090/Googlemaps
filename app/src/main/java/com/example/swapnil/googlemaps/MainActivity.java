package com.example.swapnil.googlemaps;

import android.app.ActionBar;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

public class MainActivity extends AppCompatActivity {
    CardView c1,c2,c3,c4,c5,c6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(CardView)findViewById(R.id.c1);
        c2=(CardView)findViewById(R.id.c2);
        c3=(CardView)findViewById(R.id.c3);
        c4=(CardView)findViewById(R.id.c4);
        c5=(CardView)findViewById(R.id.c5);
        c6=(CardView)findViewById(R.id.c6);

    c1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent(MainActivity.this,satelliteweather.class);
            startActivity(i);
        }
    });
    c6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://rural.nic.in/departments/departments-of-mord/department-rural-development"));
            startActivity(browserIntent);

        }
    });

    c2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            //govt programme
            Intent i=new Intent(MainActivity.this,govtprogramme.class);
            startActivity(i);

        }
    });

    c3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //yard price
            Intent i=new Intent(MainActivity.this,Yardprice.class);
            startActivity(i);


        }
    });

    c4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //govt grant

            Intent i = new Intent(MainActivity.this,Grant0.class);
            startActivity(i);
        }
    });

    c5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //electricity

            Intent i=new Intent(MainActivity.this,electricity.class);
            startActivity(i);
        }
    });


    }

}
