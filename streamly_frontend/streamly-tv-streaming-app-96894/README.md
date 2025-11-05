# Streamly Android TV App (Root)

This repository contains the Android project under `streamly_frontend/`.

- Primary Gradle root: `streamly_frontend/`
- Gradle wrapper: `streamly_frontend/gradlew`
- Settings: `streamly_frontend/settings.gradle`

From the repository root, a composite include points to the actual project so tools can build from root.

Build tips:
- From repo root: `./gradlew help` (delegates to `streamly_frontend`)
- Or directly: `cd streamly_frontend && ./gradlew assembleDebug`
