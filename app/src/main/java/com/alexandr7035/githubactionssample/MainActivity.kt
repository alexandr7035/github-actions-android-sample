package com.alexandr7035.githubactionssample

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val versionView = findViewById<TextView>(R.id.versionView)
        versionView.text = "Version ${BuildConfig.VERSION_NAME}"
    }
}