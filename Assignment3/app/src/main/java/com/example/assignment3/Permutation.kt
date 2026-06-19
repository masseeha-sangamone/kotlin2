package com.example.assignment3

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.*
import android.R.attr.text

@Composable
fun permutations(){
    var word by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("")}

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ){
        OutlinedTextField(
            value = word,
            onValueChange = {
                if (it.length <= 6){
                    word = it.uppercase()
                }
            },
            label={Text("Enter Word(Maximum 6 Characters)")}
        )
        Button(
            onClick = {
                val list = mutableListOf<String>()
                permute(word, "", list)
                result = list.joinToString("\n")
            },
            modifier= Modifier.padding(top = 8.dp)) {
                Text("Generate")
            }
            Text(
                text=result,
                modifier= Modifier.padding(top=16.dp)
            )
    }
}

fun permute(
    word:String,
    answer:String,
    list:MutableList<String>
    ){
    if(word.isEmpty()){
        list.add(answer)
        return
    }
    for(i in word.indices){
        val ch= word[i]
        val left = word.substring(0,i)
        val right = word.substring(i+1)

        permute(left + right,answer + ch, list)
    }
}