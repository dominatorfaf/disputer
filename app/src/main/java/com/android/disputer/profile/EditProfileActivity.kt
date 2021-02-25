package com.android.disputer.profile

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.disputer.R
import com.android.disputer.enums.Avatar
import com.android.disputer.schema.User


class EditProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        val obj : User = intent.getSerializableExtra("user") as User

        var editUsername: TextView = findViewById(R.id.edit_username)
        var editFirstName: TextView = findViewById(R.id.edit_first_name)
        var editLastName: TextView = findViewById(R.id.edit_last_name)
        var editEmail: TextView = findViewById(R.id.edit_email)
        var button: Button = findViewById(R.id.edit_profile)

        editUsername.text = obj.username
        editFirstName.text = obj.firstName
        editLastName.text = obj.lastName
        editEmail.text = obj.email

        button.setOnClickListener {
            obj.username = editUsername.text.toString()
            obj.email = editEmail.text.toString()
            obj.firstName = editFirstName.text.toString()
            obj.lastName = editLastName.text.toString()
            val intent = Intent(this, WelcomeActivity::class.java);
            intent.putExtra("user", obj)
            startActivity(intent);
        }
    }
}