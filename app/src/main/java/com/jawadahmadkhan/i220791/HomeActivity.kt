package com.jawadahmadkhan.i220791

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page_screen) // Make sure your XML file is named activity_main.xml
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

        val go_contact = findViewById<ImageView>(R.id.contacts_btn)

        // Set click listener
        go_contact.setOnClickListener {
            startActivity(Intent(this, ContactsActivity::class.java))
        }


        val profile_view = findViewById<ImageView>(R.id.profile_btn)

        // Set click listener
        profile_view.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }



        val open_chat = findViewById<ImageView>(R.id.share_btn)

        // Set click listener
        open_chat.setOnClickListener {
            startActivity(Intent(this, DMListActivity::class.java))
        }



    }
}
