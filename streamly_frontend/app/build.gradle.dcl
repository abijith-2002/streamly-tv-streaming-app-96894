androidApplication {
    // Update to Streamly package namespace
    namespace = "com.streamly.tv"

    dependencies {
        implementation("org.apache.commons:commons-text:1.11.0")
        implementation(project(":utilities"))
        // AndroidX Core SplashScreen for Android 12+ compatible splash API and fallback
        implementation("androidx.core:core-splashscreen:1.0.1")
        implementation("androidx.appcompat:appcompat:1.6.1")
    }
}
