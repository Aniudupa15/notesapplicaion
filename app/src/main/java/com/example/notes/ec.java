package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ec extends AppCompatActivity {
    private CardView maths;
    private CardView os;
    private CardView ddco;
    private CardView java;
    private CardView ds;
    private CardView r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);
        maths=findViewById(R.id.maths);
        os=findViewById(R.id.os);
        ds=findViewById(R.id.ds);
        ddco=findViewById(R.id.ddco);
        java=findViewById(R.id.java);
        r=findViewById(R.id.r);
        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ec.this,math.class));
            }
        });
        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ec.this,os.class));
            }
        });
        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ec.this,ds.class));
            }
        });
        ddco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ec.this,ddco.class));
            }
        });
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ec.this,java.class));
            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ec.this,ddco.class));
            }
        });
    }
}