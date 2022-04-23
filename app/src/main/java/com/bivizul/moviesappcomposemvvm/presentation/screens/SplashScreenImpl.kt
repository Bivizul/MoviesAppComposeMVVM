package com.bivizul.moviesappcomposemvvm.presentation.screens

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.runtime.*
import androidx.navigation.NavController
import com.bivizul.moviesappcomposemvvm.presentation.viewmodels.MainViewModel
import kotlinx.coroutines.delay

@Composable
fun SplashScreenImpl(navController: NavController, viewModel: MainViewModel) {

    // Анимацию
    var startAnimate by remember { mutableStateOf(false) }
    val alphaAnimation = animateFloatAsState(
        targetValue = if (startAnimate) 1f else 0f,
        animationSpec = tween(durationMillis = 3000)
    )

    // Launch effect
    LaunchedEffect(key1 = true){
        startAnimate = true
        // Загрузка фильмов во время анимации
        viewModel.getAllMovies()
        delay(4000)
        navController.navigate(Screens.MainScreen.route)
    }

    SplashScreen(alpha = alphaAnimation.value)
}