package com.example.getimei

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.widget.TextView

class MainActivity: AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView : TextView = findViewById(R.id.android_id)
        val deviceID = Settings.Secure.getString(this.contentResolver, Settings.Secure.ANDROID_ID)

        textView.text = "Android ID: $deviceID"
    }
}
