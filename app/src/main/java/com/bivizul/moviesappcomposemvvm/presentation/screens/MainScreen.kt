package com.bivizul.moviesappcomposemvvm.presentation.screens

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.bivizul.moviesappcomposemvvm.constants.Constants
import com.bivizul.moviesappcomposemvvm.data.models.Movies
import com.bivizul.moviesappcomposemvvm.presentation.viewmodels.MainViewModel

@Composable
fun MainScreen(navController: NavController, viewModel: MainViewModel) {

    // Хранение списка всех фильмов, добавили по дефолту пустой лист
    val allMovies = viewModel.allMovies.observeAsState(listOf()).value
    allMovies.forEach {
        Log.d(Constants.TAG, "ID: ${it.id} name ${it.name}")
    }

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        LazyColumn {
            items(allMovies) { item ->
                MovieItem(item = item)
            }
        }
    }
}

@Composable
fun MovieItem(item: Movies) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Text(text = item.id.toString())
        Spacer(modifier = Modifier.padding(5.dp))
        Text(text = item.name)
    }
}