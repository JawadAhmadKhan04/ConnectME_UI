package com.jawadahmadkhan.i220791

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChatAdapter(private val messages: MutableList<ChatMessage>) :
    RecyclerView.Adapter<ChatAdapter.ChatViewHolder>() {

    inner class ChatViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val messageText: TextView = view.findViewById(R.id.messageText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val layoutId = when (viewType) {
            1 -> R.layout.chat_bubble_sent // Sent messages
            2 -> R.layout.chat_bubble_received // Received messages
            3 -> R.layout.chat_bubble_hidden_sent // Hidden messages
            else -> R.layout.chat_bubble_hidden_received // Hidden messages
        }

        val view = LayoutInflater.from(parent.context).inflate(layoutId, parent, false)
        return ChatViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        val message = messages[position]
        holder.messageText.text = message.message

        // Show profile picture only for received messages

    }

    override fun getItemViewType(position: Int): Int {
        return messages[position].isSentByUser
    }


    override fun getItemCount(): Int = messages.size

    fun addMessage(message: ChatMessage) {
        messages.add(message)
        notifyItemInserted(messages.size - 1)
    }
}
