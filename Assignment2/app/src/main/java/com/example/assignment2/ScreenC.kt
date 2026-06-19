package com.example.assignment2b

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlin.math.pow
import androidx.navigation.NavController
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.AbsoluteAlignment

@Composable
fun ArithmeticApp(navController: NavController) {
    var num1 by remember { mutableStateOf("") }
    var num2 by remember { mutableStateOf("") }
    var add by remember { mutableStateOf(0) }
    var sub by remember { mutableStateOf(0) }
    var mul by remember { mutableStateOf(0) }
    var intDiv by remember { mutableStateOf(0) }
    var rem by remember { mutableStateOf(0) }
    var hcfVal by remember { mutableStateOf(0) }
    var lcmVal by remember { mutableStateOf(0) }
    var div by remember { mutableStateOf(0.0) }
    var exp by remember { mutableStateOf(0.0) }

    fun hcf(a: Int, b: Int): Int {
        var x = a
        var y = b
        while (y != 0) {
            val temp = y
            y = x % y
            x = temp
        }
        return x
    }

    fun lcm(a: Int, b: Int): Int {
        return (a * b) / hcf(a, b)
    }

    Column(modifier = Modifier.padding(20.dp)) {
        OutlinedTextField(
            value = num1,
            onValueChange = { num1 = it },
            label = { Text("Enter first number") }
        )
        OutlinedTextField(
            value = num2,
            onValueChange = { num2 = it },
            label = { Text("Enter second number") }
        )

        Button(onClick = {
            val a = num1.toInt()
            val b = num2.toInt()
            add = a + b
            sub = a - b
            mul = a * b

            if (b != 0) {
                div = a.toDouble() / b
                intDiv = a / b
                rem = a % b
            }
            exp = a.toDouble().pow(b.toDouble())
            hcfVal = hcf(a, b)
            lcmVal = lcm(a, b)
        },
            enabled = num1.toIntOrNull() != null &&
                    num2.toIntOrNull() != null &&
                    num1.toInt() in 1..100 &&
                    num2.toInt() in 1..100,
            colors = ButtonDefaults.buttonColors(Color.Blue)
        ) {
            Text("Submit")
        }
        Text("Addition: $add")
        Text("Subtraction: $sub")
        Text("Multiplication: $mul")
        Text("Division: $div")
        Text("Integer Division: $intDiv")
        Text("Remainder: $rem")
        Text("Exponential: $exp")
        Text("HCF: $hcfVal")
        Text("LCM: $lcmVal")
    }

    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = AbsoluteAlignment.Left,
        verticalArrangement = Arrangement.Bottom
    )
    {
        Button(onClick = {navController.navigate("Numbers")
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
            navController.navigate("HGestures")
        }) {
            Text(text = "Next")
        }
    }
}


