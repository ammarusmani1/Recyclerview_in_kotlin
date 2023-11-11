package com.example.recyclerinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerinkotlin.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {
    private  lateinit var binding : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val imageName = intent.getStringExtra("image")
        val imageId = intent.getIntExtra("name", 0)

        // Update the UI with the received data
        binding.imageView2.setImageResource(imageId)
        binding.textView2.text = imageName

    }
}