package com.example.diplomacs.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diplomacs.databinding.ScreenSplashBinding

class SplashScreen : AppCompatActivity() {

    lateinit var binding: ScreenSplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ScreenSplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // for intent splash activity to main activity with some transition.
        binding.logo.alpha = 0f
        binding.logo.animate().setDuration(2000).alpha(1f).withEndAction {
            var intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }
    }
}