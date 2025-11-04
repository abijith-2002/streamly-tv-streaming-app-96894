@file:Suppress("UnstableApiUsage")

plugins {
    // PUBLIC_INTERFACE
    /**
     * Android application plugin for building the Streamly TV client.
     * We use conventional Gradle Kotlin DSL to ensure compatibility where Declarative DSL is unavailable.
     */
    id("com.android.application") version "8.6.1"
    // PUBLIC_INTERFACE
    /**
     * Kotlin Android plugin for Kotlin language support.
     */
    id("org.jetbrains.kotlin.android") version "2.0.21"
}

android {
    // Application-wide Android configuration
    namespace = "org.example.app"

    compileSdk = 34

    defaultConfig {
        applicationId = "org.gradle.experimental.android.app"
        minSdk = 30
        targetSdk = 34
        versionCode = 1
        versionName = "0.1"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    // Keep basic build types minimal; no shrinker to keep build simple
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            // no special config
        }
    }

    compileOptions {
        // Use JDK 17 per defaults in settings.gradle.dcl
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    // Enable unit tests on JUnit Platform (JUnit 5) where applicable
    testOptions {
        unitTests.all {
            it.useJUnitPlatform()
        }
    }

    // We are not using Compose; ensure it's disabled
    buildFeatures {
        viewBinding = false
        compose = false
    }
}

dependencies {
    implementation("org.apache.commons:commons-text:1.11.0")
    implementation(project(":utilities"))

    // JUnit 5 for unit tests (kept from declarative defaults)
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // AndroidX test runner for instrumentation if needed
    androidTestImplementation("androidx.test:runner:1.6.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
}
