# Streamly Root: Analyzer Instructions

If your tool cannot determine the project root automatically, use one of the following:

- Preferred: cd streamly_frontend && ./gradlew clean assembleDebug
- Or from repository root (delegates to streamly_frontend): ./gradlew help

Canonical Gradle root: streamly_frontend/
Modules: app, list, utilities

This repository already contains:
- Root gradlew script that forwards to streamly_frontend/gradlew
- Root settings.gradle that includeBuild("streamly_frontend")
- Root build.gradle shim

These are sufficient for most CI/analyzers to detect the project.
