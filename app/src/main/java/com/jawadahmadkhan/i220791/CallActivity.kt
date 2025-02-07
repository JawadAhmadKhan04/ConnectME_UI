package com.jawadahmadkhan.i220791

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class CallActivity : AppCompatActivity() {

    private lateinit var muteButton: ImageView
    private lateinit var stopCamera: ImageView
    private var isMuted = false  // Track mute state
    private var isCameraOff = false  // Track mute state

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.call_screen)

        val endCall = findViewById<ImageView>(R.id.btnEndCall)
        muteButton = findViewById(R.id.btnMute)
        stopCamera = findViewById(R.id.btnVideo)

        // End call when button is clicked
        endCall.setOnClickListener {
            finish() // Ends the call and closes activity
        }

        // Toggle microphone on/off
        muteButton.setOnClickListener {
            toggleMute()
        }

        stopCamera.setOnClickListener {
            toggleCamera()
        }
    }

    private fun toggleMute() {
        if (isMuted) {
            muteButton.setImageResource(R.drawable.mic_logo)  // Switch to mic_on icon
        } else {
            muteButton.setImageResource(R.drawable.mic_off_logo) // Switch to mic_off icon
        }
        isMuted = !isMuted  // Toggle state
    }

    private fun toggleCamera() {
        if (isCameraOff) {
            stopCamera.setImageResource(R.drawable.video_call)  // Switch to mic_on icon
        } else {
            stopCamera.setImageResource(R.drawable.video_call_off) // Switch to mic_off icon
        }
        isCameraOff = !isCameraOff  // Toggle state
    }
}
