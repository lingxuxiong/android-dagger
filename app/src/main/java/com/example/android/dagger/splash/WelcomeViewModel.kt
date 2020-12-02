package com.example.android.dagger.splash

import com.example.android.dagger.user.UserManager
import javax.inject.Inject

class WelcomeViewModel @Inject constructor(
    private val userManager: UserManager
) {

    fun goToScreen(): Screen {
        return when {
            userManager.isUserLoggedIn() -> {
                MainScreen
            }
            userManager.isUserRegistered() -> {
                SignInScreen
            }
            else -> {
                RegistrationScreen
            }
        }
    }
}

sealed class Screen
object RegistrationScreen : Screen()
object SignInScreen : Screen()
object MainScreen : Screen()
