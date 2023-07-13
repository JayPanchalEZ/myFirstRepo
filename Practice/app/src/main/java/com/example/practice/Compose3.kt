package com.example.practice

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun State(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var counter =
            remember {
                mutableStateOf(0)
            }



        Text(text = "count: ${counter.value}", fontSize = 30.sp)

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick ={
                counter.value = counter.value +1

                Log.d("UI", "$counter")
            }) {
            Text(text = "Click me")
        }

        Button(
            onClick ={
                if(counter.value >0) {
                    counter.value = counter.value - 1
                }
                Log.d("UI", "$counter")
            }) {
            Text(text = "Click me to decrease")
        }
    }
}




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun StateExamplePreview(){
    State()
}