package com.example.diplomacs.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diplomacs.R
import com.example.diplomacs.databinding.ActivityMainBinding
import com.example.diplomacs.databinding.ActivitySignInBinding
import com.example.diplomacs.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseAuth = FirebaseAuth.getInstance()

        binding.btnSignOut.setOnClickListener {
            firebaseAuth.signOut()
            val intent = Intent(this,SignInActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}