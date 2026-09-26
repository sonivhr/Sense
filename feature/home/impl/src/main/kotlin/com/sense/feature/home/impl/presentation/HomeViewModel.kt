package com.sense.feature.home.impl.presentation

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

data class HomeUiState(
    val title: String = "Sense"
)

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {
    val uiState: HomeUiState = HomeUiState()



    override fun onCleared() {
        println("HomeViewModel cleared")
    }
}
