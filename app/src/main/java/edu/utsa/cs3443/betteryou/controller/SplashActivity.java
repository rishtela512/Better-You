package edu.utsa.cs3443.betteryou.controller;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import edu.utsa.cs3443.betteryou.R;
import edu.utsa.cs3443.betteryou.MainActivity;

public class SplashActivity extends AppCompatActivity {

    private static final String TEXT_TO_DISPLAY = "BetterYou";
    private static final int TYPING_DELAY = 150; // Delay per character in ms
    private TextView titleText;
    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Find views
        titleText = findViewById(R.id.title_text);
        startButton = findViewById(R.id.start_button);

        // Initially hide the button
        startButton.setVisibility(View.INVISIBLE);

        // Animate the typing of "BetterYou"
        animateText(TEXT_TO_DISPLAY);

        // Fade in the button after the text finishes typing
        new Handler().postDelayed(() -> fadeInButton(startButton), (TEXT_TO_DISPLAY.length() + 1) * TYPING_DELAY);

        // Button click listener to navigate to MainActivity
        startButton.setOnClickListener(v -> {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            finish(); // Remove SplashActivity from back stack
        });
    }

    private void animateText(String text) {
        final Handler handler = new Handler();
        final StringBuilder displayedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            final int index = i;
            handler.postDelayed(() -> {
                displayedText.append(text.charAt(index));
                titleText.setText(displayedText.toString());
            }, i * TYPING_DELAY);
        }
    }

    private void fadeInButton(Button button) {
        // Set initial alpha to 0 (invisible)
        button.setAlpha(0f);
        button.setVisibility(View.VISIBLE);

        // Use ObjectAnimator to fade in the button
        ObjectAnimator fadeIn = ObjectAnimator.ofFloat(button, "alpha", 0f, 1f);
        fadeIn.setDuration(1000); // 1 second duration for fade-in
        fadeIn.start();
    }
}
