package com.example.tictactoe

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val combinationList: MutableList<IntArray> = mutableListOf()

    private var boxPositions = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0)

    private var playerTurn =1

    private var totalSelectedBoxes = 1

    private lateinit var playerOneLayout:LinearLayout
    private lateinit var playerTwoLayout:LinearLayout

    private lateinit var playerOneName:TextView
    private lateinit var playerTwoName:TextView

    private lateinit var image1:ImageView
    private lateinit var image2:ImageView
    private lateinit var image3:ImageView
    private lateinit var image4:ImageView
    private lateinit var image5:ImageView
    private lateinit var image6:ImageView
    private lateinit var image7:ImageView
    private lateinit var image8:ImageView
    private lateinit var image9:ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playerOneName = findViewById<TextView>(R.id.playerOneName)
        playerTwoName = findViewById<TextView>(R.id.playerTwoName)

        playerOneLayout = findViewById<LinearLayout>(R.id.playerOneLayout)
        playerTwoLayout = findViewById<LinearLayout>(R.id.playerTwoLayout)
        image1 = findViewById<ImageView>(R.id.image1)
        image2 = findViewById<ImageView>(R.id.image2)
        image3 = findViewById<ImageView>(R.id.image3)
        image4 = findViewById<ImageView>(R.id.image4)
        image5 = findViewById<ImageView>(R.id.image5)
        image6 = findViewById<ImageView>(R.id.image6)
        image7 = findViewById<ImageView>(R.id.image7)
        image8 = findViewById<ImageView>(R.id.image8)
        image9 = findViewById<ImageView>(R.id.image9)

        combinationList.add(intArrayOf(0,1,2))
        combinationList.add(intArrayOf(3,4,5))
        combinationList.add(intArrayOf(6,7,9))
        combinationList.add(intArrayOf(0,3,6))
        combinationList.add(intArrayOf(1,4,7))
        combinationList.add(intArrayOf(2,5,8))
        combinationList.add(intArrayOf(2,4,6))
        combinationList.add(intArrayOf(0,4,8))

        val getPlayerOneName: String? = intent.getStringExtra("playerOne")
        val getPlayerTwoName:String? = intent.getStringExtra("playerTwo")

        playerOneName.setText(getPlayerOneName)
        playerTwoName.setText(getPlayerTwoName)

        image1.setOnClickListener{
            if(isBoxSelectable(0)){
                performAction(it as ImageView, 0)
            }
        }

        image2.setOnClickListener{
            if(isBoxSelectable(1)){
                performAction(it as ImageView, 1)
            }
        }

        image3.setOnClickListener{
            if(isBoxSelectable(2)){
                performAction(it as ImageView, 2)
            }
        }

        image4.setOnClickListener{
            if(isBoxSelectable(3)){
                performAction(it as ImageView, 3)
            }
        }

        image5.setOnClickListener{
            if(isBoxSelectable(4)){
                performAction(it as ImageView, 4)
            }
        }

        image6.setOnClickListener{
            if(isBoxSelectable(5)){
                performAction(it as ImageView, 5)
            }
        }

        image7.setOnClickListener{
            if(isBoxSelectable(6)){
                performAction(it as ImageView, 6)
            }
        }

        image8.setOnClickListener{
            if(isBoxSelectable(7)){
                performAction(it as ImageView, 7)
            }
        }

        image9.setOnClickListener{
            if(isBoxSelectable(8)){
                performAction(it as ImageView, 8)
            }
        }

    }

    @SuppressLint("ResourceType")
    private fun performAction(imageView: ImageView, selectedBoxPosition:Int){

        boxPositions[selectedBoxPosition] = playerTurn

        if (playerTurn == 1){

            imageView.setImageResource(R.drawable.icons8_cross_50)

            if (checkPlayerWin()){

                val winDialog = WinDialog(this, playerOneName.text.toString()+" has won the match! Party <3", this, R.drawable.pretty_anime_girls_list_1_958x575 )
                winDialog.setCancelable(false)
                winDialog.show()
            }
            else if (totalSelectedBoxes == 9){
                val winDialog = WinDialog(this, "Both are Noobs!! It's a draw :(", this, R.drawable.desktop_wallpaper_these_anime_characters_are_disappointed_in_you_disappointed_anime_girls)
                winDialog.setCancelable(false)
                winDialog.show()
            }
            else{
                changePlayerTurn(2)
                totalSelectedBoxes++
            }
        }
        else{

            imageView.setImageResource(R.drawable.icons8_circle_50)

            if(checkPlayerWin()){
                val winDialog = WinDialog(this, playerTwoName.text.toString()+" has won the match! Party <3", this, R.drawable.pretty_anime_girls_list_1_958x575)
                winDialog.setCancelable(false)
                winDialog.show()
            }
            else if (selectedBoxPosition==9){
                val winDialog = WinDialog(this, "Both are Noobs!! It's a draw :(", this, R.drawable.desktop_wallpaper_these_anime_characters_are_disappointed_in_you_disappointed_anime_girls)
                winDialog.setCancelable(false)
                winDialog.show()
            }
            else{
                changePlayerTurn(1)
                totalSelectedBoxes++
            }
        }

    }

    fun changePlayerTurn(currentPlayerTurn:Int){
        playerTurn = currentPlayerTurn

        if(playerTurn == 1){
            playerOneLayout.setBackgroundResource(R.drawable.round_back_red_border)
            playerTwoLayout.setBackgroundResource(R.drawable.round_back_dark_red)
        }
        else{
            playerTwoLayout.setBackgroundResource(R.drawable.round_back_red_border)
            playerOneLayout.setBackgroundResource(R.drawable.round_back_dark_red)
        }
    }

    private fun checkPlayerWin():Boolean
    {
        var response:Boolean = false

        for (i in 0 until combinationList.size){
            val combination:IntArray = combinationList[i]

            if (boxPositions[combination[0]]==playerTurn && boxPositions[combination[1]]== playerTurn && boxPositions[combination[2]]== playerTurn){
                response = true
            }
        }
        return response
    }

    private fun isBoxSelectable(boxPosition:Int): Boolean {
        var response:Boolean =false

        if(boxPositions[boxPosition]==0){
            response = true
        }
        return response
    }

    public fun restartMatch(){
        boxPositions = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0)

        playerTurn = 1

        totalSelectedBoxes = 1

        image1.setImageResource(R.drawable.screenshot_2023_08_27_145331)
        image2.setImageResource(R.drawable.screenshot_2023_08_27_145331)
        image3.setImageResource(R.drawable.screenshot_2023_08_27_145331)
        image4.setImageResource(R.drawable.screenshot_2023_08_27_145331)
        image5.setImageResource(R.drawable.screenshot_2023_08_27_145331)
        image6.setImageResource(R.drawable.screenshot_2023_08_27_145331)
        image7.setImageResource(R.drawable.screenshot_2023_08_27_145331)
        image8.setImageResource(R.drawable.screenshot_2023_08_27_145331)
        image9.setImageResource(R.drawable.screenshot_2023_08_27_145331)
    }
}