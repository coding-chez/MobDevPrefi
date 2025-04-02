package com.example.mobdevprefi.home

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mobdevprefi.R

class SimpleListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_list_view)

        val listView: ListView = findViewById(R.id.simpleListView)

        val birds = arrayOf(
            "Bald Eagle",
            "Peregrine Falcon",
            "Blue Jay",
            "Cardinal",
            "Great Horned Owl",
            "Snowy Owl",
            "Hummingbird",
            "Kingfisher",
            "Woodpecker",
            "Sparrow"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, birds)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, "Selected: ${birds[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}
