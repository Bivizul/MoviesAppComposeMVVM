package com.bivizul.moviesappcomposemvvm.presentation.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.bivizul.moviesappcomposemvvm.presentation.viewmodels.MainViewModel

@Composable
fun DetailScreen(navController: NavController, viewModel: MainViewModel, itemId: String) {
    Text("Details screen: item id: ${itemId}")
}