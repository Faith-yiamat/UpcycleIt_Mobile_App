package com.example.ourupcycleitapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ourupcycleitapp.databinding.ActivityVideoBinding

class Video : AppCompatActivity() {
    lateinit var binding: ActivityVideoBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tvHomes.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.tvContinued.setOnClickListener {
            var intent = Intent(this, LevelOne::class.java)
            startActivity(intent)
        }

    }
  }
