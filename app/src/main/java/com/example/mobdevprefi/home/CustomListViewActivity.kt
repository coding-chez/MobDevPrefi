package com.example.mobdevprefi.home

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.mobdevprefi.R
import com.example.mobdevprefi.model.Bird
import com.example.mobdevprefi.views.customlist.BirdAdapter

class CustomListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list_view)

        val listView: ListView = findViewById(R.id.customListView)

        val birds = listOf(
            Bird("Bald Eagle", "Haliaeetus leucocephalus", "Forests, mountains, rivers", "A powerful raptor with a striking white head.", R.drawable.bald_eagle),
            Bird("Peregrine Falcon", "Falco peregrinus", "Cliffs, cities", "The fastest bird, capable of speeds over 240 mph.", R.drawable.peregrine_falcon),
            Bird("Blue Jay", "Cyanocitta cristata", "Woodlands, gardens", "A bright blue bird known for its intelligence.", R.drawable.blue_jay),
            Bird("Cardinal", "Cardinalis cardinalis", "Forests, suburban areas", "A vivid red songbird with a beautiful call.", R.drawable.cardinal),
            Bird("Great Horned Owl", "Bubo virginianus", "Forests, deserts", "A nocturnal hunter with powerful talons.", R.drawable.great_horned_owl),
            Bird("Snowy Owl", "Bubo scandiacus", "Arctic tundra", "A white-feathered owl found in cold regions.", R.drawable.snowy_owl),
            Bird("Hummingbird", "Trochilidae", "Tropical and temperate forests", "A tiny bird that hovers while feeding on nectar.", R.drawable.hummingbird),
            Bird("Kingfisher", "Alcedinidae", "Rivers, lakes", "A small bird known for its fishing skills.", R.drawable.kingfisher),
            Bird("Woodpecker", "Picidae", "Forests", "A bird that pecks at tree trunks in search of insects.", R.drawable.woodpecker),
            Bird("Sparrow", "Passeridae", "Urban and rural areas", "A small, adaptable bird found worldwide.", R.drawable.sparrow)
        )

        val adapter = BirdAdapter(this, birds)
        listView.adapter = adapter
    }
}
