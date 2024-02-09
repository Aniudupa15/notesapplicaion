package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class os extends AppCompatActivity {
    private CardView mod1;
    private CardView mod2;
    private CardView mod3;
    private CardView mod4;
    private CardView mod5;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os);
        mod1 = findViewById(R.id.mod1);
        mod2 = findViewById(R.id.mod2);
        mod3 = findViewById(R.id.mod3);
        mod4 = findViewById(R.id.mod4);
        mod5 = findViewById(R.id.mod5);
        mod1.setOnClickListener(v -> {
            String value="https://drive.google.com/file/d/1yhB6aUxroj1RJYgjNpgBAYp_87m_6z9T/view?usp=sharing";
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(value));

            // start activity
            startActivity(intent);
        });
        mod2.setOnClickListener(v -> {
            String value="https://drive.google.com/file/d/1v9Ufw7_VpXDMDiiyZcLp3XFkpjIqkx5z/view?usp=sharing";
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(value));

            // start activity
            startActivity(intent);
        });
        mod3.setOnClickListener(v -> {
            String value="https://drive.google.com/file/d/1jBZM9WdcRwTgRlTMIXE8_BZZlaM2YCA-/view?usp=sharing";
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(value));

            // start activity
            startActivity(intent);
        });
        mod4.setOnClickListener(v -> {
            String value="https://drive.google.com/file/d/1lvtPslv2SzyQRpw7PKBorSnZYjU_jE9j/view?usp=sharing";
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(value));

            // start activity
            startActivity(intent);
        });
        mod5.setOnClickListener(v -> {
            String value="https://drive.google.com/file/d/1lvtPslv2SzyQRpw7PKBorSnZYjU_jE9j/view?usp=sharing";
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(value));

            // start activity
            startActivity(intent);
        });
    }
}