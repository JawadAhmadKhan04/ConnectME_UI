package com.jawadahmadkhan.i220791

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
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

        // Initialize Views
        searchInput = findViewById(R.id.searchBar)
        recentSearchRecyclerView = findViewById(R.id.recent_search_list)

        // Setup RecyclerView
        searchAdapter = SearchHistoryAdapter(recentSearches) { name ->
            removeSearchItem(name)
        }
        recentSearchRecyclerView.layoutManager = LinearLayoutManager(this)
        recentSearchRecyclerView.adapter = searchAdapter

        // Search input listener
        searchInput.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Handle search filtering (if needed)
            }
        })
    }

    private fun removeSearchItem(name: String) {
        recentSearches.remove(name)
        searchAdapter.notifyDataSetChanged()
    }
}
