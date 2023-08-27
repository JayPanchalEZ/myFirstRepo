package com.example.tictactoe

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

public class WinDialog(context: Context, private val message: String, private val mainActivity: MainActivity, private val winImage: Int) : Dialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.win_dialog_layout)

        val messageTxt:TextView = findViewById(R.id.messageTxt)
        val startAgainBtn:Button= findViewById(R.id.btn_startAgain)
        var winImageView:ImageView = findViewById(R.id.win_image)
        var changeImage:Int
        changeImage = winImage
        winImageView.setImageResource(changeImage)

        messageTxt.text = message


        startAgainBtn.setOnClickListener{
            mainActivity.restartMatch()
            dismiss()
        }
    }

}