package com.example.android.dagger

import com.example.android.dagger.di.AppComponent
import com.example.android.dagger.di.AppSubComponents
import com.example.android.dagger.di.TestStorageModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [TestStorageModule::class, AppSubComponents::class])
interface TestAppComponent : AppComponent