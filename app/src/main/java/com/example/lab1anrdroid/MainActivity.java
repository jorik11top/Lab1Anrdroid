package com.example.lab1anrdroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startSecondActivity(View view) {
        EditText colorInput = findViewById(R.id.colorInput);
        String selectedColor = colorInput.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("color", selectedColor);
        startActivity(intent);
    }
}