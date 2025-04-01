package com.example.myapplication.ui


data class SportUiState(
    val id: Int,
    val nom: String,
    val date: String,
)
data class SportListResponse(
    val results: List<SportResult>
)
data class SportResult(
    val id: Int,
    val nom: String,
    val date: String,
)


