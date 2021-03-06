package com.steve.turningpoint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.steve.turningpoint.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpRecyclerview()




    }

    private fun setUpRecyclerview() {
       val mainAdapter = MainAdapter()
        binding.recycler.apply {
            adapter = mainAdapter
        }
    }
}