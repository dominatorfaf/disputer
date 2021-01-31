package com.android.disputer.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.android.disputer.R

class WelcomeActivity : AppCompatActivity() {
    private val username: String = "Vdovicenco"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val helloText: TextView = findViewById<TextView>(R.id.helloText)
        helloText.text = getString(R.string.hello_text, username)
    }
}