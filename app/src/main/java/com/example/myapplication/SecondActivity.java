package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SecondActivity extends AppCompatActivity {
    public static String curruser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Map<String, String[]> dict = EBDICT.getDictionary();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        TextView signup = findViewById(R.id.signup);
        Button sign_in_button = findViewById(R.id.sign_in_button);
        TextView forgot_pass = findViewById(R.id.forgotpass);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, FourthActivity.class);
                startActivity(intent);
            }
        });
        sign_in_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String user_name = username.getText().toString();
                String pass_word = password.getText().toString();
                if (dict.containsKey(user_name)){
                    String[] check = dict.get(user_name);
                    assert check != null;
                    if (!Objects.equals(check[2], pass_word)){
                        Toast.makeText(SecondActivity.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        curruser=user_name;
                        Intent intent = new Intent(SecondActivity.this, HomeActivity.class);
                        startActivity(intent);
                    }
                }
                else{
                    Toast.makeText(SecondActivity.this, "New User.Please Sign Up", Toast.LENGTH_SHORT).show();
                }

            }
        });
        forgot_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, FifthActivity.class);
                startActivity(intent);
            }
        });

    }


}
