package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FifthActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        ImageView back= findViewById(R.id.arrow_ios_back5);
        EditText phonenumber = findViewById(R.id.forgetphone_number);
        Button getotp_button = findViewById(R.id.get_otp_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FifthActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });
        getotp_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fphno=phonenumber.getText().toString();
                if(fphno.length()!=10) Toast.makeText(FifthActivity.this, "Invalid Phone Number", Toast.LENGTH_SHORT).show();
                //else if(!EBDICT.containsv(fphno)) Toast.makeText(FifthActivity.this, "Phone Number Not Registered", Toast.LENGTH_SHORT).show();
                else{
                    Intent intent = new Intent(FifthActivity.this, SixthActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

}
