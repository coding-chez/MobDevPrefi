package com.example.mobdevprefi.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mobdevprefi.R
import com.example.mobdevprefi.model.Bird
import com.example.mobdevprefi.views.recyclerview.BirdRecyclerAdapter

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewBirds)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val birds = listOf(
            Bird("Bald Eagle", "Haliaeetus leucocephalus", "Forests, mountains, rivers", "A powerful raptor with a striking white head."),
            Bird("Peregrine Falcon", "Falco peregrinus", "Cliffs, cities", "The fastest bird, capable of speeds over 240 mph."),
            Bird("Blue Jay", "Cyanocitta cristata", "Woodlands, gardens", "A bright blue bird known for its intelligence."),
            Bird("Cardinal", "Cardinalis cardinalis", "Forests, suburban areas", "A vivid red songbird with a beautiful call."),
            Bird("Great Horned Owl", "Bubo virginianus", "Forests, deserts", "A nocturnal hunter with powerful talons."),
            Bird("Snowy Owl", "Bubo scandiacus", "Arctic tundra", "A white-feathered owl found in cold regions."),
            Bird("Hummingbird", "Trochilidae", "Tropical and temperate forests", "A tiny bird that hovers while feeding on nectar."),
            Bird("Kingfisher", "Alcedinidae", "Rivers, lakes", "A small bird known for its fishing skills."),
            Bird("Woodpecker", "Picidae", "Forests", "A bird that pecks at tree trunks in search of insects."),
            Bird("Sparrow", "Passeridae", "Urban and rural areas", "A small, adaptable bird found worldwide.")
        )

        val adapter = BirdRecyclerAdapter(birds)
        recyclerView.adapter = adapter
    }
}
