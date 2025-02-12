package com.jawadahmadkhan.i220791

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SearchActivity : AppCompatActivity() {

    private lateinit var searchInput: EditText
    private lateinit var recentSearchRecyclerView: RecyclerView
    private lateinit var searchAdapter: SearchHistoryAdapter
    private val recentSearches = mutableListOf("Henry Benjamin", "Emily James", "Lily Thomas")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.searching_people)

        searchInput = findViewById(R.id.searchBar)
        recentSearchRecyclerView = findViewById(R.id.recent_search_list)

        searchAdapter = SearchHistoryAdapter(recentSearches) { name ->
            removeSearchItem(name)
        }
        recentSearchRecyclerView.layoutManager = LinearLayoutManager(this)
        recentSearchRecyclerView.adapter = searchAdapter

        setupNavigation()
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

    private fun removeSearchItem(name: String) {
        recentSearches.remove(name)
        searchAdapter.notifyDataSetChanged()
    }


}
