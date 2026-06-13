package com.example.assignment1

import android.net.Uri
import android.widget.MediaController
import android.widget.VideoView
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController

@Composable
fun CatAndDogVideo(
    videoUri: Uri,
    navController: NavController
) {
    AndroidView(
        factory = { context ->
            VideoView(context).apply {
                setVideoURI(videoUri)

                val myController = MediaController(context)
                myController.setAnchorView(this)
                setMediaController(myController)

                setOnPreparedListener {
                    start()
                }
            }

        })

    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = AbsoluteAlignment.Left,
        verticalArrangement = Arrangement.Bottom
    )
    {
        Button(onClick = {
            navController.navigate("Dog Image")
        }) {
            Text(text = "Back")
        }

    }



}