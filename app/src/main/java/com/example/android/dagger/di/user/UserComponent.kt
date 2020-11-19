package com.example.android.dagger.di.user

import com.example.android.dagger.di.LoggedUserScope
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.settings.SettingsActivity
import dagger.Subcomponent

@LoggedUserScope
@Subcomponent
interface UserComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): UserComponent
    }

    // Logged-in activities that can be injected by this class
    fun inject(activity: MainActivity)
    fun inject(activity: SettingsActivity)
}