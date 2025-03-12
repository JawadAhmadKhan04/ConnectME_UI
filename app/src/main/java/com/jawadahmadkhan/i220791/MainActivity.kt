package com.jawadahmadkhan.i220791

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page)

        auth = FirebaseAuth.getInstance()
        val currentUser = auth.currentUser

        val logo = findViewById<View>(android.R.id.content)
        logo.alpha = 0f
        logo.animate().setDuration(5000).alpha(1f).withEndAction {
            if (currentUser != null) {
                startActivity(Intent(this, HomeActivity::class.java))
            } else {
                startActivity(Intent(this, LoginActivity::class.java))
            }
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}
