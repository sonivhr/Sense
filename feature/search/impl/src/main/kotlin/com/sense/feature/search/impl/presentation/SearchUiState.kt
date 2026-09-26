package com.sense.feature.search.impl.presentation

data class SearchUiState(
    val query: String = "",
    val results: List<String> = emptyList(),
    val isLoading: Boolean = false,
    val errorMessage: String = ""
)
