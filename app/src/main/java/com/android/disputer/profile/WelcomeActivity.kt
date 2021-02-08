package com.android.disputer.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.android.disputer.R
import com.android.disputer.schema.User

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val user = User()

        val helloText: TextView = findViewById<TextView>(R.id.hello)
        val name: TextView = findViewById<TextView>(R.id.name)
        val username: TextView = findViewById<TextView>(R.id.username)
        val toEditProfile: Button = findViewById<Button>(R.id.edit_profile)

        helloText.text = getString(R.string.hello_text, user.firstName)
        name.text = getString(R.string.user, user.firstName, user.lastName)
        username.text = getString(R.string.username, user.username)

        toEditProfile.setOnClickListener {
            val intent = Intent(this, EditProfileActivity::class.java);
            intent.putExtra("user", user)
            startActivity(intent);
        }
    }
}