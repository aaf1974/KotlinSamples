package com.aaf_example.simplesample

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun Greeting(name: String, from: String, modifier: Modifier = Modifier) {
    var clickCount by remember { mutableIntStateOf(0) }

    Column(modifier = modifier) {
        Text(text = "Привет, $name! Я из $from")
        Text(text = "Нажатий: $clickCount")

        Button(onClick = { clickCount++ }) {
            Text("Поклцай! меня. Не тормози!")
        }
    }
}