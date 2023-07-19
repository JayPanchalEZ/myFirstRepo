package com.example.practice

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@Composable
fun LazyLayoutsExamples(){
    val list = listOf("Jay", "Rishabh", "Aryan", "Prem", "Mamta")

    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(20.dp)
    ){
        item {
            Image(
                modifier = Modifier
                    .width(100.dp)
                    .height(50.dp)
                    .clip(RoundedCornerShape(15.dp)),
                painter = painterResource(id = R.drawable.among_us_background_for_zoom_calls_min),
                contentDescription = null)
        }
        items(list){stringObject ->
            Box(modifier = Modifier
                .width(70.dp)
                .height(50.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(color = Color.Cyan),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = stringObject,
                    color = Color.Red,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
fun LazyColumnComposable(){
    val list = listOf("Happy", "Happy", "Happy", "Happy", "Happy", "Happy", "Happy", "Happy", "Happy", "Happy", "Happy", "Happy", "Happy", "Happy","Happy","Happy","Happy","Happy","Happy","Happy","Happy")

    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(20.dp)

    ){
        item {
            Image(
                modifier = Modifier
                    .width(100.dp)
                    .height(50.dp)
                    .clip(RoundedCornerShape(15.dp)),
                painter = painterResource(id = R.drawable.among_us_background_for_zoom_calls_min),
                contentDescription = null)
        }
        items(list){stringObject ->
            Box(modifier = Modifier
                .width(70.dp)
                .height(50.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(color = Color.Cyan),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = stringObject,
                    color = Color.Red,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}


@Composable
fun LazyHorizontalGridExample(){
    val list = listOf("Happy", "Happy", "Happy", "Happy", "Happy", "Happy", "Happy", "Happy", "Happy", "Happy", "Happy", "Happy", "Happy", "Happy","Happy","Happy","Happy","Happy","Happy","Happy","Happy")

    LazyHorizontalGrid(
        modifier = Modifier.wrapContentHeight(),
        rows = GridCells.Fixed(3),
        horizontalArrangement = Arrangement.spacedBy(30.dp),
        verticalArrangement = Arrangement.spacedBy(30.dp),){
        items(list) {stringObject ->
            Box(modifier = Modifier
                .width(70.dp)
                .wrapContentHeight()
                .height(50.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(color = Color.Cyan),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = stringObject,
                    color = Color.Red,
                    fontWeight = FontWeight.Bold
                )}
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Scaffoldexample(){
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Main")}, colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color.Yellow))
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_play),
                    contentDescription = null
                )
            }
        },
        bottomBar = {
            BottomAppBar(
                containerColor = Color.DarkGray
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Icon(modifier = Modifier.size(50.dp), imageVector = Icons.Filled.AccountBox, contentDescription = null)
                    Icon(modifier = Modifier.size(50.dp), imageVector = Icons.Filled.AccountCircle, contentDescription = null)
                    Icon(modifier = Modifier.size(50.dp), imageVector = Icons.Filled.Call, contentDescription = null)
                    Icon(modifier = Modifier.size(50.dp), imageVector = Icons.Filled.Build, contentDescription = null)
                }
            }
        }
    ) {scaffolfDefaultPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(scaffolfDefaultPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Me andar hu scaffold ke hue hue hue")
            Spacer(modifier = Modifier.height(30.dp))

            SurfaceExample()
        }
    }
}

@Composable
fun SurfaceExample(){
    Surface(
        border = BorderStroke(width = 1.dp, color = Color.DarkGray),
        shape = RoundedCornerShape(20.dp),
        color = Color.Cyan,
        shadowElevation = 30.dp,
        tonalElevation = 100.dp,
        modifier = Modifier
            .height(60.dp)
            .width(90.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Jay Panchal\nEZ",
                textAlign = TextAlign.Center,
                color = Color.Red
            )
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ShowMe(
    navController: NavController
)
{
//    LazyLayoutsExamples()
//    LazyColumnComposable()
    LazyHorizontalGridExample()
//    Scaffoldexample()
    Button(onClick = { navController.run { navigate("Again") } }) {
        Text(text = "Previous Screen")
    }
}