package com.bivizul.moviesappcomposemvvm.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.bivizul.moviesappcomposemvvm.presentation.screens.MainScreen
import com.bivizul.moviesappcomposemvvm.presentation.screens.Screens
import com.bivizul.moviesappcomposemvvm.presentation.screens.SplashScreenImpl

@Composable
fun SetupNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.SplashScreen.route
    ) {
        composable(route = Screens.SplashScreen.route) {
            SplashScreenImpl(navController = navController)
        }
        composable(route = Screens.MainScreen.route) { MainScreen() }
        composable(route = Screens.DetailsScreen.route) {}
    }
}