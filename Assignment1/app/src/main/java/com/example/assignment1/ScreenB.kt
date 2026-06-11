package com.example.assignment1

import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CatAndDogImage( modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val sound1 = MediaPlayer.create(context, R.raw.meow)
    val sound2 = MediaPlayer.create(context, R.raw.bowbow)

    Row(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = R.drawable.cat),
            contentDescription = "Cat",
            modifier = modifier
                .size(250.dp)
                .clickable {
                    sound1.start()
                },
            contentScale = ContentScale.Fit

        )

        Image(
            painter = painterResource(id = R.drawable.dog),
            contentDescription = "Dog",
            modifier = modifier
                .size(250.dp)
                .clickable {
                    sound2.start()
                },
            contentScale = ContentScale.Fit

        )
    }
}