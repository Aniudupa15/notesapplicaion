package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText email;
private EditText password;
private Button login;
private CheckBox remember;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        login=findViewById(R.id.login);
        remember=findViewById(R.id.remember);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (email.getText().toString().equals("user@gmail.com") && password.getText().toString().equals("1234")) {
                        Toast.makeText(MainActivity.this, "login Successfull", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this, MainActivity3.class));
                    } else {
                        Toast.makeText(MainActivity.this, "login failed", Toast.LENGTH_SHORT).show();
                    }
            }
        });
    }
}