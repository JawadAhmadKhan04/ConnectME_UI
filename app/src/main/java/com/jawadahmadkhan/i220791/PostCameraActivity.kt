package com.jawadahmadkhan.i220791

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView // Import this!
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PostCameraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.post_camera_tab)

        // Find the close button
        val closeposts = findViewById<ImageView>(R.id.close_button)

        // Set click listener
        closeposts.setOnClickListener {
            finish() // Closes the activity
        }

//        val registerText = findViewById<ImageView>(R.id.switch_camera)
//
//        // Set click listener on register text
//        registerText.setOnClickListener {
//            val intent = Intent(this, PostGalleryActivity::class.java)
//            startActivity(intent)
//        }

        val change = findViewById<ImageView>(R.id.gallery_thumbnail)

        // Set click listener on register text
        change.setOnClickListener {
            val intent = Intent(this, PostGalleryActivity::class.java)
            startActivity(intent)
        }

        val taken = findViewById<TextView>(R.id.next_button)

        // Set click listener on register text
        taken.setOnClickListener {
            val intent = Intent(this, NewPostActivity::class.java)
            startActivity(intent)
        }

    }
}
