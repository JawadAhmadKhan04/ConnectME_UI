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
