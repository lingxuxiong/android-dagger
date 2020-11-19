package com.example.android.dagger.di

import com.example.android.dagger.di.registration.RegistrationComponent
import dagger.Module

@Module(subcomponents = [RegistrationComponent::class])
interface AppSubComponents {
}