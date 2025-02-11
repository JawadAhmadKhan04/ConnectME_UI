package com.jawadahmadkhan.i220791

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FollowingActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: FollowingAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.all_following)

        recyclerView = findViewById(R.id.followingRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Dummy Data: List of followers (Replace with API or Database)
        val followingsList = listOf(
            Following("User 1", R.drawable.dm_image),
            Following("User 2", R.drawable.dm_image),
            Following("User 3", R.drawable.dm_image),
            Following("User 4", R.drawable.dm_image),
            Following("User 5", R.drawable.dm_image)
        )

        adapter = FollowingAdapter(followingsList)
        recyclerView.adapter = adapter


        val followerbtn = findViewById<TextView>(R.id.followersTab)

        followerbtn.setOnClickListener {
            val intent = Intent(this, FollowerActivity::class.java)
            startActivity(intent)
        }

        val closeposts = findViewById<ImageView>(R.id.back_button)

        // Set click listener
        closeposts.setOnClickListener {
            finish() // Closes the activity
        }
    }
}
