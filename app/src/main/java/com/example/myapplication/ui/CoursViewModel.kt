package com.example.myapplication.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class CoursViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(CoursUiState())
    val uiState: StateFlow<CoursUiState> = _uiState.asStateFlow()
}