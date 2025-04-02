package com.example.mobdevprefi.home

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.mobdevprefi.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnSimpleListView: Button = findViewById(R.id.btnSimpleListView)
        val btnCustomListView: Button = findViewById(R.id.btnCustomListView)
        val btnRecyclerView: Button = findViewById(R.id.btnRecyclerView)

        btnSimpleListView.setOnClickListener {
            val intent = Intent(this, SimpleListViewActivity::class.java)
            startActivity(intent)
        }

        btnCustomListView.setOnClickListener {
            val intent = Intent(this, CustomListViewActivity::class.java)
            startActivity(intent)
        }

        btnRecyclerView.setOnClickListener {
            val intent = Intent(this, RecyclerViewActivity::class.java)
            startActivity(intent)
        }
    }
}
