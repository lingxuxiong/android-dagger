package com.example.android.dagger.splash

import com.example.android.dagger.user.UserManager
import javax.inject.Inject

class WelcomeViewModel @Inject constructor(
    private val userManager: UserManager
) {

    fun goToScreen(): Screen {
        return when {
            userManager.isUserLoggedIn() -> {
                Screen.MainScreen
            }
            userManager.isUserRegistered() -> {
                Screen.SignInScreen
            }
            else -> {
                Screen.RegistrationScreen
            }
        }
    }
}

enum class Screen {
    RegistrationScreen,
    SignInScreen,
    MainScreen
}
