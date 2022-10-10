package com.bivizul.moviesappcomposemvvm.presentation.screens

import com.bivizul.moviesappcomposemvvm.utils.Screens.DETAILS_SCREEN
import com.bivizul.moviesappcomposemvvm.utils.Screens.MAIN_SCREEN
import com.bivizul.moviesappcomposemvvm.utils.Screens.SPLASH_SCREEN

// Запечатанный класс
sealed class Screens(val route: String) {
    object SplashScreen: Screens(route = SPLASH_SCREEN)
    object MainScreen: Screens(route = MAIN_SCREEN)
    object DetailsScreen: Screens(route = DETAILS_SCREEN)
}