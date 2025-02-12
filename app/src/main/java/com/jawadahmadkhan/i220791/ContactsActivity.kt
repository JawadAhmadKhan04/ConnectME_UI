package com.jawadahmadkhan.i220791

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ContactsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contacts_page)

        setupRecyclerViews()
        setupNavigation()

        val dm = findViewById<ImageView>(R.id.dm_open)

        // Set click listener
        dm.setOnClickListener {
            startActivity(Intent(this, DMListActivity::class.java))
        }


    }

    private fun setupRecyclerViews() {
        val contacts = listOf(
            Contact("Henry School", R.drawable.dm_image),
            Contact("Emily James", R.drawable.dm_image, isBold = true),
            Contact("Lily Thomas", R.drawable.dm_image)
        )

        val inviteFriends = listOf(
            Friend("Amy Wesley", R.drawable.dm_image),
            Friend("Laura Ryan", R.drawable.dm_image),
            Friend("Christopher", R.drawable.dm_image)
        )

        val recyclerInContacts = findViewById<RecyclerView>(R.id.recycler_in_contacts)
        val recyclerInviteFriends = findViewById<RecyclerView>(R.id.recycler_invite_friends)

        recyclerInContacts.layoutManager = LinearLayoutManager(this)
        recyclerInContacts.adapter = ContactAdapter(contacts)

        recyclerInviteFriends.layoutManager = LinearLayoutManager(this)
        recyclerInviteFriends.adapter = InviteFriendAdapter(inviteFriends)
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
