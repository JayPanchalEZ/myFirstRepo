package jay.first

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import jay.first.ui.theme.FirstAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Hello Jay!",
            fontSize = 30.sp,
            color = Color.Red
        )

        Button(onClick = { /*TODO*/ }) {
            Text(text = "button")
        }
        TextField(value = "Edit me plss", onValueChange = {})

    }
    Row {
        Text(
            text = "Hello Jay!",
            fontSize = 30.sp,
            color = Color.Red
        )

        Button(onClick = { /*TODO*/ }) {
            Text(text = "button")
        }
        TextField(colors = TextFieldDefaults.textFieldColors(containerColor = Color.Red),value = "Idhar nahi udhar", onValueChange = {})
    }
}

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview() {
    FirstAppTheme {
        Greeting("Jay")
    }
}