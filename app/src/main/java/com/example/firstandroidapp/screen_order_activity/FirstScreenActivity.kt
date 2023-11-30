package com.example.firstandroidapp.screen_order_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton
import com.example.firstandroidapp.R

class FirstScreenActivity : AppCompatActivity() {
    private lateinit var etName : EditText
    private lateinit var btnGoToNextScreen : AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_screen)
    }
}