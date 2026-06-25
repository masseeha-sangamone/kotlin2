package com.example.assignment2b

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun NumberApp(navController: NavController) {

    var number by remember { mutableStateOf("") }

    var square by remember { mutableStateOf(0) }
    var cube by remember { mutableStateOf(0) }
    var factorial by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.padding(20.dp)
    ) {

        OutlinedTextField(
            value = number,
            onValueChange = {
                number = it
            },
            label = {
                Text("Enter a number")
            }
        )

        Button(
            onClick = {

                val n = number.toInt()

                square = n * n
                cube = n * n * n

                factorial = 1

                for (i in 1..n) {
                    factorial = factorial * i
                }
            },

            enabled = number.isNotEmpty() &&
                    number.toIntOrNull() != null &&
                    number.toInt() in 1..10,

            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue
            )

        ) {
            Text("Submit")
        }

        Text("Square: $square")
        Text("Cube: $cube")
        Text("Factorial: $factorial")
    }
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = AbsoluteAlignment.Left,
        verticalArrangement = Arrangement.Bottom
    )
    {
        Button(onClick = {navController.navigate("Square")
        }){
            Text(text= "Back")
        }

    }

    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = AbsoluteAlignment.Right,
        verticalArrangement = Arrangement.Bottom
    )
    {
        Button(onClick = {
            navController.navigate("Arithmetic")
        }) {
            Text(text = "Next")
        }

    }
}