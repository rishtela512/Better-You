pluginManagement {
    repositories {
        google()  // Add Google's repository for plugin resolution
        mavenCentral()  // Add Maven Central for other dependencies
        gradlePluginPortal()  // Use Gradle Plugin Portal for plugins
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)  // Fail if repositories are defined in project-level files
    repositories {
        google()  // Ensure Google repository is available for dependencies
        mavenCentral()  // Ensure Maven Central is available for dependencies
    }
}

rootProject.name = "betteryou"
include(":app")