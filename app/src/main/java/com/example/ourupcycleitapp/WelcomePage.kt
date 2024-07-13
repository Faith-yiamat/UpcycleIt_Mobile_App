package com.example.ourupcycleitapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ourupcycleitapp.databinding.ActivityWelcomePageBinding

class WelcomePage : AppCompatActivity() {
    lateinit var binding: ActivityWelcomePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Home.setOnClickListener {
            finish()
        }
        binding.rvButton.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }



    }
}
