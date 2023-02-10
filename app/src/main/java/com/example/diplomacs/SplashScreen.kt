package com.example.diplomacs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SplashScreen : AppCompatActivity() {

    lateinit var logo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_splash)

        logo = findViewById(R.id.logo)

        // for intent splash activity to main activity with some transition.
        logo.alpha = 0f
        logo.animate().setDuration(2000).alpha(1f).withEndAction {
            var intent = Intent(this,SignInActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }
    }
}