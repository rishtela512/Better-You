package edu.utsa.cs3443.betteryou.view;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import edu.utsa.cs3443.betteryou.R;
import edu.utsa.cs3443.betteryou.model.Exercise;
import edu.utsa.cs3443.betteryou.controller.VideoPlayerActivity;

public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder> {

    private final Context context;
    private final List<Exercise> exercises;

    public ExerciseAdapter(Context context, List<Exercise> exercises) {
        this.context = context;
        this.exercises = exercises;
    }

    @NonNull
    @Override
    public ExerciseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_exercise, parent, false);
        return new ExerciseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseViewHolder holder, int position) {
        Exercise exercise = exercises.get(position);

        // Set the exercise name and details
        holder.nameTextView.setText(exercise.getName());
        holder.detailsTextView.setText(exercise.getDetails());

        // Handle video playback
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, VideoPlayerActivity.class);
            intent.putExtra("videoResId", exercise.getVideoResId());
            intent.putExtra("parentActivity", context.getClass().getName()); // Pass parent activity name
            context.startActivity(intent);
        });

        // Handle toggle notes functionality
        holder.toggleNotesButton.setOnClickListener(v -> {
            if (holder.notesSection.getVisibility() == View.GONE) {
                holder.notesSection.setVisibility(View.VISIBLE);
                holder.toggleNotesButton.setText("Hide Notes");
            } else {
                holder.notesSection.setVisibility(View.GONE);
                holder.toggleNotesButton.setText("Add Notes");
            }
        });
    }

    @Override
    public int getItemCount() {
        return exercises.size();
    }

    public static class ExerciseViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView, detailsTextView;
        Button toggleNotesButton;
        View notesSection;

        public ExerciseViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.exercise_name);
            detailsTextView = itemView.findViewById(R.id.exercise_details);
            toggleNotesButton = itemView.findViewById(R.id.toggle_notes_button);
            notesSection = itemView.findViewById(R.id.notes_section);
        }
    }
}
