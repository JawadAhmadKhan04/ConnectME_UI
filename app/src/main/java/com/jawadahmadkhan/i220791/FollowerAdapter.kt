package com.jawadahmadkhan.i220791

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FollowerAdapter(private val FollowerList: List<FollowerItem>) : RecyclerView.Adapter<FollowerAdapter.FollowerViewHolder>() {

    class FollowerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profileImage: ImageView = itemView.findViewById(R.id.profileImage)
        val nameText: TextView = itemView.findViewById(R.id.nameText)
        val newmessageIcon: ImageView = itemView.findViewById(R.id.newMessageIcon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FollowerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.follower_list_item, parent, false)
        return FollowerViewHolder(view)
    }

    override fun onBindViewHolder(holder: FollowerViewHolder, position: Int) {
        val FollowerItem = FollowerList[position]
        holder.profileImage.setImageResource(FollowerItem.imageRes)
        holder.nameText.text = FollowerItem.name

        // Click event (open chat)
        holder.itemView.setOnClickListener {
            // Implement chat opening logic
        }
    }

    override fun getItemCount() = FollowerList.size
}
