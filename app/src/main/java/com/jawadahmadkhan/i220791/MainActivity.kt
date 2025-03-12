package com.jawadahmadkhan.i220791

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
//    private val splash_time: Long = 1000 // 1s
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.main_page)
//
//        Handler(Looper.getMainLooper()).postDelayed({
//            startActivity(Intent(this, LoginActivity::class.java))
//            finish()
//        }, splash_time)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page)

        val logo = findViewById<View>(android.R.id.content)
        logo.alpha = 0f
        logo.animate().setDuration(1500).alpha(1f).withEndAction {
            startActivity(Intent(this, LoginActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }


    // Detect tap anywhere on the screen
//        val rootLayout = findViewById<View>(android.R.id.content)
//        rootLayout.setOnClickListener {
//            val intent = Intent(this, LoginActivity::class.java)
//            startActivity(intent)
//        }
}