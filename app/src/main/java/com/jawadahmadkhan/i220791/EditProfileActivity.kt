package com.jawadahmadkhan.i220791

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class EditProfileActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_profile)

        // Initialize UI components
        val profileImage: ImageView = findViewById(R.id.profileImage)
        val editProfileIcon: ImageView = findViewById(R.id.editProfileIcon)
        val nameInput: EditText = findViewById(R.id.nameInput)
        val usernameInput: EditText = findViewById(R.id.usernameInput)
        val contactInput: EditText = findViewById(R.id.contactInput)
        val bioInput: EditText = findViewById(R.id.bioInput)
        val doneButton: TextView = findViewById(R.id.doneButton)
        auth = FirebaseAuth.getInstance()

        val logoutButton = findViewById<Button>(R.id.logout)
        logoutButton.setOnClickListener {
            auth.signOut()
            val intent = Intent(this, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish() // Ensure MainActivity is also finished
        }


        // Handle profile image click
        editProfileIcon.setOnClickListener {
            Toast.makeText(this, "Change profile picture clicked", Toast.LENGTH_SHORT).show()
        }

        // Handle Done button click
        doneButton.setOnClickListener {
            val name = nameInput.text.toString()
            val username = usernameInput.text.toString()
            val contact = contactInput.text.toString()
            val bio = bioInput.text.toString()

            if (name.isEmpty() || username.isEmpty() || contact.isEmpty()) {
                Toast.makeText(this, "Please fill out all required fields", Toast.LENGTH_SHORT).show()
            } else {
                // Save profile data (This can be extended to update a database or API)
                Toast.makeText(this, "Profile updated successfully!", Toast.LENGTH_SHORT).show()
                finish() // Close the activity
            }
        }
    }
}
