package com.jawadahmadkhan.i220791

import android.os.Bundle
import android.widget.ImageView // Import this!
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
    }
}
