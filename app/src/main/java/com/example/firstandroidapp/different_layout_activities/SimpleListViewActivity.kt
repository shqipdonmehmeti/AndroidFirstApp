package com.example.firstandroidapp.different_layout_activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.firstandroidapp.R

class SimpleListViewActivity : AppCompatActivity() {
    private lateinit var lvSimple : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_list_view)
        lvSimple = findViewById(R.id.lvSimple)
        val arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            listOf("Messi","Ronaldo","Neymar","Mbappe")
        )
        lvSimple.adapter = arrayAdapter

    }
}