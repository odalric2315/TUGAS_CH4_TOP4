package com.percobaan.layoutloginonlinkedin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.InputBinding
import com.bumptech.glide.Glide
import com.percobaan.layoutloginonlinkedin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        Glide.with(this)
//            .load("https://logos-world.net/wp-content/uploads/2020/04/Linkedin-Logo-2019%E2%80%93present-700x394.jpg")
//            .into(binding.imageView2)

        binding.button.setOnClickListener {
            Log.d("Tekan Tombol", "Agree & Join")
        }
    }
}