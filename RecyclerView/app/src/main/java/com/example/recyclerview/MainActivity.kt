package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemList = listOf("Jay", "Rimshabh", "Rajaji", "Dadaji", "Sukuna", "Gojou", "Aryan", "Chachaji", "Sachin", "Lappu", "Hehe", "Cha", "ki", "Mut", "Ez", "Naikoteki", "Sama", "Oni", "Chan", "Lmao", "You", "And", "Me", "Cheems")

        val recyclerView:RecyclerView = findViewById(R.id.recyclerView)

        recyclerView.adapter = ItemAdapter(itemList)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}