package com.example.firstandroidapp.social_media_activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.example.firstandroidapp.R

class SnapchatActivity : AppCompatActivity() {
    private lateinit var btnLogin : AppCompatButton
    private lateinit var btnSignUp : AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snapchat)
        findViews()
        onBtnClicked()
    }

    private fun onBtnClicked() {
        btnLogin.setOnClickListener {
            Toast.makeText(this,"Login was clicked",Toast.LENGTH_SHORT).show()
        }
        btnSignUp.setOnClickListener {
            Toast.makeText(this,"Sign up was clicked",Toast.LENGTH_SHORT).show()
        }
    }

    private fun findViews() {
        btnLogin = findViewById(R.id.btnSnapLogin)
        btnSignUp = findViewById(R.id.btnSnapSignUp)
    }
}