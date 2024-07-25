package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Map;
import java.util.Objects;

public class SecurityActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security);
        Button signup = findViewById(R.id.sign_up);
        EditText qn1=findViewById(R.id.q1);
        EditText qn2=findViewById(R.id.q2);
        EditText qn3=findViewById(R.id.q3);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String an1,an2,an3;
                an1=qn1.getText().toString();
                an2=qn2.getText().toString();
                an3=qn3.getText().toString();
                if (an1.length()<1 || an2.length()<1 || an3.length()<1){
                    Toast.makeText(SecurityActivity.this, "Fill Out All The Fields", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(SecurityActivity.this, "Successfully Registered", Toast.LENGTH_SHORT).show();
                    EBDICT.putValue(FourthActivity.New_user,new String[]{FourthActivity.G_mail,FourthActivity.phno,FourthActivity.npas,an1,an2,an3});
                    Intent intent = new Intent(SecurityActivity.this, SecondActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}
