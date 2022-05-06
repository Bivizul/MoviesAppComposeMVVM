package com.bivizul.moviesappcomposemvvm.data.network

import com.bivizul.moviesappcomposemvvm.data.models.Movies
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    // В параметрах запишем наш endpoint
    @GET("/shows")
    suspend fun getAllMovies(): Response<List<Movies>>
}