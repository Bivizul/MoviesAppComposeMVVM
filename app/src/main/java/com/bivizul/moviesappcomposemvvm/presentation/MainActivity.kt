package com.bivizul.moviesappcomposemvvm.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import com.bivizul.moviesappcomposemvvm.presentation.navigation.SetupNavHost
import com.bivizul.moviesappcomposemvvm.presentation.ui.theme.MoviesAppComposeMVVMTheme
import com.bivizul.moviesappcomposemvvm.presentation.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint // означает что здесь будут внедрения
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoviesAppComposeMVVMTheme {
                // Создаем navController
                val navController = rememberNavController()
                // Создадим viewModel from hilt
                val viewModel = hiltViewModel<MainViewModel>()

                SetupNavHost(
                    navController = navController,
                    viewModel = viewModel
                )
            }
        }
    }
}

