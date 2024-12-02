package edu.utsa.cs3443.betteryou.controller;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import edu.utsa.cs3443.betteryou.R;
import edu.utsa.cs3443.betteryou.model.Exercise;
import edu.utsa.cs3443.betteryou.view.ExerciseAdapter;

public class LegsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ExerciseAdapter exerciseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs);

        // Set up the Toolbar
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Enable the back button in the ActionBar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Show back button
            getSupportActionBar().setDisplayShowTitleEnabled(false); // Optional: Hide title for cleaner UI
        }

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Populate the list of exercises for Leg workouts
        ArrayList<Exercise> exercises = new ArrayList<>();
        exercises.add(new Exercise("Barbell Squats", "4 Sets of 10 Reps", R.raw.squat));
        exercises.add(new Exercise("Barbell Romanian Deadlifts (RDLs)", "3 Sets of 10 Reps", R.raw.rdl));
        exercises.add(new Exercise("Standing Calf Raises", "3 Sets of 10 Reps", R.raw.calf_raise));
        exercises.add(new Exercise("Leg Extensions", "4 Sets of 12 Reps", R.raw.leg_extension));

        // Set up the adapter with the exercise data
        exerciseAdapter = new ExerciseAdapter(this, exercises);
        recyclerView.setAdapter(exerciseAdapter);
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
