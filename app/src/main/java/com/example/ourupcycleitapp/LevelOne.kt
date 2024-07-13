package com.example.ourupcycleitapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ourupcycleitapp.databinding.ActivityLevelOneBinding

class LevelOne : AppCompatActivity() {
    lateinit var binding: ActivityLevelOneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLevelOneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvHome.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.tvContinue.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}