package com.jawadahmadkhan.i220791

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FollowerActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: FollowerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.all_followers)

        recyclerView = findViewById(R.id.followerRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Dummy Data: List of followers (Replace with API or Database)
        val followersList = listOf(
            Follower("User 1", R.drawable.dm_image),
            Follower("User 2", R.drawable.dm_image),
            Follower("User 3", R.drawable.dm_image),
            Follower("User 4", R.drawable.dm_image),
            Follower("User 5", R.drawable.dm_image)
        )

        adapter = FollowerAdapter(followersList)
        recyclerView.adapter = adapter

        val followingbtn = findViewById<TextView>(R.id.followingTab)

        followingbtn.setOnClickListener {
            val intent = Intent(this, FollowingActivity::class.java)
            startActivity(intent)
        }

        val closeposts = findViewById<ImageView>(R.id.back_button)

        // Set click listener
        closeposts.setOnClickListener {
            finish() // Closes the activity
        }

    }
}
