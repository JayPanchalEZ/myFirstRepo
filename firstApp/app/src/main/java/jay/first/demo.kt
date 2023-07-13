package demo.kt

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AssistChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import jay.first.R

@Composable
fun Section1(){
    Row(
        modifier = Modifier.fillMaxHeight().padding(vertical = 10.dp),

        ) {


        Column {

            Text(
                text = "Hemlo Guys, I am Jay",
                fontSize = 20.sp,
            )
            Text(text = "You Just stay there")
        }

        Icon(imageVector = ImageVector.vectorResource(id = R.drawable.ic_search), contentDescription = null)
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Section2() {
    Row(

        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp)
    ) {
        AssistChip(onClick = { /*TODO*/ },
            label = { Text(text = "Sound Sleep") })
    }
    AssistChip(onClick = { /*TODO*/ },
        label = { Text(text = "Insomnia") })
    AssistChip(onClick = { /*TODO*/ },
        label = { Text(text = "Depression") })
}



@Preview(showBackground = true)
@Composable
fun Section1Preview(){
    Section1()
}