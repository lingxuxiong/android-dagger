package com.example.android.dagger.splash

import com.example.android.dagger.di.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface WelcomeComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): WelcomeComponent
    }

    fun inject(activity: WelcomeActivity)
}