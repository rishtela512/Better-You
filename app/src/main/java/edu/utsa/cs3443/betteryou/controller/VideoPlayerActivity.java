package edu.utsa.cs3443.betteryou.controller;

import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import edu.utsa.cs3443.betteryou.R;

public class VideoPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        // Set up the Toolbar
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Enable the back button in the ActionBar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Show back button
            getSupportActionBar().setDisplayShowTitleEnabled(false); // Hide title for a cleaner look
        }

        // Set up the VideoView
        VideoView videoView = findViewById(R.id.videoView);

        // Get video resource ID passed from the previous activity
        int videoResId = getIntent().getIntExtra("videoResId", -1);

        // Play video if resource ID is valid
        if (videoResId != -1) {
            Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + videoResId);
            videoView.setVideoURI(videoUri);

            // Add MediaController for playback controls
            MediaController mediaController = new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);

            videoView.start(); // Start playback
        }
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
