package com.example.assignment1.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Animal(
    navController: NavController
) {

    var searchText by remember {
        mutableStateOf("")
    }

    val filteredAnimals = animalList.filter {
        it.name.startsWith(searchText, ignoreCase = true)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {

        TextField(
            value = searchText,
            onValueChange = {
                searchText = it
            },
            label = {
                Text("Search Animal")
            },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        for (i in filteredAnimals.indices step 2) {

            Row(
                modifier = Modifier.fillMaxWidth()
            ) {

                Column(
                    modifier = Modifier.weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Image(
                        painter = painterResource(
                            id = filteredAnimals[i].image
                        ),
                        contentDescription = filteredAnimals[i].name,
                        modifier = Modifier.height(150.dp)
                    )

                    Text(
                        text = filteredAnimals[i].name
                    )
                }

                if (i + 1 < filteredAnimals.size) {

                    Column(
                        modifier = Modifier.weight(1f),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Image(
                            painter = painterResource(
                                id = filteredAnimals[i + 1].image
                            ),
                            contentDescription = filteredAnimals[i + 1].name,
                            modifier = Modifier.height(150.dp)
                        )

                        Text(
                            text = filteredAnimals[i + 1].name
                        )
                    }
                }
            }

            Spacer(
                modifier = Modifier.height(12.dp)
            )
        }
    }
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = AbsoluteAlignment.Left,
        verticalArrangement = Arrangement.Bottom
    )
    {
        Button(onClick = {navController.navigate("Search_Animals")
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
            navController.navigate("")
        }) {
            Text(text = "Next")
        }

    }
}
