package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {
private CardView cse;
private CardView ise;
private CardView csbs;
private CardView csd;
private CardView aiml;
private CardView ec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        cse=findViewById(R.id.cse);
        ise=findViewById(R.id.is);
        csbs=findViewById(R.id.csbs);
        csd=findViewById(R.id.csd);
        aiml=findViewById(R.id.aiml);
        ec=findViewById(R.id.ec);
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,cse.class));
            }
        });
        ise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,ise.class));
            }
        });
        csbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,csbs.class));
            }
        });
        csd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,csd.class));
            }
        });
        aiml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,aiml.class));
            }
        });
        ec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,ec.class));
            }
        });
    }
}