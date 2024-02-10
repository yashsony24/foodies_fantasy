package com.example.foodiesfantasy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.foodiesfantasy.databinding.ActivityLoginScreenBinding
import com.example.foodiesfantasy.databinding.ActivitySignupScreenBinding

class Login_Screen : AppCompatActivity() {
    private val binding: ActivityLoginScreenBinding by lazy {
        ActivityLoginScreenBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(binding.root)
        binding.loginbutton.setOnClickListener{
            val intent = Intent(this, Signup_Screen::class.java)
            startActivity(intent)
        }
        binding.donthavebutton.setOnClickListener{
            val intent = Intent(this, Signup_Screen::class.java)
            startActivity(intent)
        }
    }
}