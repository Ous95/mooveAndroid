package com.example.myapplication.ui

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class CoursUiState(

    val id: Int,
    val nom: String,
    val description: String,
    val prix: Double,


)
