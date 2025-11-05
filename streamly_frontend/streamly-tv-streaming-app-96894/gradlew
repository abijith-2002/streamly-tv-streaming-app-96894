#!/bin/sh
# Forward Gradle commands from repo root to the actual Android project under streamly_frontend/
SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
cd "$SCRIPT_DIR/streamly_frontend" || exit 1
exec ./gradlew "$@"
