package com.sense.feature.search.impl.presentation

import com.sense.feature.search.impl.Feature

data class SearchUiState(
    val query: String = "",
    val results: List<Feature> = emptyList(),
    val isLoading: Boolean = false,
    val errorMessage: String = ""
)
