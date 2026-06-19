package com.example.assignment2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.assignment2.ui.theme.Assignment2Theme
import com.example.assignment2b.NumberApp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.example.assignment.HorizontalGestures
import com.example.assignment2b.ArithmeticApp
import com.example.assignment.VerticalGestures

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Assignment2Theme {
                val navController= rememberNavController()

                NavHost(navController=navController, startDestination = "Square",builder= {
                    composable("Square") {
                        NumberSquareTable(navController)
                    }
                    composable("Numbers") {
                        NumberApp(navController)
                    }
                    composable("Arithmetic") {
                        ArithmeticApp(navController)
                    }
                    composable("HGestures") {
                        HorizontalGestures(navController)
                    }
                    composable("VGestures") {
                        VerticalGestures(navController)
                    }
                })
        }
    }
}
}

