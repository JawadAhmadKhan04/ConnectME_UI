package com.jawadahmadkhan.i220791

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FollowerListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.all_followers, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.followerRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val followerList = listOf(
            FollowerItem("Henry Benjamin", R.drawable.dm_image),
            FollowerItem("Emily James", R.drawable.dm_image),
            FollowerItem("Lily Thomas", R.drawable.dm_image),
            FollowerItem("Christopher", R.drawable.dm_image),
            FollowerItem("Amy Wesley", R.drawable.dm_image),
            FollowerItem("Laura Ryan", R.drawable.dm_image)
        )

        recyclerView.adapter = FollowerAdapter(followerList)

        return view
    }
}
