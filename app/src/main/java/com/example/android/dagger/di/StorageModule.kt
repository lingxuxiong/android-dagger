package com.example.android.dagger.di

import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module

// annotates a Dagger module
@Module
interface StorageModule {

    // Make Dagger provides SharedPreferencesStorage when the storage type is requested
    @Binds
    fun provide(storage: SharedPreferencesStorage): Storage
}