package com.example.firstandroidapp.different_layout_activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.firstandroidapp.R

class SingerDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singer_details)
        val singerPhoto : ImageView = findViewById( R.id.ivSingerDetailsPhoto)
        val singerFirstName : TextView = findViewById(R.id.tvSingerFirstNameDetails)

        val imageValue = intent.getIntExtra("photo",0)
        val firstNameValue = intent.getStringExtra("firstName")

        singerPhoto.setImageResource(imageValue)
        singerFirstName.text = firstNameValue
    }
}