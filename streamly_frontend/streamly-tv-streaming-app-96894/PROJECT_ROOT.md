# Project Root and Gradle Entry

This repository uses a root shim. The canonical Android Gradle project root is:
  streamly_frontend/

Tools that need to build or analyze should either:
- Run Gradle from repository root (delegates to streamly_frontend): 
  ./gradlew help
- Or change into the canonical root and run:
  cd streamly_frontend && ./gradlew clean assembleDebug

Key files:
- streamly_frontend/settings.gradle (includes :app, :list, :utilities)
- streamly_frontend/gradlew (canonical wrapper)
- Root settings.gradle includes the nested build via includeBuild("streamly_frontend").
