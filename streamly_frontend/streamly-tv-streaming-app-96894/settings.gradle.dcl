pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

// Root-level declarative settings shim for CI discovery.
// The actual Android project is located in streamly_frontend/.
defaults {
    androidApplication {
        jdkVersion = 17
        compileSdk = 34
        minSdk = 30
        versionCode = 1
        versionName = "0.1"
        applicationId = "com.streamly.tv"
    }
    androidLibrary {
        jdkVersion = 17
        compileSdk = 34
        minSdk = 30
    }
}

// Forward to the real project for builds/analysis.
includeBuild("streamly_frontend")
