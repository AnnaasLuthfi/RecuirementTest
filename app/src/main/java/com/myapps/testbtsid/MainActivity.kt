package com.myapps.testbtsid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.myapps.testbtsid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        actionBar?.hide()

        viewData()
    }

    private fun viewData() {
        val layoutManager = LinearLayoutManager(this)
        binding.recyclerviewDataList.layoutManager = layoutManager
        val item = DividerItemDecoration(this, layoutManager.orientation)
        binding.recyclerviewDataList.addItemDecoration(item)
    }
}