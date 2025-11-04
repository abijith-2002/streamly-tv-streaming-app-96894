@echo off
REM PUBLIC_INTERFACE
REM Delegating Gradle wrapper at repository root.
REM This script forwards to streamly_frontend\gradlew.bat

set SCRIPT_DIR=%~dp0
set FRONTEND_DIR=%SCRIPT_DIR%streamly_frontend

if not exist "%FRONTEND_DIR%\gradlew.bat" (
  echo Gradle wrapper not found at %FRONTEND_DIR%\gradlew.bat
  exit /b 1
)

call "%FRONTEND_DIR%\gradlew.bat" %*
