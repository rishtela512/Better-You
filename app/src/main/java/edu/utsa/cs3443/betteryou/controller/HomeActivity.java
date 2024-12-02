package edu.utsa.cs3443.betteryou.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import edu.utsa.cs3443.betteryou.R;

public class HomeActivity extends AppCompatActivity {

    ImageButton push;
    ImageButton pull;
    ImageButton legs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Set up the Toolbar
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Enable the back button in the ActionBar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Show back button
            getSupportActionBar().setDisplayShowTitleEnabled(false); // Hide title for cleaner UI
        }

        // Initialize buttons
        push = findViewById(R.id.imageButton);
        pull = findViewById(R.id.imageButton2);
        legs = findViewById(R.id.imageButton3);

        // Set click listeners
        push.setOnClickListener(v -> {
            Intent push = new Intent(HomeActivity.this, PushActivity.class);
            startActivity(push);
        });

        pull.setOnClickListener(v -> {
            Intent pull = new Intent(HomeActivity.this, PullActivity.class);
            startActivity(pull);
        });

        legs.setOnClickListener(v -> {
            Intent legs = new Intent(HomeActivity.this, LegsActivity.class);
            startActivity(legs);
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) { // Toolbar back button ID
            onBackPressed(); // Navigate back to the previous screen
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
