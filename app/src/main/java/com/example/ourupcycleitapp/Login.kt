package com.example.ourupcycleitapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ourupcycleitapp.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.LoginBtn.setOnClickListener {
            validateRegistration()
        }



        binding.tvSignUp.setOnClickListener {
            var intent = Intent(this, SignUP::class.java)
            startActivity(intent)
        }

    }
    fun validateRegistration(){
        clearErrors()
        var formError = false
        var userName = binding.etUserName.text.toString()
        if (userName.isBlank()){
            formError = true
            binding.tilUserName.error = "User name is required"
        }
        var password = binding.etPassword.text.toString()
        if (password.isBlank()){
            formError = true
            binding.tilPassword.error = "Password is required"
        }

        if (!formError) {
            performRegistration(
                userName,
                password


            )
        }


    }
    fun clearErrors(){
        binding.tilUserName.error = null
        binding.tilPassword.error = null
    }
    private fun performRegistration(
        userName: String,
        password: String
    ) {

        val intent = Intent(this,successfullysaved::class.java)
        startActivity(intent)
    }
}








