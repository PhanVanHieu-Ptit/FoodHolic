package com.example.foodholic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val img = arrayOf(R.drawable.cake1, R.drawable.cake2,R.drawable.images,R.drawable.cake1,
    R.drawable.cake2)

    private val texts = arrayOf("Special Noodles", "Veg Biryani", "Veg Sandwich", "Pizza Friday", "Pancakes")

    private  val desc = arrayOf("non veg", "pure veg", "pure veg", "customizable", "pure veg")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomAdapter(img,texts,desc)
    }
}