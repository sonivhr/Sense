package com.sense.feature.search.impl

import com.sense.core.navigation.EntryProviderInstaller
import com.sense.core.navigation.Navigator
import com.sense.feature.search.api.SearchKey
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
