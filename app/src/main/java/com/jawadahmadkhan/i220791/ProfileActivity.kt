package com.jawadahmadkhan.i220791

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_page)

        // Edit profile button
        val editProfile = findViewById<ImageView>(R.id.edit_profile)
        editProfile.setOnClickListener {
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
        }

        // Navigation buttons
        val searchBtn = findViewById<ImageView>(R.id.search_btn)
        searchBtn.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

        val centerPlus = findViewById<ImageView>(R.id.center_plus)
        centerPlus.setOnClickListener {
            val intent = Intent(this, PostCameraActivity::class.java)
            startActivity(intent)
        }

        val contactsBtn = findViewById<ImageView>(R.id.contacts_btn)
        contactsBtn.setOnClickListener {
            val intent = Intent(this, ContactsActivity::class.java)
            startActivity(intent)
        }


        val homeBtn = findViewById<ImageView>(R.id.home_logo)
        homeBtn.setOnClickListener {
            // TODO: Implement home functionality
        }

        // Setting up RecyclerView for image gallery
        val galleryRecyclerView = findViewById<RecyclerView>(R.id.gallery_grid)
        galleryRecyclerView.layoutManager = GridLayoutManager(this, 3) // 3 columns

        // Dummy image list (Replace with actual images)
        val imageList = listOf(
            R.drawable.sample_scenery, R.drawable.sample_scenery, R.drawable.sample_scenery,
            R.drawable.sample_scenery, R.drawable.sample_scenery, R.drawable.sample_scenery
        )

        val adapter = GalleryAdapter(imageList)
        galleryRecyclerView.adapter = adapter
    }
}
