package com.jawadahmadkhan.i220791

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChatHiddenAdapter(private val messages: MutableList<ChatHiddenMessage>) :
    RecyclerView.Adapter<ChatHiddenAdapter.ChatViewHolder>() {

    inner class ChatViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val messageText: TextView = view.findViewById(R.id.messageText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            if (viewType == 1) R.layout.hidden_chat_bubble_sent else R.layout.hidden_chat_bubble_received,
            parent,
            false
        )
        return ChatViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        val message = messages[position]
        holder.messageText.text = message.message

        // Show profile picture only for received messages

    }


    override fun getItemViewType(position: Int): Int {
        return if (messages[position].isSentByUser) 1 else 0
    }

    override fun getItemCount(): Int = messages.size

    fun addMessage(message: ChatHiddenMessage) {
        messages.add(message)
        notifyItemInserted(messages.size - 1)
    }
}
