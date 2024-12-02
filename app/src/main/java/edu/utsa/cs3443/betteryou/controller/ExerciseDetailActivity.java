package edu.utsa.cs3443.betteryou.controller;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import edu.utsa.cs3443.betteryou.R;

public class ExerciseDetailActivity extends AppCompatActivity {
    private VideoView videoView;
    private EditText notes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_detail);

        // Retrieve data passed via Intent
        String exerciseName = getIntent().getStringExtra("exerciseName");
        int videoResId = getIntent().getIntExtra("exerciseVideo", 0);

        // Find views by ID
        TextView title = findViewById(R.id.exerciseTitle);
        videoView = findViewById(R.id.videoView);
        notes = findViewById(R.id.notes);

        // Set exercise title and play video
        title.setText(exerciseName);
        if (videoResId != 0) { // Check if videoResId is valid
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + videoResId);
            videoView.start();
        }
    }
}
