package com.example.myapplication.ui


data class SportUiState(
    val id: Int,
    val nom: String,
    val style: String,
)
data class SportListResponse(
    val results: List<SportResult>
)
data class SportResult(
    val id: Int,
    val nom: String,
    val style: String,
)


