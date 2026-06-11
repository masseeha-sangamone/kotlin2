package com.example.assignment1

import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Button
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.AbsoluteAlignment
import androidx.navigation.NavController


@Composable
fun CatImage(navController: NavController) {
    val context = LocalContext.current
    val sound = MediaPlayer.create(context, R.raw.meow)

    Image(painter=painterResource(id=R.drawable.cat),
        contentDescription= "Cat",
        Modifier
            .size(150.dp)
            .clickable{
                sound.start()
            },
        contentScale = ContentScale.Fit

    )
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = AbsoluteAlignment.Right,
        verticalArrangement = Arrangement.Bottom
    )
    {
        Button(onClick = {
            navController.navigate("Dog_Image")
        }){
            Text(text= "Next")
        }




    }
}
