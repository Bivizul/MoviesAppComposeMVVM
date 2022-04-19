package com.bivizul.moviesappcomposemvvm.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.bivizul.moviesappcomposemvvm.presentation.navigation.SetupNavHost
import com.bivizul.moviesappcomposemvvm.presentation.ui.theme.MoviesAppComposeMVVMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoviesAppComposeMVVMTheme {
                // Создаем navController
                val navController = rememberNavController()
                SetupNavHost(navController = navController)
            }
        }
    }
}

