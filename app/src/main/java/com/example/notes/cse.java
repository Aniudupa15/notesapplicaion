package com.example.notes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
public class cse extends AppCompatActivity {
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
                startActivity(new Intent(cse.this,math.class));
            }
        });
        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cse.this,os.class));
            }
        });
        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cse.this,ds.class));
            }
        });
        ddco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cse.this,ddco.class));
            }
        });
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cse.this,java.class));
            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cse.this,ddco.class));
            }
        });
    }
}