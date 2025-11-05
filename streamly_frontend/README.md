# Streamly Android TV App

This is the primary Gradle root for the Streamly Android TV application.

- Build tool: Gradle (no experimental plugins)
- Kotlin source: 1.9.x stdlib, JDK 17
- Modules: app, list, utilities

Building:

```shell
./gradlew build
```

Install and run on a connected device:

```shell
./gradlew :app:installDebug
```

Then search for "Streamly" on the device and launch the app to see the splash screen followed by the home screen.