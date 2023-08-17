package com.example.city_book_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.city_book_kotlin.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent
        //val selectedLandmark = intent.getStringExtra("landmark")
        val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark


        binding.NameText.text = selectedLandmark.name
        binding.CountryText.text = selectedLandmark.country
        binding.imageView.setImageResource(selectedLandmark.image)
    }
}