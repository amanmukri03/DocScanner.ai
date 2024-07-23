package com.example.docscanner

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class Splashscreen : AppCompatActivity() {
    // Duration of the splash screen in milliseconds
    private val splashScreenDuration: Long = 3000 // 3 seconds
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_screen)
        // Navigate to MainActivity after the splash screen duration
        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Close the splash activity so it won't appear when user presses back button
        }, splashScreenDuration)
    }
}