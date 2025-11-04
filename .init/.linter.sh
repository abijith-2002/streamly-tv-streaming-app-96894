#!/bin/bash
cd /home/kavia/workspace/code-generation/streamly-tv-streaming-app-96894/streamly_frontend
./gradlew lint
LINT_EXIT_CODE=$?
if [ $LINT_EXIT_CODE -ne 0 ]; then
   exit 1
fi

