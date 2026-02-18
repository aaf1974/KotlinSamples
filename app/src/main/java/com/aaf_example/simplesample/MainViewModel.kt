package com.aaf_example.simplesample

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {
    // 1. Приватный поток (только для записи внутри VM)
    private val _uiState = MutableStateFlow(0)

    // 2. Публичный поток (только для чтения в UI) - аналог ReadOnly свойств
    val uiState: StateFlow<Int> = _uiState.asStateFlow()

    fun incrementCounter() {
        _uiState.value++ // Просто меняем значение, и UI узнает об этом
    }
}
