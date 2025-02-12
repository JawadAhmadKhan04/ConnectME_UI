package com.jawadahmadkhan.i220791

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PostGalleryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.post_gallery_tab)

        // Setup RecyclerView for gallery
        val galleryRecyclerView = findViewById<RecyclerView>(R.id.gallery_grid)
        galleryRecyclerView.layoutManager = GridLayoutManager(this, 4) // 3 columns
        galleryRecyclerView.adapter = GalleryAdapter(getSampleImages()) // Load images


        val switchcam = findViewById<ImageView>(R.id.camera_icon)

        // Set click listener on register text
        switchcam.setOnClickListener {
            val intent = Intent(this, PostCameraActivity::class.java)
            startActivity(intent)
        }

        val done = findViewById<TextView>(R.id.next_button)

        // Set click listener on register text
        done.setOnClickListener {
            val intent = Intent(this, NewPostActivity::class.java)
            startActivity(intent)
        }

        val closeButton = findViewById<ImageView>(R.id.close_button)

        closeButton.setOnClickListener {
            finish() // Closes the current activity
        }




    }

    private fun getSampleImages(): List<Int> {
        return listOf(
            R.drawable.sample_scenery, R.drawable.sample_scenery, R.drawable.sample_scenery,
            R.drawable.sample_scenery, R.drawable.sample_scenery, R.drawable.sample_scenery,
            R.drawable.sample_scenery, R.drawable.sample_scenery, R.drawable.sample_scenery,
            R.drawable.sample_scenery, R.drawable.sample_scenery, R.drawable.sample_scenery,
            R.drawable.sample_scenery, R.drawable.sample_scenery, R.drawable.sample_scenery,
            R.drawable.sample_scenery, R.drawable.sample_scenery, R.drawable.sample_scenery,
            R.drawable.sample_scenery, R.drawable.sample_scenery, R.drawable.sample_scenery,
            R.drawable.sample_scenery, R.drawable.sample_scenery, R.drawable.sample_scenery
        )
    }
}
