package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class VInfo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vinfo);
        ImageView ho= findViewById(R.id.home);
        ImageView ma= findViewById(R.id.map);
        ImageView pro= findViewById(R.id.prof);

        ho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(VInfo.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(VInfo.this, MapsActivity.class);
                startActivity(intent);
            }
        });
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(VInfo.this, Uprof.class);
                startActivity(intent);
            }
        });

        ImageView hserv= findViewById(R.id.home_serv);
        ImageView mparts= findViewById(R.id.mech_parts);
        ImageView abt= findViewById(R.id.about);
        ImageView loc= findViewById(R.id.location);

        hserv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(VInfo.this, HServ.class);
                startActivity(intent);
            }
        });
        mparts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(VInfo.this, MPart.class);
                startActivity(intent);
            }
        });
        abt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(VInfo.this, About.class);
                startActivity(intent);
            }
        });
        loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(VInfo.this, MapsActivity.class);
                startActivity(intent);
            }
        });
    }
}