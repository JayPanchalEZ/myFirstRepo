package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class AddPlayersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_players)

        val startButton =findViewById<Button>(R.id.btn_start)

        startButton.setOnClickListener {

            val getPlayerOneName = findViewById<EditText>(R.id.playerOne_name).text.toString()
            val getPlayerTwoName = findViewById<EditText>(R.id.playerTwo_name).text.toString()

            if (getPlayerOneName.isNullOrEmpty() || getPlayerTwoName.isNullOrEmpty()){
                Toast.makeText(this, "Name Enter Kar Bhai/Behen :)", Toast.LENGTH_SHORT ).show()
            }
            else{
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("playerOne", getPlayerOneName)
                intent.putExtra("playerTwo", getPlayerTwoName)
                startActivity(intent)
            }
        }
    }
}