// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
}

buildscript {
    dependencies {
        // Classpath dependencies for plugins
        classpath("com.android.tools.build:gradle:7.4.2")  // Android Gradle Plugin
        classpath("com.google.gms:google-services:4.3.15")  // Google Services Plugin
    }
}

allprojects {
    // No need to add repositories here!
}