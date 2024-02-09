package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class ddco extends AppCompatActivity {
    private CardView mod1;
    private CardView mod2;
    private CardView mod3;
    private CardView mod4;
    private CardView mod5;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        mod1 = findViewById(R.id.mod1);
        mod2 = findViewById(R.id.mod2);
        mod3 = findViewById(R.id.mod3);
        mod4 = findViewById(R.id.mod4);
        mod5 = findViewById(R.id.mod5);
        mod1.setOnClickListener(v -> {
            String value="https://drive.google.com/file/d/1cZ912IcLQMw2eA2uxf18g49PR4QZMo-W/view?usp=sharing";
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(value));

            // start activity
            startActivity(intent);
        });
        mod2.setOnClickListener(v -> {
            String value="https://drive.google.com/file/d/18FMyKvVI67izJI6hrziSsVQzvC4nUkp5/view?usp=sharing";
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(value));

            // start activity
            startActivity(intent);
        });
        mod3.setOnClickListener(v -> {
            String value="https://drive.google.com/file/d/161BWn6bHurssvoOEcsHlpdNacFkHqtla/view?usp=sharing";
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(value));

            // start activity
            startActivity(intent);
        });
        mod4.setOnClickListener(v -> {
            String value="https://drive.google.com/file/d/1P5lPJlvH-vISXKVKveZYTSpdo6VVHHFj/view?usp=sharing";
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(value));

            // start activity
            startActivity(intent);
        });
        mod5.setOnClickListener(v -> {
            String value="https://drive.google.com/file/d/1P5lPJlvH-vISXKVKveZYTSpdo6VVHHFj/view?usp=sharing";
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(value));

            // start activity
            startActivity(intent);
        });
    }
}