package com.example.practice

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practice.R

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun ColumnExample(){
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var text by remember {
            mutableStateOf("Default Text")
        }


        TextField(
            value = text,
            colors = TextFieldDefaults.textFieldColors(containerColor = Color.Gray),
            onValueChange ={typedvalue ->
                text = typedvalue
            } )

        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.textButtonColors(containerColor = Color.Red, contentColor = Color.White)) {
            Text(text = "Button")
            
        }

        Image(
            painter = painterResource(id = R.drawable._bc5323e6dd6489bcca8ecc3d4bdaf62),
            contentDescription = null)
    }


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun RowExample(){
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ){
        var text by remember {
            mutableStateOf("Type me")
        }

        Image(
            painter = painterResource(id = R.drawable._a179534dbbce21045ac6cb3b9f7f07a),
            contentDescription = null)

        TextField(
            modifier = Modifier
                .width(200.dp)
                .align(Alignment.CenterVertically),
            value = text,
            colors = TextFieldDefaults.textFieldColors(containerColor = Color.Magenta),
            onValueChange = {typedValue ->
                text = typedValue
            })
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.textButtonColors(containerColor = Color.Yellow, contentColor = Color.Black)) {
            Text(text = "I am a Button")
        }
        
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BoxExample(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Cyan) ){
            var text by remember {
                mutableStateOf("Default String")
            }

        Image(
            modifier = Modifier
                .size(200.dp)
                .align(Alignment.TopCenter),
            contentScale = ContentScale.FillBounds,
            painter = painterResource(id = R.drawable.among_us_background_for_zoom_calls_min),
            contentDescription = null,
            )

        TextField(
            modifier = Modifier
                .width(200.dp)
                .align(Alignment.Center),
            value = text,
            colors = TextFieldDefaults.textFieldColors(containerColor = Color.Yellow),
            onValueChange = {typedValue ->
                text = typedValue
            })

        Button(
            modifier = Modifier.align(Alignment.BottomCenter),
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.textButtonColors(containerColor = Color.Magenta, contentColor = Color.Black)) {
            Text(text = "Ok")
        }
        }
}




@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = false, showSystemUi = true)
@Composable
fun TextViewPreview(){
//    ColumnExample()
//    RowExample()
    BoxExample()
}
