package com.jawadahmadkhan.i220791

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast
//import com.google.android.gms.auth.api.signin.GoogleSignIn
//import com.google.android.gms.auth.api.signin.GoogleSignInClient
//import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth



class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        // Find the register text
        val registerText = findViewById<TextView>(R.id.registerText)
        val usernameInput = findViewById<EditText>(R.id.usernameInput)
        val passwordInput = findViewById<EditText>(R.id.passwordInput)

        // Set click listener on register text
        registerText.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        // Find the register text
        var auth = FirebaseAuth.getInstance()
        val loginbtn = findViewById<Button>(R.id.LoginButton)

        // Set click listener on register text
        loginbtn.setOnClickListener {
            var email = usernameInput.text.toString()
            var pass = passwordInput.text.toString()
//            Toast.makeText(this, "!$email!", Toast.LENGTH_SHORT).show()
//            Toast.makeText(this, "!$pass!", Toast.LENGTH_SHORT).show()
            if (email.isEmpty() || pass.isEmpty()) {
                Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_SHORT).show()
            }
            else {
                auth.signInWithEmailAndPassword(email, pass)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            Toast.makeText(this, "Logged In", Toast.LENGTH_SHORT).show()
                            var intent = Intent(this, HomeActivity::class.java)
                            startActivity(intent)
                            finish()
                        }
                        else {
                            Toast.makeText(this, "Incorrect username password", Toast.LENGTH_SHORT).show()
                        }
                    }
//                    .addOnFailureListener(this) { exception ->
//                        Toast.makeText(this, exception.message, Toast.LENGTH_SHORT).show()
//                    }

            }
        }


        val googlebtn = findViewById<ImageButton>(R.id.googleButton)




        // Set click listener on register text
        googlebtn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        val applebtn = findViewById<ImageButton>(R.id.appleButton)

        // Set click listener on register text
        applebtn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        val facebookbtn = findViewById<ImageButton>(R.id.facebookButton)

        // Set click listener on register text
        facebookbtn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}