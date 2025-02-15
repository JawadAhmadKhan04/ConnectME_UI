package com.jawadahmadkhan.i220791

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ChatHiddenActivity : AppCompatActivity() {

    private lateinit var chatHiddenRecyclerView: RecyclerView
    private lateinit var chatRecyclerView: RecyclerView
    private lateinit var chatHiddenAdapter: ChatHiddenAdapter
    private lateinit var chatAdapter: ChatAdapter
    private lateinit var messagesHiddenList: MutableList<ChatHiddenMessage>
    private lateinit var messagesList: MutableList<ChatMessage>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.personal_hidden_chat)

        // Initialize RecyclerViews
        chatHiddenRecyclerView = findViewById(R.id.chatHiddenRecyclerView)  // FIXED: Added initialization
        chatRecyclerView = findViewById(R.id.chatRecyclerView)

        // Initialize message lists
        messagesHiddenList = mutableListOf() // FIXED: Initialized the list
        messagesList = mutableListOf()

        // Initialize Adapters
        chatHiddenAdapter = ChatHiddenAdapter(messagesHiddenList)
        chatAdapter = ChatAdapter(messagesList)

        val layoutManager = LinearLayoutManager(this).apply{
            stackFromEnd = true
            reverseLayout = false
        }

        val layoutManager2 = LinearLayoutManager(this@ChatHiddenActivity).apply{
            stackFromEnd = true
            reverseLayout = false
        }

        chatRecyclerView.layoutManager = layoutManager
        chatHiddenRecyclerView.layoutManager = layoutManager2
        chatRecyclerView.adapter = chatAdapter
        chatHiddenRecyclerView.adapter = chatHiddenAdapter


        // Set click listeners
        findViewById<Button>(R.id.view_profile_btn).setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        findViewById<ImageView>(R.id.back_button).setOnClickListener {
            finish()
        }

        // Add messages to lists and update adapters
        messagesList.add(ChatMessage("Hello how are you?", 3)) // Sent by user
        messagesList.add(ChatMessage("Hi I am great. WBU?", 4))
        messagesList.add(ChatMessage("I am doing well", 3))
        messagesList.add(ChatMessage("Good to know", 4))

        messagesHiddenList.add(ChatHiddenMessage("There is something IMP you should know", true)) // Sent by user

        // Notify adapters of data change
        chatAdapter.notifyDataSetChanged()
        chatHiddenAdapter.notifyDataSetChanged()
    }
}
