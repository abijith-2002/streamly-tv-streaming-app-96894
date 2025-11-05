#!/bin/sh
# Delegates Gradle commands to the canonical project root under streamly_frontend/
SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
cd "$SCRIPT_DIR/streamly_frontend" || exit 1
exec ./gradlew "$@"
