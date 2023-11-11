package com.example.recyclerinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerinkotlin.databinding.ActivityMain2Binding
import com.example.recyclerinkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
      private lateinit var binding : ActivityMainBinding
      private lateinit var foodlist:ArrayList<Model>
    private lateinit var foodAdapter:Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        foodlist=ArrayList()
        binding.recycler.setHasFixedSize(true)
        binding.recycler.layoutManager=LinearLayoutManager(this)


          foodlist.add(Model(R.drawable.one , "MuscleMilk"))
          foodlist.add(Model(R.drawable.two , "MuscleMllk"))
         foodlist.add(Model(R.drawable.three , "MuscleMilk"))
         foodlist.add(Model(R.drawable.four , "MuscleMilk"))
        foodlist.add(Model(R.drawable.five , "MuscleMilk"))
        foodlist.add(Model(R.drawable.six , "MuscleMilk"))

        foodAdapter= Adapter(foodlist)
        binding.recycler.adapter=foodAdapter

    }
}