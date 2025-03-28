package com.example.myapplication.service

import com.example.myapplication.ui.PokemonListResponse
import com.example.myapplication.ui.SportResult
//import com.example.myapplication.ui.SportListResponse
import com.example.myapplication.ui.SportUiState
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private const val BASE_URL =
    "http://10.0.2.2:8080/"
private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()
interface SportService {
    @GET("sport")
    suspend fun getSportList(): List<SportResult>

    //annotation class PokemonListResponse
}
object Sport {
    val retrofitService : SportService by lazy {
        retrofit.create(SportService::class.java)
    }
}