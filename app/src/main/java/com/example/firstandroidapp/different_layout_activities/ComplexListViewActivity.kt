package com.example.firstandroidapp.different_layout_activities

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.firstandroidapp.R
import com.example.firstandroidapp.adapters.SingerAdapter
import com.example.firstandroidapp.model.Singer

class ComplexListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complex_list_view)
        val lvComplex: ListView = findViewById(R.id.lvComplex)
        val singerList = listOf(
            Singer(R.drawable.eminem, "Marshall", "Mathers", 40),
            Singer(R.drawable.pac2, "2pac", "Shakur", 50),
            Singer(R.drawable.drake, "Drake", "Shqiptari", 43),
            Singer(R.drawable.eminem, "Marshall", "Mathers", 40),
            Singer(R.drawable.pac2, "2pac", "Shakur", 50),
            Singer(R.drawable.drake, "Drake", "Shqiptari", 43),
            Singer(R.drawable.eminem, "Marshall", "Mathers", 40),
            Singer(R.drawable.pac2, "2pac", "Shakur", 50),
            Singer(R.drawable.drake, "Drake", "Shqiptari", 43)
        )
        val singerAdapter = SingerAdapter(this, singerList)
        lvComplex.adapter = singerAdapter

        lvComplex.setOnItemClickListener { parent, view, position, id ->
//            Toast.makeText(this,"Singer which was clicked is ${singerList[position].firstName}",Toast.LENGTH_LONG).show()
            val intent = Intent(this@ComplexListViewActivity, SingerDetailsActivity::class.java)
            intent.putExtra("photo", singerList[position].photo)
            intent.putExtra("firstName", singerList[position].firstName)
            startActivity(intent)
        }

    }
}