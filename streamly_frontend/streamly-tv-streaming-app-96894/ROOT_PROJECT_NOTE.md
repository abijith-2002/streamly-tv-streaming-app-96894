Canonical Gradle root: streamly_frontend/

Use one of:
- cd streamly_frontend && ./gradlew clean assembleDebug
- cd streamly_frontend && ./build.sh --clean

Root shim forwards Gradle commands via includeBuild("streamly_frontend") and root gradlew delegates to streamly_frontend/gradlew.
