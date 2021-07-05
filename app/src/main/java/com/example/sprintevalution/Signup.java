package com.example.sprintevalution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Signup extends AppCompatActivity {
private EditText etdName;
private EditText etdEmail;
private EditText etdPASS;
private Button btnSignup;
private TextView signin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        etdName=findViewById(R.id.etdN);
        etdEmail=findViewById(R.id.etdE);
        etdPASS=findViewById(R.id.etdP);
        btnSignup=findViewById(R.id.btnsignup1);
        signin=findViewById(R.id.textsign);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Signup.this,Signin.class);

            }
        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Signup.this,Homescreen.class);
            }
        });

    }
}