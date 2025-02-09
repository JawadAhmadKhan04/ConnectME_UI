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
        val searchButton = findViewById<ImageView>(R.id.search_btn)

        searchButton.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }
    }
}
