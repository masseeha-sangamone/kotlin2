package com.example.assignment1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController

@Composable
fun Animals(navController: NavController, modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {

        Row {
            Column(modifier = Modifier.weight(1f)) {
                Image(painterResource(R.drawable.cat), "Cat")
                Text("Cat")
            }
            Column(modifier = Modifier.weight(1f)) {
                Image(painterResource(R.drawable.dog), "Dog")
                Text("Dog")
            }
        }

        Row {
            Column(modifier = Modifier.weight(1f)) {
                Image(painterResource(R.drawable.crocodile), "Crocodile")
                Text("Crocodile")
            }
            Column(modifier = Modifier.weight(1f)) {
                Image(painterResource(R.drawable.deer), "Deer")
                Text("Deer")
            }
        }

        Row {
            Column(modifier = Modifier.weight(1f)) {
                Image(painterResource(R.drawable.cow), "Cow")
                Text("Cow")
            }
            Column(modifier = Modifier.weight(1f)) {
                Image(painterResource(R.drawable.camel), "Camel")
                Text("Camel")
            }
        }

        Row {
            Column(modifier = Modifier.weight(1f)) {
                Image(painterResource(R.drawable.tiger), "Tiger")
                Text("Tiger")
            }
            Column(modifier = Modifier.weight(1f)) {
                Image(painterResource(R.drawable.turtle), "Turtle")
                Text("Turtle")
            }
        }

        Row {
            Column(modifier = Modifier.weight(1f)) {
                Image(painterResource(R.drawable.koala), "Koala")
                Text("Koala")
            }
            Column(modifier = Modifier.weight(1f)) {
                Image(painterResource(R.drawable.fox), "Fox")
                Text("Fox")
            }
        }

        Row {
            Column(modifier = Modifier.weight(1f)) {
                Image(painterResource(R.drawable.panda), "Panda")
                Text("Panda")
            }
            Column(modifier = Modifier.weight(1f)) {
                Image(painterResource(R.drawable.duck), "Duck")
                Text("Duck")
            }
        }

        Row {
            Column(modifier = Modifier.weight(1f)) {
                Image(painterResource(R.drawable.peacock), "Peacock")
                Text("Peacock")
            }
            Column(modifier = Modifier.weight(1f)) {
                Image(painterResource(R.drawable.zebra), "Zebra")
                Text("Zebra")
            }
        }

        Row {
            Column(modifier = Modifier.weight(1f)) {
                Image(painterResource(R.drawable.monkey), "Monkey")
                Text("Monkey")
            }
            Column(modifier = Modifier.weight(1f)) {
                Image(painterResource(R.drawable.snake), "Snake")
                Text("Snake")
            }
        }

        Row {
            Column(modifier = Modifier.weight(1f)) {
                Image(painterResource(R.drawable.penguin), "Penguin")
                Text("Penguin")
            }
            Column(modifier = Modifier.weight(1f)) {
                Image(painterResource(R.drawable.lion), "Lion")
                Text("Lion")
            }
        }

        Row {
            Column(modifier = Modifier.weight(1f)) {
                Image(painterResource(R.drawable.horse), "Horse")
                Text("Horse")
            }
            Column(modifier = Modifier.weight(1f)) {
                Image(painterResource(R.drawable.giraffe), "Giraffe")
                Text("Giraffe")
            }
        }
    }
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = AbsoluteAlignment.Left,
        verticalArrangement = Arrangement.Bottom
    )
    {
        Button(onClick = {navController.navigate("CatAndDog_Video")
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
            navController.navigate("Search_Animals")
        }) {
            Text(text = "Next")
        }

    }
}

