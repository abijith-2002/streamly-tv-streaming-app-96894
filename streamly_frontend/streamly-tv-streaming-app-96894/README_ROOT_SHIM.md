This repository uses a root shim. The canonical Gradle project root is in:
  streamly_frontend/

If a tool starts from repository root, use:
  ./gradlew help        (delegates to streamly_frontend)
Or run directly:
  cd streamly_frontend && ./gradlew clean assembleDebug

Standard tasks (clean, assembleDebug) are available from streamly_frontend.
