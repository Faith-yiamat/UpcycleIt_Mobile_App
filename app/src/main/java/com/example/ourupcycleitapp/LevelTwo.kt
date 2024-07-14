package com.example.ourupcycleitapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ourupcycleitapp.databinding.ActivityLevelTwoBinding

class LevelTwo : AppCompatActivity() {
    lateinit var binding: ActivityLevelTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLevelTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imHome.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.tVContinue.setOnClickListener {
            var intent = Intent(this, Congratule::class.java)
            startActivity(intent)
        }

    }
}