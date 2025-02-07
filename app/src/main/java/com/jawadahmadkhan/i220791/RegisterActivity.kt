package com.jawadahmadkhan.i220791

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        // Find views
        val registerButton = findViewById<Button>(R.id.btn_register)
        val loginText = findViewById<TextView>(R.id.tv_login)

        // Register button click action
        registerButton.setOnClickListener {
            // Handle registration logic here (e.g., Firebase Authentication)
        }

        // Login text click action -> Navigate to LoginActivity
        loginText.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
