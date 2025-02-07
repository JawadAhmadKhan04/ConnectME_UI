package com.jawadahmadkhan.i220791

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RequestsFragment : Fragment() {
    private lateinit var requestRecyclerView: RecyclerView
    private lateinit var requestAdapter: DMAdapter
    private val requestList = listOf(
        DMItem("John Doe", R.drawable.dm_image),
        DMItem("Sophia Carter", R.drawable.dm_image)
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.fragment_requests, container, false)
        requestRecyclerView = view.findViewById(R.id.requestRecyclerView)
        requestRecyclerView.layoutManager = LinearLayoutManager(context)
        requestAdapter = DMAdapter(requestList)
        requestRecyclerView.adapter = requestAdapter
        return view
    }
}
