package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.registration.RegistrationComponent
import com.example.android.dagger.user.UserComponent
import com.example.android.dagger.user.UserManager
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class, AppSubcomponents::class])
interface AppComponent {

    // Types that can be retrieved from the graph
    fun registrationComponent(): RegistrationComponent.Factory
    fun loginComponent(): LoginComponent.Factory
    fun userComponent(): UserComponent.Factory

    fun userManager(): UserManager

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

}