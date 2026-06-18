package com.example.assignment2

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun NumberSquareTable(navController: NavController) {

    Column(
        modifier = Modifier.padding(start = 24.dp, top = 40.dp)
    ) {

        Row {
            Text(
                text = "Number",
                modifier = Modifier
                    .width(100.dp)
                    .border(1.dp, Color.Black)
                    .padding(8.dp)
            )

            Text(
                text = "Square",
                modifier = Modifier
                    .width(100.dp)
                    .border(1.dp, Color.Black)
                    .padding(8.dp)
            )
        }

        for (i in 1..10) {

            Row(
                modifier = Modifier.fillMaxWidth()
            ) {

                Text(
                    text = i.toString(),
                    modifier = Modifier
                        .width(100.dp)
                        .border(1.dp, Color.Black)
                        .padding(8.dp)
                )

                Text(
                    text = (i * i).toString(),
                    modifier = Modifier
                        .width(100.dp)
                        .border(1.dp, Color.Black)
                        .padding(8.dp)
                )
            }
        }
    }
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = AbsoluteAlignment.Right,
        verticalArrangement = Arrangement.Bottom
    )
    {
        Button(onClick = {
            navController.navigate("Numbers")
        }) {
            Text(text = "Next")
        }
    }
}