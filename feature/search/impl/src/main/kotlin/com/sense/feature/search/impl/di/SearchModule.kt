package com.sense.feature.search.impl.di

import com.sense.core.navigation.EntryProviderInstaller
import com.sense.core.navigation.Navigator
import com.sense.feature.search.api.SearchKey
import com.sense.feature.search.impl.FakeSearchRepository
import com.sense.feature.search.impl.SearchRepository
import com.sense.feature.search.impl.composables.SearchScreen
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(ActivityRetainedComponent::class)
object SearchModule {

    @Provides
    @IntoSet
    fun provideSearchEntryProviderInstaller(navigator: Navigator): EntryProviderInstaller = {
        entry<SearchKey> {
            SearchScreen(onBackClick = { navigator.goBack() })
        }
    }
}

@Module
@InstallIn(ActivityRetainedComponent::class)
abstract class SearchRepositoryModule {
    @Binds
    abstract fun bindSearchRepository(repository: FakeSearchRepository): SearchRepository
}
