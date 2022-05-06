package com.bivizul.moviesappcomposemvvm.presentation.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bivizul.moviesappcomposemvvm.utils.Constants.TAG
import com.bivizul.moviesappcomposemvvm.data.models.Movies
import com.bivizul.moviesappcomposemvvm.data.network.ApiRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: ApiRepository) : ViewModel() {

    // Полный список фильмов
    private val _allMovies = MutableLiveData<List<Movies>>()
    val allMovies:LiveData<List<Movies>>
        get() = _allMovies

    suspend fun getAllMovies(){
        viewModelScope.launch {
            repository.getAllMovies().let {
                if(it.isSuccessful){
                    // Добавляем значения всех наших фильмов
                    _allMovies.postValue(it.body())
                } else {
                    Log.d(TAG,"Failed to load movies: ${it.errorBody()}")
                }
            }
        }

    }

}