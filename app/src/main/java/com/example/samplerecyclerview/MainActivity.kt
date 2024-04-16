package com.example.samplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView11: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView11 = findViewById(R.id.recyclerView1)

        val adaptor1 = LockAdaptor()
        val layoutManager1 = GridLayoutManager(this,5)
        recyclerView11.layoutManager = layoutManager1
        recyclerView11.adapter = adaptor1
    }


}