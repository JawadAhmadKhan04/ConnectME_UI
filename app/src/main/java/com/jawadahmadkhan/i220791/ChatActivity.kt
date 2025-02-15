package com.jawadahmadkhan.i220791

import android.content.Intent
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.Button
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
    private lateinit var gestureDetector: GestureDetector

    override fun onTouchEvent(event: MotionEvent): Boolean {
        return gestureDetector.onTouchEvent(event) || super.onTouchEvent(event)
    }


    inner class SwipeGestureListener : GestureDetector.SimpleOnGestureListener() {
        private val SWIPE_THRESHOLD = 100
        private val SWIPE_VELOCITY_THRESHOLD = 100

        override fun onFling(
            e1: MotionEvent?, // Ensure it's nullable
            e2: MotionEvent,
            velocityX: Float,
            velocityY: Float
        ): Boolean {
            // Check if e1 is not null before using it
            if (e1 == null) return false

            val deltaX = e2.x - e1.x
            val deltaY = kotlin.math.abs(e2.y - e1.y)

            if (kotlin.math.abs(deltaX) > SWIPE_THRESHOLD &&
                kotlin.math.abs(velocityX) > SWIPE_VELOCITY_THRESHOLD &&
                deltaY < SWIPE_THRESHOLD
            ) {
                if (deltaX > 0) {
                    val intent = Intent(this@ChatActivity, ChatHiddenActivity::class.java)
                    startActivity(intent)
                    overridePendingTransition(
                        android.R.anim.slide_in_left,
                        android.R.anim.slide_out_right
                    )
                }
                return true
            }
            return false
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.personal_chat)

        gestureDetector = GestureDetector(this, SwipeGestureListener())

        // Initialize RecyclerView
        chatRecyclerView = findViewById(R.id.chatRecyclerView)
        messagesList = mutableListOf()
        chatAdapter = ChatAdapter(messagesList)

        chatRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@ChatActivity)
            adapter = chatAdapter
        }

        // Set click listeners
        findViewById<Button>(R.id.view_profile_btn).setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }


        findViewById<ImageView>(R.id.call_button).setOnClickListener {
            startActivity(Intent(this, CallActivity::class.java))
        }

        findViewById<ImageView>(R.id.video_call_button).setOnClickListener {
            startActivity(Intent(this, VideoCallActivity::class.java))
        }

        findViewById<ImageView>(R.id.back_button).setOnClickListener {
            finish()
        }

        chatAdapter.addMessage(ChatMessage("Hello how are you?", 1)) // Sent by user
        chatAdapter.addMessage(ChatMessage("Hi I am great. WBU?", 2)) // Sent by user
        chatAdapter.addMessage(ChatMessage("I am doing well", 1)) // Sent by user
        chatAdapter.addMessage(ChatMessage("Good to know", 2)) // Sent by user
        chatAdapter.addMessage(ChatMessage("Hello how are you?", 1)) // Sent by user
        chatAdapter.addMessage(ChatMessage("Hi I am great. WBU?", 2)) // Sent by user
        chatAdapter.addMessage(ChatMessage("I am doing well", 1)) // Sent by user
        chatAdapter.addMessage(ChatMessage("Good to know", 2)) // Sent by user
        chatAdapter.addMessage(ChatMessage("Hello how are you?", 1)) // Sent by user
        chatAdapter.addMessage(ChatMessage("Hi I am great. WBU?", 2)) // Sent by user
        chatAdapter.addMessage(ChatMessage("I am doing well", 1)) // Sent by user
        chatAdapter.addMessage(ChatMessage("Good to know", 2)) // Sent by user


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
