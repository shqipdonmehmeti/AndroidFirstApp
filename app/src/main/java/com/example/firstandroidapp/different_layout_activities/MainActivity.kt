package com.example.firstandroidapp.different_layout_activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstandroidapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}