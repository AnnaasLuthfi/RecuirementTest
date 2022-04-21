package com.myapps.testbtsid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myapps.testbtsid.databinding.ActivityUpdateDataBinding

class UpdateDataActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUpdateDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUpdateDataBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}