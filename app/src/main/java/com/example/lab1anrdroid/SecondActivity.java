package com.example.lab1anrdroid;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String selectedColor = intent.getStringExtra("color");

        TextView colorDisplay = findViewById(R.id.colorDisplay);
        colorDisplay.setBackgroundColor(getColorForName(selectedColor));
    }

    private int getColorForName(String colorName) {
        switch (colorName) {
            case "red":
                return Color.RED;
            case "green":
                return Color.GREEN;
            case "blue":
                return Color.BLUE;
            default:
                return Color.WHITE;
        }
    }
}