package org.example.app

import android.app.Activity
import android.os.Bundle

/**
 * PUBLIC_INTERFACE
 * MainActivity is the single entry point activity for the TV app.
 * For this phase it shows only the Splash screen with a dark background (#121212).
 * - No navigation to other screens is performed.
 * - Activity is marked with LEANBACK_LAUNCHER in the manifest to be discoverable by TV launchers.
 */
class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Use a dedicated splash layout containing a centered title/logo placeholder
        setContentView(R.layout.activity_splash)
        // Stay on splash; no navigation for now.
    }
}
