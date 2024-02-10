package com.example.foodiesfantasy

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.delay

class Splash_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this,Start_Screen::class.java)
            startActivity(intent)
            finish()
        },(3000))
    }
}

private fun Handler.postDelayed(Splash_Screen: () -> Unit, delay: Unit) {

}


