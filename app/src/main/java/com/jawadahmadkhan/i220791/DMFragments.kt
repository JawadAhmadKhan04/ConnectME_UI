package com.jawadahmadkhan.i220791

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DMFragment : Fragment() {
    private lateinit var dmRecyclerView: RecyclerView
    private lateinit var dmAdapter: DMAdapter
    private val dmList = listOf(
        DMItem("Henry Benjamin", R.drawable.dm_image),
        DMItem("Emily James", R.drawable.dm_image),
        DMItem("Lily Thomas", R.drawable.dm_image),
        DMItem("Christopher", R.drawable.dm_image),
        DMItem("Amy Wesley", R.drawable.dm_image),
        DMItem("Laura Ryan", R.drawable.dm_image)
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.fragments_dm, container, false)
        dmRecyclerView = view.findViewById(R.id.dmRecyclerView)
        dmRecyclerView.layoutManager = LinearLayoutManager(context)
        dmAdapter = DMAdapter(dmList)
        dmRecyclerView.adapter = dmAdapter
        return view
    }
}
