package com.example.firstandroidapp.social_media_activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.example.firstandroidapp.R
import com.google.android.material.textfield.TextInputLayout

class InstagramActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instagram)
        val btnLogin : AppCompatButton = findViewById(R.id.btnLogin)
        val etUsername : TextInputLayout = findViewById(R.id.txtInputLayoutUsername)
        val etPassword : TextInputLayout = findViewById(R.id.txtInputLayoutPassword)
        btnLogin.setOnClickListener {
            val usernameValue = etUsername.editText?.text.toString()
            val passwordValue = etPassword.editText?.text.toString()
            if (usernameValue.isNullOrEmpty() || passwordValue.isNullOrEmpty()) {
                Toast.makeText(this,"Incorrect Login",Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this,"Valid login",Toast.LENGTH_LONG).show()
            }
        }


    }
}









