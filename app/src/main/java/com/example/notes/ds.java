package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class ds extends AppCompatActivity {
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
            String value = "https://drive.google.com/file/d/1n6XBQk5ohmZ2TWiaV7HFyd61cVN1V5zi/view?usp=sharing";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(value));

            // start activity
            startActivity(intent);
        });
        mod2.setOnClickListener(v -> {
            String value = "https://drive.google.com/file/d/1Xy9xRSLmWOMrMH0nyv2rH3pwVeb9A5B8/view?usp=sharing";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(value));

            // start activity
            startActivity(intent);
        });
        mod3.setOnClickListener(v -> {
            String value = "https://drive.google.com/file/d/1DGfsNOz0cSwJGeQFYM9drzodFG82uFSM/view?usp=sharing";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(value));

            // start activity
            startActivity(intent);
        });
        mod4.setOnClickListener(v -> {
            String value = "https://drive.google.com/file/d/1a6F6oc98eUKmsVNNlcHH0oKEqKnl15vz/view?usp=sharing";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(value));

            // start activity
            startActivity(intent);
        });
        mod5.setOnClickListener(v -> {
            String value = "https://drive.google.com/file/d/1a6F6oc98eUKmsVNNlcHH0oKEqKnl15vz/view?usp=sharing";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(value));

            // start activity
            startActivity(intent);
        });
    }
}
