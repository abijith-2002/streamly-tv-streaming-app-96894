package com.streamly.tv

import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

/**
 * PUBLIC_INTERFACE
 * SplashActivity
 * This is the launcher activity that shows a branded splash using the Android 12+ SplashScreen API
 * with a fallback for earlier versions. It immediately routes to MainActivity after minimal init.
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

        // Optional: Keep the splash until we are ready; here we don't delay startup
        splash?.setKeepOnScreenCondition { false }

        // Route to the existing MainActivity
        startActivity(Intent(this, com.streamly.tv.MainActivity::class.java))
        finish()
    }
}
