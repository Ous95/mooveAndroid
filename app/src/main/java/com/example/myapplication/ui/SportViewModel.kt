package com.example.myapplication.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.service.Sport
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SportViewModel : ViewModel() {
    private val _sportUi = MutableStateFlow<List<SportUiState>>(emptyList())
    val sportUi: StateFlow<List<SportUiState>> = _sportUi
    init {
        getSportNames()
    }
    fun getSportNames() {
        viewModelScope.launch {
            val response = Sport.retrofitService.getSportList()
            _sportUi.value = response.map { sport ->
                SportUiState(
                    nom = sport.nom,
                    id = sport.id,
                    date = sport.date
                )
            }
        }
    }
}
