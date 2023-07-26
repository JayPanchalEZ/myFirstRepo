package GameModel.jay

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GameSection1(){

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Unscramble", fontSize = 15.sp)
        Spacer(modifier = Modifier.height(10.dp))
        Surface(
            border = BorderStroke(width = 1.dp, color = Color.LightGray),
            shape = RoundedCornerShape(20.dp),
            color = Color.LightGray ,
            shadowElevation = 10.dp,
            tonalElevation = 20.dp,
            modifier = Modifier.requiredSize(300.dp, 230.dp)
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(15.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Box(
                        modifier = Modifier.clip(shape = RoundedCornerShape(10.dp))
                    ){
                        Text(modifier = Modifier
                            .background(color = Color.Blue)
                            .padding(5.dp),
                            text = "0/10",
                            fontSize = 15.sp,
                            color = Color.White)
                    }
                }
                Spacer(modifier = Modifier.size(20.dp))
                Row {
                    Text(text = "SCREMBLEUN", fontSize = 25.sp)
                }

                Spacer(modifier = Modifier.height(15.dp))
                Text(text = "Unscramble the word using all the letters.")
                Spacer(modifier = Modifier.height(25.dp))
                Surface(
                    border = BorderStroke(width = 1.dp, color = Color.Black),
                    shape = RoundedCornerShape(15.dp),
                    modifier = Modifier.size(260.dp, 50.dp)


                ) {
                    TextField(
//                        modifier = Modifier.clip(shape = RoundedCornerShape(10.dp), ),
                        value = "Enter your word", onValueChange = {})

                }
            }
        }
    }
}










@Preview(showSystemUi = true, showBackground = true)
@Composable
fun GameModelPreview(){
    GameSection1()
}