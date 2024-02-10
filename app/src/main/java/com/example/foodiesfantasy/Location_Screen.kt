package com.example.foodiesfantasy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.foodiesfantasy.databinding.ActivityLocationScreenBinding

class Location_Screen : AppCompatActivity() {
    private val binding: ActivityLocationScreenBinding by lazy {
        ActivityLocationScreenBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val locationList = arrayOf("Ahmedabad", "Gandhinagar", "Surat", "Vadodara", "Rajkot", "Mehsana")
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,locationList)
        val autoCompleteTextView = binding.listOfLocation
        autoCompleteTextView.setAdapter(adapter)
    }
}