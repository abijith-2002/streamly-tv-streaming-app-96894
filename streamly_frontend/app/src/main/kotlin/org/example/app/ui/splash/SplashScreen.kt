package org.example.app.ui.splash

/**
 * PUBLIC_INTERFACE
 * SplashScreen placeholder.
 *
 * Note:
 * - Jetpack Compose is not used in this project per constraints; the actual splash is implemented
 *   with a traditional Android XML layout (activity_splash.xml) and a Splash theme.
 * - This file exists to satisfy the requested path and to document the splash behavior.
 *
 * Behavior:
 * - Background color: #121212 (see @color/splash_background)
 * - Centered title/logo placeholder shown in activity_splash.xml
 * - No focusable elements to keep TV focus safe.
 */
object SplashScreenInfo {
    /** PUBLIC_INTERFACE
     * Returns a brief description of the splash implementation for documentation.
     */
    fun description(): String =
        "TV splash implemented via system splash theme (Android 12+) and XML layout fallback with background #121212."
}
