package com.example.grossary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // How to call an item using its id in kotlin

        linearLayoutManager = LinearLayoutManager(this)
        recycler_view_grossary.layoutManager = linearLayoutManager
        /**
         * You can use the code below to read the item widget by id else you can use the code above
         * val recyclerView = findViewById<RecyclerView>(R.id.recycler_view_grossary)
         * recyclerView.layoutManager = linearLayoutManager
         * */

    }
}