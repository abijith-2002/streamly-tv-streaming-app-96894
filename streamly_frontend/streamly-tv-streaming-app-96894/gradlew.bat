@echo off
rem Forward Gradle commands from repo root to the Android project under streamly_frontend
set SCRIPT_DIR=%~dp0
cd /d "%SCRIPT_DIR%\streamly_frontend" || exit /b 1
call gradlew %*
