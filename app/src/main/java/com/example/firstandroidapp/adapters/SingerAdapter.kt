package com.example.firstandroidapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.firstandroidapp.R
import com.example.firstandroidapp.model.Singer

class SingerAdapter(private val context : Context ,private val list : List<Singer>) : BaseAdapter() {
    val layoutInflater : LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = layoutInflater.inflate(R.layout.complex_listview_item,parent,false)

        val singerPhoto = rowView.findViewById<ImageView>(R.id.ivSingerPhoto)
        val singerFirstName = rowView.findViewById<TextView>(R.id.tvSingerFirstName)
        val singerLastName = rowView.findViewById<TextView>(R.id.tvSingerLastName)
        val singerAge = rowView.findViewById<TextView>(R.id.tvSingerAge)

        singerPhoto.setImageResource(list[position].photo)
        singerFirstName.text = list[position].firstName
        singerLastName.text = list[position].lastName
        singerAge.text = list[position].age.toString()

        return rowView
    }
}