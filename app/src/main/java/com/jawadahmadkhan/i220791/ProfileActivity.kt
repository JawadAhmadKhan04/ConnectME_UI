package com.jawadahmadkhan.i220791

import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.GridLayoutManager
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
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

        val followers_id = findViewById<TextView>(R.id.follower_id)
        followers_id.setOnClickListener {
            val intent = Intent(this, FollowerActivity::class.java)
            startActivity(intent)
        }

        val following_id = findViewById<TextView>(R.id.following_id)
        followers_id.setOnClickListener {
            val intent = Intent(this, FollowerActivity::class.java)
            startActivity(intent)
        }

        setupNavigation()



            // Setting up RecyclerView for image gallery
        val galleryRecyclerView = findViewById<RecyclerView>(R.id.gallery_grid)
        galleryRecyclerView.layoutManager = GridLayoutManager(this, 3) // 4 columns

        // Dummy image list (Replace with actual images)
        val imageList = listOf(
            R.drawable.sample_scenery, R.drawable.sample_scenery, R.drawable.sample_scenery,
            R.drawable.sample_scenery, R.drawable.sample_scenery, R.drawable.sample_scenery,
            R.drawable.sample_scenery, R.drawable.sample_scenery
        )

        val adapter = GalleryAdapter(imageList)
        galleryRecyclerView.adapter = adapter
    }

    private fun setupNavigation() {
        val newpost = findViewById<ImageView>(R.id.center_plus)

        // Set click listener
        newpost.setOnClickListener {
            startActivity(Intent(this, PostGalleryActivity::class.java))
        }

        val search_person = findViewById<ImageView>(R.id.search_btn)

        // Set click listener
        search_person.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }

        val profile_view = findViewById<ImageView>(R.id.profile_btn)

        // Set click listener
        profile_view.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        val home_view = findViewById<ImageView>(R.id.home_btn)

        // Set click listener
        home_view.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }


        val contactsButton = findViewById<ImageView>(R.id.contacts_btn)

        contactsButton.setOnClickListener {
            startActivity(Intent(this, ContactsActivity::class.java))
        }


    }
}
