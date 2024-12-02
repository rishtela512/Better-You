# BetterYou Fitness App

## Overview
The **BetterYou Fitness App** is a workout management application designed to provide users with detailed exercise information and video demonstrations. The app features categorized workout screens for **Push**, **Pull**, and **Leg** exercises, along with login and signup functionalities.

---

## Features

### Working Features:
- **Splash Screen**: Displays while the app initializes and transitions to the main screen.
- **Login and Signup**: Allows users to log in or register for an account.
- **Workout Categories**:
  - **Push Workouts**: Displays a list of push exercises.
  - **Pull Workouts**: Displays a list of pull exercises.
  - **Leg Workouts**: Displays a list of leg exercises.
- **Exercise Details**: Shows information about a selected exercise, including descriptions and an optional video demonstration.
- **Video Player**: Plays workout demonstration videos directly within the app.
- **Responsive UI**: Optimized for various screen sizes and orientations.

### Known Issues/Limitations:
- No backend or database integration for persistent user accounts (login/signup is static).
- Limited exercise data (static data used for demonstration purposes).
- Requires an active internet connection to stream exercise videos.
- No error handling for video playback failures.

---

## Prerequisites

To run the **BetterYou Fitness App**, ensure you have the following:
- **Java Development Kit (JDK)** version 8 or later.
- **Android Studio** version 2020.3.1 or later.
- An Android device or emulator (API level 23 or higher).
- Active internet connection for video playback.

---

## How to Clone and Run the Application

Follow these steps to clone and run the application:

1. Clone the repository:
   ```bash
   git clone https://github.com/rishtela512/Better-You.git

2. Open the project in Android Studio:
Launch Android Studio.
Click File > Open and select the project directory.

3. Sync the project with Gradle:
Go to File > Sync Project with Gradle Files.

4. Run the application:
Connect an Android device or start an emulator.
Click the Run button in Android Studio or press Shift + F10.

## Testing/demo data
The project includes preloaded static data for testing and demonstration:
-Exercise List: Contains static exercise names, descriptions, and images.
-Video Links: Sample video URLs are included for the video player functionality.
-All components above are hardcoded 

##Known Issues

-Some features like user account persistence are not implemented.
-Video playback requires a stable internet connection.
-No unit tests are provided in this version of the app.

