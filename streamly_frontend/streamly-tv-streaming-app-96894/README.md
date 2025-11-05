# Streamly Android TV App (Root)

This repository contains the Android project under `streamly_frontend/`.

- Primary Gradle root: `streamly_frontend/`
- Gradle wrapper: `streamly_frontend/gradlew`
- Settings: `streamly_frontend/settings.gradle`

For convenience, the repository root includes shim files so CI/analyzers can detect the project:
- `settings.gradle` with `includeBuild("streamly_frontend")`
- `gradlew` / `gradlew.bat` wrappers that delegate to `streamly_frontend/gradlew`
- `build.gradle` minimal shim

Build tips:
- From repo root: `./gradlew help` (delegates to `streamly_frontend`)
- Or directly: `cd streamly_frontend && ./gradlew assembleDebug`
