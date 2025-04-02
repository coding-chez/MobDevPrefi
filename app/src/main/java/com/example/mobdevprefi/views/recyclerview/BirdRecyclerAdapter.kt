package com.example.mobdevprefi.views.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobdevprefi.R
import com.example.mobdevprefi.model.Bird

class BirdRecyclerAdapter(private val birds: List<Bird>) :
    RecyclerView.Adapter<BirdRecyclerAdapter.BirdViewHolder>() {

    class BirdViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgBird: ImageView = view.findViewById(R.id.imgBirdRecycler)
        val tvBirdName: TextView = view.findViewById(R.id.tvBirdNameRecycler)
        val tvScientificName: TextView = view.findViewById(R.id.tvScientificNameRecycler)
        val tvHabitat: TextView = view.findViewById(R.id.tvBirdHabitatRecycler)
        val tvDescription: TextView = view.findViewById(R.id.tvBirdDescriptionRecycler)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BirdViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_recycler, parent, false)
        return BirdViewHolder(view)
    }

    override fun onBindViewHolder(holder: BirdViewHolder, position: Int) {
        val bird = birds[position]
        holder.imgBird.setImageResource(bird.imageResId) // Set image
        holder.tvBirdName.text = bird.name
        holder.tvScientificName.text = "Scientific Name: ${bird.scientificName}"
        holder.tvHabitat.text = "Habitat: ${bird.habitat}"
        holder.tvDescription.text = bird.description
    }

    override fun getItemCount(): Int = birds.size
}
