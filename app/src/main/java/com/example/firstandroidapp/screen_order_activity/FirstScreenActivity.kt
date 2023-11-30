package com.example.firstandroidapp.screen_order_activity

import android.content.Intent
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
        findViews()
        onClick()
    }

    private fun onClick() {
        btnGoToNextScreen.setOnClickListener {
            val inputValue = etName.text.toString()
            val intent = Intent(this@FirstScreenActivity,SecondScreenActivity::class.java)
            intent.putExtra("etName",inputValue)
            startActivity(intent)
        }
    }

    private fun findViews() {
        btnGoToNextScreen = findViewById(R.id.btnGoToNextScreen)
        etName = findViewById(R.id.etName)
    }
}