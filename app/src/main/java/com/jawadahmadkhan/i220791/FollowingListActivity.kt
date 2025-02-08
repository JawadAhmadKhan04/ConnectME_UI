package com.jawadahmadkhan.i220791

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FollowingListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.all_following)

        val FollowingRecyclerView = findViewById<RecyclerView>(R.id.followingRecyclerView)
        FollowingRecyclerView.layoutManager = LinearLayoutManager(this)

        val FollowingList = listOf(
            FollowingItem("Olympia Gassert", R.drawable.dm_image),
            FollowingItem("Carmel Humenik", R.drawable.dm_image),
            FollowingItem("Tony Penberthy", R.drawable.dm_image),
            FollowingItem("Heathcliff Boward", R.drawable.dm_image),
            FollowingItem("Fanni Medawar", R.drawable.dm_image),
            FollowingItem("Ava Bennin", R.drawable.dm_image)
        )

        FollowingRecyclerView.adapter = FollowingAdapter(FollowingList)

        // Tab switching: Navigate to Follower List
        findViewById<TextView>(R.id.followersTab).setOnClickListener {
            val intent = Intent(this, FollowerListActivity::class.java)
            startActivity(intent)
        }
    }
}
