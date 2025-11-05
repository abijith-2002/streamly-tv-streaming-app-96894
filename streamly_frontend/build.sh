#!/bin/bash

# ----------------------------
# Android Build Script
# ----------------------------
# Note: Run this script from inside streamly_frontend/ (the Gradle root).
# Example: ./build.sh --clean

# Exit on first error
set -e

# Set Android SDK path (change if needed)
export ANDROID_HOME=/opt/android-sdk-linux
export PATH=$PATH:$ANDROID_HOME/tools:$ANDROID_HOME/platform-tools

# Function to print usage
usage() {
  echo "Usage: $0 [--clean]"
  echo "  --clean    Clean the project before building"
  exit 1
}

# Parse argument
CLEAN=false
if [[ "$1" == "--clean" ]]; then
  CLEAN=true
elif [[ -n "$1" ]]; then
  usage
fi

# Go to the script's directory (project root)
cd "$(dirname "$0")"

# Check if gradlew exists
if [[ ! -f "./gradlew" ]]; then
  echo "Γ¥î gradlew not found! Run this script from the project root."
  exit 1
fi

# Clean if requested
if $CLEAN; then
  echo "≡ƒº╣ Cleaning project..."
  ./gradlew clean
fi

# Build debug APK
echo "ΓÜÖ∩╕Å  Building debug APK..."
./gradlew assembleDebug

# Locate APK output
APK_PATH=$(find ./app/build/outputs/apk/debug -name "*.apk" 2>/dev/null | head -n 1)

if [[ -f "$APK_PATH" ]]; then
  echo "Γ£à Build successful!"
  echo "≡ƒôª APK generated at: $APK_PATH"
else
  echo "Γ¥î Build failed or APK not found."
  exit 1
fi