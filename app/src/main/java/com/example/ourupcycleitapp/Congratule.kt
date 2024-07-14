package com.example.ourupcycleitapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ourupcycleitapp.databinding.ActivityCongratuleBinding

class Congratule : AppCompatActivity() {
    lateinit var binding: ActivityCongratuleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCongratuleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvSave.setOnClickListener {
            var intent = Intent(this, successfullysaved::class.java)
            startActivity(intent)
        }
        binding.tvHomed.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}