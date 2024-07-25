package com.example.myapplication;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class SixthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        ImageView back2= findViewById(R.id.arrow_ios_back6);

        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(SixthActivity.this, FifthActivity.class);
                startActivity(intent);

            }
        });
        Button signup = findViewById(R.id.confirm_button);
        EditText use=findViewById(R.id.user);
        EditText an1=findViewById(R.id.ans1);
        EditText an2=findViewById(R.id.ans2);
        EditText an3=findViewById(R.id.ans3);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u1,a1,a2,a3;
                u1=use.getText().toString();
                a1=an1.getText().toString();
                a2=an2.getText().toString();
                a3=an3.getText().toString();
                if ((Objects.equals(an1,(EBDICT.getValue(u1))[3]) && Objects.equals(an2,(EBDICT.getValue(u1))[3]) && Objects.equals(an3,(EBDICT.getValue(u1))[3]))){
                    Toast.makeText(SixthActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(SixthActivity.this, "Successfully Registered", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SixthActivity.this, SecondActivity.class);

                    startActivity(intent);
                }

            }
        });
    }
}
