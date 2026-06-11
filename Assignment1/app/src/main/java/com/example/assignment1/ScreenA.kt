package com.example.assignment1

import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CatImage( modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val sound = MediaPlayer.create(context, R.raw.meow)

    Image(painter=painterResource(id=R.drawable.cat),
        contentDescription= "Cat",
        modifier = modifier
            .size(250.dp)
            .clickable{
                sound.start()
            },
        contentScale = ContentScale.Fit
    )
}