package com.jawadahmadkhan.i220791

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ChatActivity : AppCompatActivity() {

    private lateinit var chatRecyclerView: RecyclerView
    private lateinit var chatAdapter: ChatAdapter
    private lateinit var messagesList: MutableList<ChatMessage>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.personal_chat)

        // Initialize RecyclerView
        chatRecyclerView = findViewById(R.id.chatRecyclerView)
        messagesList = mutableListOf()
        chatAdapter = ChatAdapter(messagesList)

        chatRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@ChatActivity)
            adapter = chatAdapter
        }

        // Set click listeners
        findViewById<ImageView>(R.id.call_button).setOnClickListener {
            startActivity(Intent(this, CallActivity::class.java))
        }

        findViewById<ImageView>(R.id.video_call_button).setOnClickListener {
            startActivity(Intent(this, VideoCallActivity::class.java))
        }

        findViewById<ImageView>(R.id.back_button).setOnClickListener {
            finish()
        }

        chatAdapter.addMessage(ChatMessage("Hello how are you?", true)) // Sent by user
        chatAdapter.addMessage(ChatMessage("Hi I am great. WBU?", false)) // Sent by user
        chatAdapter.addMessage(ChatMessage("I am doing well", true)) // Sent by user
        chatAdapter.addMessage(ChatMessage("Good to know", false)) // Sent by user


//        val messageInput = findViewById<EditText>(R.id.messageInput)
//        val sendMessageButton = findViewById<ImageButton>(R.id.sendMessageButton)
//
//        sendMessageButton.setOnClickListener {
//            val messageText = messageInput.text.toString().trim()
//            if (messageText.isNotEmpty()) {
//                chatAdapter.addMessage(ChatMessage(messageText, true)) // Sent by user
//                chatRecyclerView.scrollToPosition(messagesList.size - 1) // Scroll to bottom
//                messageInput.text.clear()
//            }
//        }
    }
}
