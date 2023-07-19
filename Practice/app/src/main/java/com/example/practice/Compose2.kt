package com.example.practice


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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.practice.ui.theme.Beige1
import com.example.practice.ui.theme.BlueViolet1
import com.example.practice.ui.theme.ButtonBlue
import com.example.practice.ui.theme.DeepBlue
import com.example.practice.ui.theme.LightGreen2
import com.example.practice.ui.theme.LightRed
import com.example.practice.ui.theme.OrangeYellow1


@Composable
//for upper text
fun Section1(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                text = "Good Morning, Jay",
                fontSize = 30.sp,
                color = Color.White)
            Text(
                text = "We wish you a Good Day!",
                fontSize = 15.sp,
                color = Color.White)
        }
        Icon(
            imageVector = ImageVector.vectorResource(id = R.drawable.ic_search),
            tint = Color.White,
            contentDescription = null)
    }
}

//for three upper buttons

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Section2(){
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(vertical = 15.dp),
//        horizontalArrangement = Arrangement.SpaceEvenly
//    ) {
//        AssistChip(
//            modifier = Modifier
//                .height(50.dp),
//            colors = AssistChipDefaults.assistChipColors(containerColor = Color.DarkGray),
//            onClick = { /*TODO*/ },
//            label = { Text(text = "Walking", color = Color.White)},
//            border = AssistChipDefaults.assistChipBorder(borderColor = ButtonBlue))
//
//        AssistChip(
//            modifier = Modifier
//                .height(50.dp),
//            colors = AssistChipDefaults.assistChipColors(containerColor = Color.DarkGray),
//            onClick = { /*TODO*/ },
//            label = { Text(text = "Running", color = Color.White)},
//            border = AssistChipDefaults.assistChipBorder(borderColor = ButtonBlue))
//
//        AssistChip(
//            modifier = Modifier
//                .height(50.dp),
//            colors = AssistChipDefaults.assistChipColors(containerColor = Color.DarkGray),
//            onClick = { /*TODO*/ },
//            label = { Text(text = "Jogging", color = Color.White)},
//            border = AssistChipDefaults.assistChipBorder(borderColor = ButtonBlue))
//    }

    LazyRow(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 15.dp),
        horizontalArrangement = Arrangement.spacedBy(20.dp)){
        val list = listOf<String>("Walking", "Running", "Jogging", "Sitting", "Meditating")

        items(list){
            item ->
            AssistChip(
                modifier = Modifier
                    .height(50.dp),
                colors = AssistChipDefaults.assistChipColors(containerColor = Color.DarkGray),
                onClick = { /*TODO*/ },
                label = { Text(text = item, color = Color.White)},
                border = AssistChipDefaults.assistChipBorder(borderColor = ButtonBlue))
        }
    }
}

//for middle one
@Composable
fun Section3(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(30.dp))
            .background(color = LightRed)
            .padding(15.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Column {
            Text(
                text = "Daily Thought",
                fontSize = 18.sp,
                color = Color.White)
            Text(
                text = "Morning walk for at least 30 min",
                color = Color.White)

        }
        IconButton(
            modifier = Modifier
                .size(40.dp)
                .clip(shape = CircleShape)
                .background(color = ButtonBlue),


            onClick = { /*TODO*/ }) {
            Icon(
                modifier = Modifier.size(20.dp),
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_play),
                contentDescription = null,
                tint = Color.White)

        }
//        Box (
//            modifier = Modifier
//                .size(40.dp)
//                .clip(shape = CircleShape)
//                .background(color = ButtonBlue),
//            contentAlignment = Alignment.Center,
//
//        ){
//            Icon(
//                modifier = Modifier.size(20.dp),
//                imageVector = ImageVector.vectorResource(id = R.drawable.ic_play),
//                contentDescription = null,
//                tint = Color.White,
//
//            )
//        }
    }
}

//for featured
@Composable
fun Section4(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
    ) {
        Text(
            text = "Featured",
            fontSize = 20.sp,
            color = Color.White)
    }
}

//for four boxes
@Composable
fun Section5(
    text: String,
    iconId: Int,
    backGroundColor: Color
) {
    Row() {
        Box(
            modifier = Modifier
                .size(180.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = backGroundColor)
                .padding(20.dp)
        ) {
            Text(
                text = text,
                fontSize = 22.sp,
                modifier = Modifier
                    .fillMaxSize()
            )
            Icon(
                modifier = Modifier
                    .align(Alignment.BottomStart),
                imageVector = ImageVector.vectorResource(id = iconId),

                contentDescription = null
            )
            Button(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .clip(shape = RoundedCornerShape(10.dp)),
                colors = ButtonDefaults.buttonColors(containerColor = ButtonBlue),
                onClick = { /*TODO*/ }) {
                Text(
                    text = "Start",
                    fontSize = 15.sp
                )
            }
        }
    }
}
@Composable
fun Section5child(){
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Section5(text = "Motivational Sounds", iconId = R.drawable.ic_music, backGroundColor = BlueViolet1)
            Spacer(modifier = Modifier.size(10.dp))
            Section5(text = "Tips for Running", iconId = R.drawable.ic_videocam, backGroundColor = LightGreen2)
        }
        Spacer(modifier = Modifier.size(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Section5(text = "Power Nap", iconId = R.drawable.ic_moon, backGroundColor = OrangeYellow1)
            Spacer(modifier = Modifier.size(10.dp))
            Section5(text = "Meditation Sounds", iconId = R.drawable.ic_headphone, backGroundColor = Beige1)
        }
    }
}





@Preview(showBackground = true)
@Composable

fun SectionPreview(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = DeepBlue)
            .padding(10.dp)
    ) {
        Section1()
        Section2()
        Spacer(modifier = Modifier.size(10.dp))
        Section3()
        Section4()
        Section5child()
        Button(onClick = {navController.navigate("detail")},
            modifier = Modifier.align(Alignment.End)) {
            Text(text = "Next Screen")
        }
    }

}