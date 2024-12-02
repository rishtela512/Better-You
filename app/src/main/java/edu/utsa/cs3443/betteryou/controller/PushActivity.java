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

public class PushActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ExerciseAdapter exerciseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_push);

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

        // Populate the list of exercises for Push workouts
        ArrayList<Exercise> exercises = new ArrayList<>();
        exercises.add(new Exercise("Flat Barbell Bench Press", "4 Sets of 10 Reps", R.raw.benchpress));
        exercises.add(new Exercise("Incline Barbell Bench Press", "3 Sets of 12 Reps", R.raw.inclinebenchpress));
        exercises.add(new Exercise("Dumbbell Lateral Raises", "3 Sets of 15 Reps", R.raw.lateralraises));
        exercises.add(new Exercise("Dips", "3 Sets of 12 Reps", R.raw.dips));

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
