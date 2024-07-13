package com.example.ourupcycleitapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ourupcycleitapp.databinding.ActivityCongratulationsPageBinding

class CongratulationsPage : AppCompatActivity() {
    lateinit var binding: ActivityCongratulationsPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCongratulationsPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvSave.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.tvHom.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}