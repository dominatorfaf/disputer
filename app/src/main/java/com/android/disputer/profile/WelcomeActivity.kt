package com.android.disputer.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.android.disputer.R
import com.android.disputer.schema.User

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val user = User()

        val name: TextView = findViewById<TextView>(R.id.name)
        val username: TextView = findViewById<TextView>(R.id.username)
        name.text = getString(R.string.user, user.firstName, user.lastName)
        username.text = getString(R.string.username, user.username)
    }
}