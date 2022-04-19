package com.bivizul.moviesappcomposemvvm.presentation.screens

import com.bivizul.moviesappcomposemvvm.constants.Screens.DETAILS_SCREEN
import com.bivizul.moviesappcomposemvvm.constants.Screens.MAIN_SCREEN
import com.bivizul.moviesappcomposemvvm.constants.Screens.SPLASH_SCREEN

// Запечатанный класс
sealed class Screens(val route: String) {
    object SplashScreen: Screens(route = SPLASH_SCREEN)
    object MainScreen: Screens(route = MAIN_SCREEN)
    object DetailsScreen: Screens(route = DETAILS_SCREEN)
}