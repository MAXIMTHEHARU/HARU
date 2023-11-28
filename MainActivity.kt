package com.android.myapplicationdd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextButton = findViewById<Button>(R.id.btn_next)

        nextButton.setOnClickListener {
            val intent = Intent(this, Intent_Activity::class.java)
            startActivity(intent)
        }
    }
}
