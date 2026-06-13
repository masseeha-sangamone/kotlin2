package com.example.assignment1

import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun CatAndDogImage(navController: NavController) {
    val context = LocalContext.current
    val sound1 = MediaPlayer.create(context, R.raw.meow)
    val sound2 = MediaPlayer.create(context, R.raw.bowbow)


        Row(
        ) {
            Image(
                painter = painterResource(id = R.drawable.cat),
                contentDescription = "Cat",
                Modifier
                    .size(250.dp)
                    .clickable {
                        sound1.start()
                    },
                contentScale = ContentScale.Fit

            )

            Image(
                painter = painterResource(id = R.drawable.dog),
                contentDescription = "Dog",
                Modifier
                    .size(250.dp)
                    .clickable {
                        sound2.start()
                    },
                contentScale = ContentScale.Fit

            )
        }
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = AbsoluteAlignment.Left,
        verticalArrangement = Arrangement.Bottom
    )
    {
        Button(onClick = {navController.navigate("Cat_Image")
        }){
            Text(text= "Back")
        }

    }
}
