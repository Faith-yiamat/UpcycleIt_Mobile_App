package com.example.ourupcycleitapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ourupcycleitapp.databinding.ActivitySignUpBinding

class SignUP : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.signUpButton.setOnClickListener {
//            var intent = Intent(this, CongratulationsPage::class.java)
//            startActivity(intent)
//        }
//
        binding.tvLogin.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.signUpButton.setOnClickListener {
            validateRegistration()
        }

    }

    fun validateRegistration(){
        clearErrors()
        var formError = false
        var fullName = binding.etFullName.text.toString()
        if (fullName.isBlank()){
            formError = true
            binding.tilFullName.error = "Full Name is required"
        }
        var userName = binding.etUserName.text.toString()
        if (userName.isBlank()){
            formError = true
            binding.tilUserNam.error = "User name is required"
        }
        var password = binding.etPassword.text.toString()
        if (password.isBlank()){
            formError = true
            binding.tilPassword.error = "Password is required"
        }
        var confirmPassword = binding.etConfirmPassword.text.toString()
        if (confirmPassword.isBlank()){
            formError = true
            binding.tilConfirmPassword.error = "Confirm Password is required"
        }

        if (!formError) {
            performRegistration(
                fullName,
                userName,
                password,
                confirmPassword

            )
        }



    }
    fun clearErrors(){
        binding.tilUserNam.error = null
        binding.tilPassword.error = null
        binding.tilFullName.error = null
        binding.tilConfirmPassword.error = null
    }

    private fun performRegistration(
        fullName: String,
        userName: String,
        password: String,
        confirmPassword: String
    ) {

        val intent = Intent(this, CongratulationsPage::class.java)
        startActivity(intent)
    }
}