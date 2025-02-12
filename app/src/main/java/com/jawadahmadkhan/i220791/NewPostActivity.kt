package com.jawadahmadkhan.i220791

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class NewPostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_post_final)

        val closeposts = findViewById<ImageView>(R.id.close_button)

        // Set click listener
        closeposts.setOnClickListener {
            finish() // Closes the activity
        }

        val done = findViewById<Button>(R.id.share_button)

        // Set click listener
        done.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

    }
}
