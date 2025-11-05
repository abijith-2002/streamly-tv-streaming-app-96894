# Streamly Android TV App (Root)

This repository contains the Android project under `streamly_frontend/`.

- Primary Gradle root: `streamly_frontend/`
- Gradle wrapper: `streamly_frontend/gradlew`
- Settings: `streamly_frontend/settings.gradle` (includes modules: app, list, utilities)

For convenience, the repository root includes shim files so CI/analyzers can detect the project:
- Root `settings.gradle` includes the nested build via includeBuild("streamly_frontend")
- Root `gradlew` delegates calls into `streamly_frontend/gradlew`
- Root `build.gradle` is a minimal shim

Build tips (preferred):
- From project root: `cd streamly_frontend && ./gradlew clean assembleDebug`
- Or run the helper script: `cd streamly_frontend && ./build.sh --clean`

Note: The canonical Gradle root is `streamly_frontend/` so standard tasks like `clean`, `assembleDebug`, etc., resolve correctly.
