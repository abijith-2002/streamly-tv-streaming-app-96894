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
 * with a fallback for earlier versions. Displays the wordmark via windowBackground (#121212) for a
 * full 3 seconds, then routes to MainActivity.
 *
 * Implementation notes:
 * - We set a transparent content layout immediately so the windowBackground (splash_background,
 *   which includes the wordmark) remains visible and is not overdrawn.
 * - On Android 12+ we keep the splash on-screen for 3 seconds using setKeepOnScreenCondition.
 * - On pre-Android 12 we delay navigation via a Handler for the same 3-second duration.
 */
class SplashActivity : Activity() {

    private val splashDurationMillis = 3000L
    private val mainHandler by lazy { Handler(Looper.getMainLooper()) }

    override fun onCreate(savedInstanceState: Bundle?) {
        // Install SplashScreen for Android 12+; no-op harmless on older versions when not called.
        val splash: SplashScreen? = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            installSplashScreen()
        } else {
            null
        }
        super.onCreate(savedInstanceState)

        // Important: Set a transparent content view so the windowBackground remains visible.
        // Do NOT replace it with an opaque view; this keeps the wordmark visible for the duration.
        setContentView(R.layout.activity_splash)

        val startTime = System.currentTimeMillis()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            // Keep splash visible until 3 seconds have elapsed since start.
            splash?.setKeepOnScreenCondition {
                val elapsed = System.currentTimeMillis() - startTime
                elapsed < splashDurationMillis
            }
            // Navigate as soon as the duration completes; the keep-on-screen condition then releases.
            mainHandler.postDelayed({
                navigateToMain()
            }, splashDurationMillis)
        } else {
            // Pre-Android 12: Just delay navigation; the theme windowBackground remains shown meanwhile.
            mainHandler.postDelayed({
                navigateToMain()
            }, splashDurationMillis)
        }
    }

    // PUBLIC_INTERFACE
    private fun navigateToMain() {
        /**
         * Navigate to MainActivity and finish the splash activity after the 3-second splash duration.
         */
        if (!isFinishing) {
            startActivity(Intent(this, com.streamly.tv.MainActivity::class.java))
            finish()
        }
    }
}
