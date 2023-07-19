package com.example.practice

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MyApp(){

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination =  "Home"){

        composable(route = "Home"){
            SectionPreview(navController = navController)
        }

        composable(route = "detail"){
            ShowMe(navController = navController)
        }
        
        composable(route = "Again"){
            SectionPreview(navController = navController)
        }
        
    }
}



//sealed class  Destinations (val route: String){
//    object HomeScreen: Destinations("Home")
//    object DetailsScreen: Destinations("details")
//}

@Preview
@Composable
fun MyAppPreview(){
    MyApp()
}