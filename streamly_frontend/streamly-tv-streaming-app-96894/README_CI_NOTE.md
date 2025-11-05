# CI Note: Android Project Root

Automated tools should treat `streamly_frontend/` as the Gradle project root for the Android/Kotlin app.

- Gradle wrapper: streamly_frontend/gradlew
- Settings file: streamly_frontend/settings.gradle
- App module: streamly_frontend/app

If your CI/analyzer needs a path hint, point it to:
`streamly-tv-streaming-app-96894/streamly_frontend`
