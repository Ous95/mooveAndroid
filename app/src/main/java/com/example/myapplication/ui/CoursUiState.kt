package com.example.myapplication.ui

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class CoursUiState(

    val id: Int=0,
    val nom: String="test",
    val description: String="test",
    val prix: Double=0.0,


)
