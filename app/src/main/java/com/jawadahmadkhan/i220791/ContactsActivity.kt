package com.jawadahmadkhan.i220791

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ContactsActivity : AppCompatActivity() {

    private lateinit var contactAdapter: ContactAdapter
    private lateinit var inviteFriendAdapter: InviteFriendAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contacts_page)

        setupRecyclerViews()
    }

    private fun setupRecyclerViews() {
        // Sample contacts
        val contacts = listOf(
            Contact("Henry School", R.drawable.dm_image),
            Contact("Emily James", R.drawable.dm_image, isBold = true),
            Contact("Lily Thomas", R.drawable.dm_image)
        )

        // Sample friends to invite
        val inviteFriends = listOf(
            Friend("Amy Wesley", R.drawable.dm_image),
            Friend("Laura Ryan", R.drawable.dm_image),
            Friend("Christopher", R.drawable.dm_image)
        )

        // Find RecyclerViews by ID
        val recyclerInContacts = findViewById<RecyclerView>(R.id.recycler_in_contacts)
        val recyclerInviteFriends = findViewById<RecyclerView>(R.id.recycler_invite_friends)

        // Set up contacts recycler view
        contactAdapter = ContactAdapter(contacts)
        recyclerInContacts.layoutManager = LinearLayoutManager(this)
        recyclerInContacts.adapter = contactAdapter

        // Set up invite friends recycler view
        inviteFriendAdapter = InviteFriendAdapter(inviteFriends)
        recyclerInviteFriends.layoutManager = LinearLayoutManager(this)
        recyclerInviteFriends.adapter = inviteFriendAdapter
    }
}
