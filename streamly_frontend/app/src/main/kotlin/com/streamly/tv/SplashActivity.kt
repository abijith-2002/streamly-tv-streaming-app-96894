package com.streamly.tv

import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.splashscreen.SplashScreen
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

/**
 * PUBLIC_INTERFACE
 * SplashActivity
 * This is the launcher activity that shows a branded splash using the Android 12+ SplashScreen API
 * with a fallback for earlier versions. Displays centered 'Streamly' text in Roboto on #121212,
 * then routes to MainActivity after a fixed 3-second duration.
 *
 * Behavior:
 * - Android 12+ (API 31+): Uses SplashScreen API with setKeepOnScreenCondition strictly for timing
 *   the 3-second duration; content view is set immediately and theme windowBackground shows
 *   branded visuals from the start.
 * - Below Android 12: Uses a non-blocking Handler postDelayed to achieve the same duration,
 *   with the theme-provided windowBackground ensuring immediate visuals.
 *
 * Visuals remain unchanged: background color #121212 and "Streamly" text in Roboto.
 * Package and navigation to MainActivity remain the same.
 */
class SplashActivity : Activity() {

    private val splashDurationMillis = 3000L
    private val mainHandler by lazy { Handler(Looper.getMainLooper()) }

    override fun onCreate(savedInstanceState: Bundle?) {
        // Install SplashScreen for Android 12+ (fallback is handled gracefully on older versions)
        val splash: SplashScreen? = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            installSplashScreen()
        } else {
            null
        }
        super.onCreate(savedInstanceState)

        // Ensure content is set immediately; first-frame visuals come from theme windowBackground.
        // Layout is minimal; windowBackground provides the "Streamly" wordmark instantly.
        setContentView(R.layout.activity_splash)

        val startTime = System.currentTimeMillis()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            // Keep splash visible until 3 seconds have elapsed since start, without blocking the UI.
            splash?.setKeepOnScreenCondition {
                val elapsed = System.currentTimeMillis() - startTime
                elapsed < splashDurationMillis
            }
            // Schedule navigation right after the duration; setKeepOnScreenCondition will soon return false.
            mainHandler.postDelayed({
                navigateToMain()
            }, splashDurationMillis)
        } else {
            // Pre-Android 12: use a non-blocking delay via Handler
            mainHandler.postDelayed({
                navigateToMain()
            }, splashDurationMillis)
        }
    }

    // PUBLIC_INTERFACE
    private fun navigateToMain() {
        /**
         * Navigate to MainActivity and finish the splash activity.
         * This method is invoked after the 3-second splash duration elapses.
         */
        if (!isFinishing) {
            startActivity(Intent(this, com.streamly.tv.MainActivity::class.java))
            finish()
        }
    }
}
