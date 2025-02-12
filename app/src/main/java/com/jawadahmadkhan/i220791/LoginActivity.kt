package com.jawadahmadkhan.i220791

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        // Find the register text
        val registerText = findViewById<TextView>(R.id.registerText)

        // Set click listener on register text
        registerText.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        // Find the register text
        val loginbtn = findViewById<Button>(R.id.LoginButton)

        // Set click listener on register text
        loginbtn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        val googlebtn = findViewById<ImageButton>(R.id.googleButton)

        // Set click listener on register text
        googlebtn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        val applebtn = findViewById<ImageButton>(R.id.appleButton)

        // Set click listener on register text
        applebtn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        val facebookbtn = findViewById<ImageButton>(R.id.facebookButton)

        // Set click listener on register text
        facebookbtn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}