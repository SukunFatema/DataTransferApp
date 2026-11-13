
package com.example.datatransferapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView displayName, displayEmail;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        displayName = findViewById(R.id.displayName);
        displayEmail = findViewById(R.id.displayEmail);
        backButton = findViewById(R.id.backButton);

        String name = getIntent().getStringExtra("NAME");
        String email = getIntent().getStringExtra("EMAIL");

        displayName.setText("Name: " + name);
        displayEmail.setText("Email: " + email);

        backButton.setOnClickListener(v -> finish());
    }
}
