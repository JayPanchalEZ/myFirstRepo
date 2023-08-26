package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var num1EditText: EditText
    private lateinit var num2EditText: EditText
    private lateinit var additionButton: Button
    private lateinit var subtractionButton: Button
    private lateinit var multiplicationButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num1EditText = findViewById(R.id.num1EditText)
        num2EditText = findViewById(R.id.num2EditText)
        additionButton = findViewById(R.id.additionButton)
        subtractionButton = findViewById(R.id.subtractionButton)
        multiplicationButton = findViewById(R.id.multiplyButton)

        additionButton.setOnClickListener{performOperation('+')}
        subtractionButton.setOnClickListener { performOperation('-')
            multiplicationButton.setOnClickListener { performOperation('*') }}
    }
    private fun performOperation(operator: Char){
        val num1 = num1EditText.text.toString().toDoubleOrNull()
        val num2 = num2EditText.text.toString().toDoubleOrNull()

        if (num1 == null || num2 == null){
            showToast("Please enter both values")
        }

        val result = when(operator){
            '+' -> num1!! + num2!!
            '-' -> num1!! - num2!!
            '*' -> num1!! * num2!!
            else -> 0.0
        }

        showToast("Result: $result")
    }

    private fun showToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}