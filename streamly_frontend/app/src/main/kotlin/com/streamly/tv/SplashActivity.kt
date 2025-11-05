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
 * then routes to MainActivity.
 */
class SplashActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // Install SplashScreen for Android 12+ (fallback is handled gracefully on older versions)
        val splash: SplashScreen? = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            installSplashScreen()
        } else {
            null
        }
        super.onCreate(savedInstanceState)

        // Ensure the window shows our splash layout; theme keeps background to avoid flicker
        setContentView(R.layout.activity_splash)

        // Optional: Do not delay the splash. This ensures quick handoff.
        splash?.setKeepOnScreenCondition { false }

        // Proceed to MainActivity promptly (small post to ensure layout draws at least once)
        Handler(Looper.getMainLooper()).post {
            startActivity(Intent(this, com.streamly.tv.MainActivity::class.java))
            finish()
        }
    }
}
