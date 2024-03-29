package com.example.foodiesfantasy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodiesfantasy.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val foodName = intent.getStringExtra("MenuItemName")
        val foodImage = intent.getIntExtra("MenuItemImage",0)
        binding.FoodDetailName.text = foodName
        binding.DetailFoodImage.setImageResource(foodImage)

        binding.imageButton2.setOnClickListener{
            finish()
        }
    }
}