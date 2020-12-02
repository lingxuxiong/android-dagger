package com.example.android.dagger.di

import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.registration.RegistrationComponent
import com.example.android.dagger.splash.WelcomeComponent
import com.example.android.dagger.user.UserComponent
import dagger.Module

@Module(subcomponents = [
    WelcomeComponent::class,
    RegistrationComponent::class,
    LoginComponent::class,
    UserComponent::class
])
class AppSubcomponents