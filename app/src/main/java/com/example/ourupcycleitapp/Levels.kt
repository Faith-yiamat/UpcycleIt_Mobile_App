package com.example.ourupcycleitapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ourupcycleitapp.databinding.ActivityLevelsBinding

class Levels : AppCompatActivity() {
    lateinit var binding: ActivityLevelsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLevelsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvLevels.layoutManager = LinearLayoutManager(this)
        displayLevels()
        binding.imHome.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.tvProceed.setOnClickListener {
            var intent = Intent(this, LevelOne::class.java)
            startActivity(intent)
        }

    }
    fun displayLevels(){
        val leve1 = all_levels_data("Level 1", "")
        val level2 = all_levels_data("Level 2", "")
        val level3 = all_levels_data("Level 3","")
        val level4 = all_levels_data("Level 4","")
        val level5 = all_levels_data("Level 5","")
        val leve6= all_levels_data("Level 6", "")
        val level7 = all_levels_data("Level 7", "")
        val level8 = all_levels_data("Level 8","")
        val level9 = all_levels_data("Level 9","")
        val level0 = all_levels_data("Level 10","")
        val myLevels = listOf(leve1,level2,level3,level4,level5,leve6,level7,level8,level9,level0)
        val levelsAdapter = AllLevels(myLevels)
        binding.tvLevels.adapter = levelsAdapter
    }

}