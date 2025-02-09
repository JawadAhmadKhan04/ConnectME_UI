package com.jawadahmadkhan.i220791

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class InviteFriendAdapter(private val friends: List<Friend>) :
    RecyclerView.Adapter<InviteFriendAdapter.InviteFriendViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InviteFriendViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_invite_new_friend, parent, false)
        return InviteFriendViewHolder(view)
    }

    override fun onBindViewHolder(holder: InviteFriendViewHolder, position: Int) {
        val friend = friends[position]
        holder.friendName.text = friend.name
        holder.profileImage.setImageResource(friend.profileImage)

        holder.inviteButton.setOnClickListener {
            // Handle invite action (e.g., show a Toast)
        }
    }

    override fun getItemCount(): Int = friends.size

    class InviteFriendViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profileImage: ImageView = itemView.findViewById(R.id.profile_image)
        val friendName: TextView = itemView.findViewById(R.id.friend_name)
        val inviteButton: Button = itemView.findViewById(R.id.invite_button)
    }
}
