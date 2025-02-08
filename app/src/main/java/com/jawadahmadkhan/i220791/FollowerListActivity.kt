package com.jawadahmadkhan.i220791

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FollowerListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.all_followers)

        val FollowerRecyclerView = findViewById<RecyclerView>(R.id.viewPager)
        FollowerRecyclerView.layoutManager = LinearLayoutManager(this)

        val FollowerList = listOf(
            FollowerItem("Henry Benjamin", R.drawable.dm_image),
            FollowerItem("Emily James", R.drawable.dm_image),
            FollowerItem("Lily Thomas", R.drawable.dm_image),
            FollowerItem("Christopher", R.drawable.dm_image),
            FollowerItem("Amy Wesley", R.drawable.dm_image),
            FollowerItem("Laura Ryan", R.drawable.dm_image)
        )

        FollowerRecyclerView.adapter = FollowerAdapter(FollowerList)

        // Tab switching: Navigate to Following List
        findViewById<TextView>(R.id.followingTab).setOnClickListener {
            val intent = Intent(this, FollowingListActivity::class.java)
            startActivity(intent)
        }
    }
}
