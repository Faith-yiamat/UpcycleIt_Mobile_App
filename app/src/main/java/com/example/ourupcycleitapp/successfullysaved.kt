package com.example.ourupcycleitapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ourupcycleitapp.databinding.ActivitySuccessfullysavedBinding

class successfullysaved : AppCompatActivity() {
    lateinit var binding: ActivitySuccessfullysavedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuccessfullysavedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvHomed.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.tvProceeed.setOnClickListener {
            var intent = Intent(this,LevelTwo::class.java)
            startActivity(intent)
        }
    }
}