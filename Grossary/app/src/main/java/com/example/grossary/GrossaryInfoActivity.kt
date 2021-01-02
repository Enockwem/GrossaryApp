package com.example.grossary

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GrossaryInfoActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grossary_info)

        val itemTitle = findViewById<TextView>(R.id.item_title)
        val itemValue = findViewById<TextView>(R.id.item_value)
        val itemDescription = findViewById<TextView>(R.id.item_description)
    }
}