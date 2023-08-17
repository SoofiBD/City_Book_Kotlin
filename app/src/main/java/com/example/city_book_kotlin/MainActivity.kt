package com.example.city_book_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.city_book_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        landmarkList = ArrayList()
        //Data

        val pisa = Landmark("Leaning Tower of Pisa", "Italy", R.drawable.pisa)
        val colosseum = Landmark("Colosseum", "Italy", R.drawable.colessum)
        val londonbridge = Landmark("London Bridge", "United Kingdom", R.drawable.londonbridge)

        landmarkList.add(pisa)
        landmarkList.add(colosseum)
        landmarkList.add(londonbridge)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkadapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkadapter
    }
}