package com.example.xmlfiledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var x = findViewById<Button>(R.id.button)

        x.setOnClickListener{
            Toast.makeText(this@MainActivity,"Hemlo Bro", Toast.LENGTH_SHORT).show()
        }
    }
}