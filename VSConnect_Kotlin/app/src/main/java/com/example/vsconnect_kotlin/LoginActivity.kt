package com.example.vsconnect_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.vsconnect_kotlin.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityLoginBinding.inflate(layoutInflater)

        binding.btnEntrar.setOnClickListener {

            val mainIntent = Intent(this@LoginActivity,
                MainActivity::class.java)

            startActivity(mainIntent)

            finish()
        }
        setContentView(binding.root)
    }
}