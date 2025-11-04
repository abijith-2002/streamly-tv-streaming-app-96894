@file:Suppress("UnstableApiUsage")

// PUBLIC_INTERFACE
/**
 * Canonical Gradle settings for the Streamly Android TV app.
 * Migrated to conventional Gradle so environments lacking Declarative DSL can build.
 * - Declares repositories and plugin versions
 * - Includes all modules
 */
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
    plugins {
        id("com.android.application") version "8.6.1"
        id("com.android.library") version "8.6.1"
        id("org.jetbrains.kotlin.android") version "2.0.21"
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "example-android-app"

include(":app")
include(":list")
include(":utilities")
