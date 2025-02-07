package com.jawadahmadkhan.i220791

import android.graphics.Color
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class DMListActivity : AppCompatActivity() {

    private lateinit var dmsTab: TextView
    private lateinit var requestsTab: TextView
    private lateinit var viewPager: ViewPager2
    private lateinit var searchBar: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.all_dms)

        dmsTab = findViewById(R.id.dmsTab)
        requestsTab = findViewById(R.id.requestsTab)
        viewPager = findViewById(R.id.viewPager)
        searchBar = findViewById(R.id.searchBar)  // Make sure your EditText has this ID

        val adapter = DMTabsAdapter(this)
        viewPager.adapter = adapter

        // Tab click listeners
        dmsTab.setOnClickListener { viewPager.currentItem = 0 }
        requestsTab.setOnClickListener { viewPager.currentItem = 1 }

        // ViewPager change listener to update underline and search bar hint
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                updateTabUI(position)
            }
        })
    }

    private fun updateTabUI(position: Int) {
        if (position == 0) {
            dmsTab.setTextColor(Color.parseColor("#8B5E3B")) // Brown
            dmsTab.setBackgroundResource(R.drawable.underline_brown)
            requestsTab.setTextColor(Color.parseColor("#A9A9A9")) // Grey
            requestsTab.setBackground(null)
            searchBar.hint = "Search for DMs"  // Change hint for DMs
        } else {
            requestsTab.setTextColor(Color.parseColor("#8B5E3B")) // Brown
            requestsTab.setBackgroundResource(R.drawable.underline_brown)
            dmsTab.setTextColor(Color.parseColor("#A9A9A9")) // Grey
            dmsTab.setBackground(null)
            searchBar.hint = "Search for Requests"  // Change hint for Requests
        }
    }
}
