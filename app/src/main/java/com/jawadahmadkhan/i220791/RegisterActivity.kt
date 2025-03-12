package com.jawadahmadkhan.i220791

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        val loginText = findViewById<TextView>(R.id.tv_login)
        val et_email = findViewById<EditText>(R.id.et_email)
        val et_password = findViewById<EditText>(R.id.et_password)

        // Login text click action -> Navigate to LoginActivity
        loginText.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        val loginbtn = findViewById<Button>(R.id.btn_register)
        var auth = FirebaseAuth.getInstance()
        // Set click listener on register text
        loginbtn.setOnClickListener {
            var email = et_email.text.toString()
            var pass = et_password.text.toString()

            if (email.isEmpty() || pass.isEmpty()) {
                Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_SHORT).show()
            }
            else {
                auth.createUserWithEmailAndPassword(email, pass)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            Toast.makeText(this, "User created successfully", Toast.LENGTH_SHORT).show()
                            var intent = Intent(this, HomeActivity::class.java)
                            startActivity(intent)
                            finish()
                        }
                        else {
                            Toast.makeText(this, "User creation failed", Toast.LENGTH_SHORT).show()
                        }
                    }
//                    .addOnFailureListener(this) { exception ->
//                        Toast.makeText(this, exception.message, Toast.LENGTH_SHORT).show()
//                    }

            }

        }
    }
}
