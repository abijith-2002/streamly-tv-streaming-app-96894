package org.example.app

import android.app.Activity
import android.content.Intent
import android.os.Bundle

/**
 * PUBLIC_INTERFACE
 * SplashActivity is the launcher entry that shows a solid #121212 background briefly
 * and immediately routes to MainActivity. Designed to be minimal and TV-compatible.
 *
 * Behavior:
 * - Uses Theme.Splash, which provides the solid background via windowBackground.
 * - Immediately starts MainActivity and finishes itself to avoid back navigation to splash.
 */
class SplashActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // Apply the splash theme before super to ensure window background is used at the earliest.
        setTheme(R.style.Theme_Splash)
        super.onCreate(savedInstanceState)

        // Set minimal layout (optional; background is already applied via theme)
        setContentView(R.layout.activity_splash)

        // Route to MainActivity immediately for a snappy splash experience
        startActivity(Intent(this, MainActivity::class.java))

        // Finish to remove splash from back stack
        finish()
    }
}
