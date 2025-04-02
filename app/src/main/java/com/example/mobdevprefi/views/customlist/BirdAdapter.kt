package com.example.mobdevprefi.views.customlist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.BaseAdapter
import com.example.mobdevprefi.R
import com.example.mobdevprefi.model.Bird

class BirdAdapter(private val context: Context, private val birds: List<Bird>) : BaseAdapter() {

    override fun getCount(): Int = birds.size

    override fun getItem(position: Int): Any = birds[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.list_item_custom, parent, false)

        val tvBirdName: TextView = view.findViewById(R.id.tvBirdName)
        val tvScientificName: TextView = view.findViewById(R.id.tvScientificName)
        val tvHabitat: TextView = view.findViewById(R.id.tvHabitat)
        val tvDescription: TextView = view.findViewById(R.id.tvDescription)

        val bird = birds[position]
        tvBirdName.text = bird.name
        tvScientificName.text = "Scientific Name: ${bird.scientificName}"
        tvHabitat.text = "Habitat: ${bird.habitat}"
        tvDescription.text = bird.description

        return view
    }
}
