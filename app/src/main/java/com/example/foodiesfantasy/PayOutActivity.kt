package com.example.foodiesfantasy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodiesfantasy.databinding.ActivityPayOutBinding

class PayOutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPayOutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPayOutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.PlaceMyOrder.setOnClickListener {
            val bottomSheetDailog = CongratsBottomSheet()
            bottomSheetDailog.show(supportFragmentManager,"Test")
        }

    }
}