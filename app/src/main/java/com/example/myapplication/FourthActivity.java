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

public class FourthActivity extends AppCompatActivity {
    public static String New_user,phno,G_mail,npas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Button signinup = findViewById(R.id.sign_up_in);
        ImageView back= findViewById(R.id.back_arrow);
        EditText mail=findViewById(R.id.gmail);
        EditText ph_no=findViewById(R.id.phonenumber);
        EditText n_pas=findViewById(R.id.npassword);
        EditText nc_pas=findViewById(R.id.ncpassword);
        EditText n_username = findViewById(R.id.nusername);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FourthActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });
        signinup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                New_user = n_username.getText().toString();
                G_mail = mail.getText().toString();
                phno = ph_no.getText().toString();
                npas = n_pas.getText().toString();
                String ncpas = nc_pas.getText().toString();
                if (New_user.length()<4)
                    Toast.makeText(FourthActivity.this, "Username - Minimum 4 Characters", Toast.LENGTH_SHORT).show();
                else if (EBDICT.containsK(New_user))
                    Toast.makeText(FourthActivity.this, "Username Already Exists", Toast.LENGTH_SHORT).show();
                else if (!(G_mail.contains("@") && G_mail.contains(".com")))
                    Toast.makeText(FourthActivity.this, "Invalid Email ID", Toast.LENGTH_SHORT).show();
                else if (phno.length()!=10)
                    Toast.makeText(FourthActivity.this, "Invalid Phone Number", Toast.LENGTH_SHORT).show();
                else if (!Objects.equals(npas, ncpas))
                    Toast.makeText(FourthActivity.this, "Password Does Not Match", Toast.LENGTH_SHORT).show();
                else if (npas.length()<8)
                    Toast.makeText(FourthActivity.this, "Password - Minimum 8 Characters", Toast.LENGTH_SHORT).show();
                else {
                    Intent intent = new Intent(FourthActivity.this, SecurityActivity.class);
                    startActivity(intent);
                }

            }
        });

    }
}
