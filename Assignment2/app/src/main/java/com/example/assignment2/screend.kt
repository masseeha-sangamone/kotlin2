package com.example.assignment

import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HorizontalGestures(navController: NavController) {

    var number by remember { mutableStateOf(3) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .pointerInput(Unit) {
                detectHorizontalDragGestures { _, dragAmount ->
                    if (dragAmount < -20) {
                        number++
                        if (number > 99) {
                            number = 2
                        }
                    } else if (dragAmount > 20) {
                        number--
                        if (number < 2) {
                            number = 99
                        }
                    }
                }
            },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Table of $number",
            fontSize = 28.sp
        )
        Spacer(modifier = Modifier.height(20.dp))
        for (i in 1..10) {
            Text(
                text = "$number x $i = ${number * i}",
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.height(4.dp))
        }
    }
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = AbsoluteAlignment.Left,
        verticalArrangement = Arrangement.Bottom
    )
    {
        Button(onClick = {navController.navigate("Arithmetic")
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
            navController.navigate("VGestures")
        }) {
            Text(text = "Next")
        }
    }
}
