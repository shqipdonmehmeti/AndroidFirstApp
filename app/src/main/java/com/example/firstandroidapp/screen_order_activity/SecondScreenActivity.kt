package com.example.firstandroidapp.screen_order_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.firstandroidapp.R

class SecondScreenActivity : AppCompatActivity() {
    private lateinit var tvShowDataFromFirstScreen : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)
        tvShowDataFromFirstScreen = findViewById(R.id.tvShowDataFromFirstScreen)
        val name = intent.getStringExtra("etName")
        tvShowDataFromFirstScreen.text = name
    }
}