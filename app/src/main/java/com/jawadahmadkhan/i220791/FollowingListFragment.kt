package com.jawadahmadkhan.i220791

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FollowingListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.all_following, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.followingRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val followingList = listOf(
            FollowingItem("Olympia Gassert", R.drawable.dm_image),
            FollowingItem("Carmel Humenik", R.drawable.dm_image),
            FollowingItem("Tony Penberthy", R.drawable.dm_image),
            FollowingItem("Heathcliff Boward", R.drawable.dm_image),
            FollowingItem("Fanni Medawar", R.drawable.dm_image),
            FollowingItem("Ava Bennin", R.drawable.dm_image)
        )

        recyclerView.adapter = FollowingAdapter(followingList)

        return view
    }
}
