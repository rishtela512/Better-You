package edu.utsa.cs3443.betteryou.model;

public class Exercise {
    private String name;        // Name of the exercise
    private String details;     // Details (reps/sets) of the exercise
    private int videoResId;     // Resource ID of the exercise video

    // Constructor
    public Exercise(String name, String details, int videoResId) {
        this.name = name;
        this.details = details;
        this.videoResId = videoResId;
    }

    // Getter for exercise name
    public String getName() {
        return name;
    }

    // Getter for exercise details
    public String getDetails() {
        return details;
    }

    // Getter for video resource ID
    public int getVideoResId() {
        return videoResId;
    }
}
