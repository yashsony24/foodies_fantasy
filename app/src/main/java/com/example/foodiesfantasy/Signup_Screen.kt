package com.example.foodiesfantasy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodiesfantasy.databinding.ActivitySignupScreenBinding

class Signup_Screen : AppCompatActivity() {
    private val binding: ActivitySignupScreenBinding by lazy {
        ActivitySignupScreenBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.alreadyhavebutton.setOnClickListener{
            val intent = Intent(this,Login_Screen::class.java)
            startActivity(intent)
        }
    }
}