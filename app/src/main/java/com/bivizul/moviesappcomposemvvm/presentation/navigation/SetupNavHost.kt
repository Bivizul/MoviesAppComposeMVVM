package com.bivizul.moviesappcomposemvvm.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.bivizul.moviesappcomposemvvm.presentation.screens.DetailScreen
import com.bivizul.moviesappcomposemvvm.presentation.screens.MainScreen
import com.bivizul.moviesappcomposemvvm.presentation.screens.Screens
import com.bivizul.moviesappcomposemvvm.presentation.screens.SplashScreenImpl
import com.bivizul.moviesappcomposemvvm.presentation.viewmodels.MainViewModel

@Composable
fun SetupNavHost(navController: NavHostController, viewModel: MainViewModel) {
    NavHost(
        navController = navController,
        startDestination = Screens.SplashScreen.route
    ) {
        composable(route = Screens.SplashScreen.route) {
            SplashScreenImpl(navController = navController, viewModel = viewModel)
        }
        composable(route = Screens.MainScreen.route) {
            MainScreen(navController = navController, viewModel = viewModel)
        }
        composable(route = Screens.DetailsScreen.route + "/{Id}") { backStackEntry ->
            DetailScreen(
                navController = navController,
                viewModel = viewModel,
                itemId = backStackEntry.arguments?.getString("Id") ?: "1")
        }
    }
}