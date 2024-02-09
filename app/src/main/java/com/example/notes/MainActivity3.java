package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {
    private CardView notes;
    private CardView attendence;
    private CardView marks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        notes=findViewById(R.id.notes);
        attendence=findViewById(R.id.attendence);
        marks=findViewById(R.id.marks);
        marks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value="https://www.canaraengineering.in/s_ma";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(value));

                // start activity
                startActivity(intent);
            }
        });
        attendence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value="https://www.canaraengineering.in/s_attd";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(value));

                // start activity
                startActivity(intent);
            }
        });
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity3.this,MainActivity2.class));
            }
        });
    }
}