package com.example.appnih

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appnih.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMatematika.setOnClickListener {
            startActivity(Intent(this, MatematikaActivity::class.java))
        }

        binding.btnBahasaIndonesia.setOnClickListener {
            startActivity(Intent(this, BahasaIndonesiaActivity::class.java))
        }
    }
}
