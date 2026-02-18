package com.aaf_example.simplesample

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SecondScreen(onBack: () -> Unit, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text("Это второй экран!")
        Button(onClick = onBack) {
            Text("Назад")
        }
    }
}