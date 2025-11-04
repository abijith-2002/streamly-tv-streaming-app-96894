import java.io.File

// PUBLIC_INTERFACE
/**
 * This settings file exists to help tools detect the Gradle project root.
 * The actual project settings are defined in settings.gradle.dcl.
 * We do not alter the build; this file only delegates by printing a hint.
 *
 * Note for humans/tools:
 * - The real configuration is in settings.gradle.dcl per Declarative Gradle prototype.
 * - Keep this file minimal to avoid interfering with the declarative setup.
 */
rootProject.name = "example-android-app"

// Optionally inform users/tools where the main settings are.
// This is a no-op for Gradle itself; it just leaves a breadcrumb for analyzers.
val declarativeSettings = File(rootDir, "settings.gradle.dcl")
if (!declarativeSettings.exists()) {
    logger.warn("settings.gradle.dcl not found; project may not build as intended.")
}
