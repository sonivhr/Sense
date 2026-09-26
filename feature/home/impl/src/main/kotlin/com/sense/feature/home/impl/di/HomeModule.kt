package com.sense.feature.home.impl.di

import com.sense.core.navigation.EntryProviderInstaller
import com.sense.core.navigation.Navigator
import com.sense.feature.home.api.HomeKey
import com.sense.feature.home.impl.composables.HomeScreen
import com.sense.feature.search.api.SearchKey
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(ActivityRetainedComponent::class)
object HomeModule {

    @Provides
    @IntoSet
    fun provideHomeEntryProviderInstaller(navigator: Navigator): EntryProviderInstaller = {
        entry<HomeKey> {
            HomeScreen(onSearchClick = { navigator.navigate(SearchKey) })
        }
    }
}