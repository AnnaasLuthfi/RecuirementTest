package com.myapps.testbtsid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myapps.testbtsid.databinding.ActivityCreateBinding

class CreateActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCreateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}