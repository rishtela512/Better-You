plugins {
    alias(libs.plugins.android.application)
    id("com.google.gms.google-services")  // Firebase services plugin
}

android {
    namespace = "edu.utsa.cs3443.betteryou"
    compileSdk = 34

    defaultConfig {
        applicationId = "edu.utsa.cs3443.betteryou"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation("com.google.android.material:material:1.9.0")  // Ensure the correct version
    // Other dependencies

    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.10") // Make sure the version is consistent
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.10") // Use the JDK8 version (match Kotlin stdlib version)

    // Firebase dependencies
    implementation(platform("com.google.firebase:firebase-bom:32.0.0"))
    implementation("com.google.firebase:firebase-auth-ktx")
    implementation(libs.appcompat)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    // Unit Testing dependencies
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}