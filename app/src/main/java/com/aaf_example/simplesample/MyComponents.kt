package com.aaf_example.simplesample

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier

@Composable
fun Greeting(name: String, from: String,
             modifier: Modifier = Modifier,
             viewModel: MainViewModel = viewModel(),
             onNavigateToSecond: () -> Unit
) {
        val count by viewModel.uiState.collectAsState()

    Column (modifier =
        modifier.fillMaxSize()
            .statusBarsPadding()
            .navigationBarsPadding()){
        Text(text = "Hi $name! Count by StateFlow: $count")
        Button(onClick = {viewModel.incrementCounter()}) {
            Text("Нажимать!")
        }

        // Кнопка для перехода
        Button(onClick = {
            onNavigateToSecond()
        }) {
            Text("Перейти на 2-й экран")
        }
    }
  }
