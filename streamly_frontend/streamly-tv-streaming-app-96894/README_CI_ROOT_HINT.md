# CI/Analyzer Root Hint

The actual Android project root is located at:
- streamly_frontend/

This repository includes root-level shim files to assist tools in discovering the project:
- settings.gradle includes includeBuild("streamly_frontend")
- gradlew delegates to streamly_frontend/gradlew
- build.gradle provides a minimal task

If your analyzer cannot determine the project root automatically, point it to:
- streamly-tv-streaming-app-96894/streamly_frontend
