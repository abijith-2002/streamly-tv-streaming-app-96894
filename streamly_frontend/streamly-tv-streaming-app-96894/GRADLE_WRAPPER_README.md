# Gradle Wrapper Root Shim

This repository includes shim files at the root to assist tools in locating the actual Android Gradle project which lives under:

  streamly_frontend/

Usage:
- From repository root (delegates to streamly_frontend): ./gradlew help
- Preferred: cd streamly_frontend && ./gradlew clean assembleDebug

Root shims present:
- build.gradle, build.gradle.kts
- settings.gradle, settings.gradle.kts, settings.gradle.dcl
- gradlew, gradlew.bat (delegate into streamly_frontend/gradlew)
