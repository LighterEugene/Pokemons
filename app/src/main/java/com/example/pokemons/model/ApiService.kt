package com.example.pokemons.model

import com.example.pokemons.data.PokemonDto
import io.reactivex.Observable
import retrofit2.http.GET

interface ApiService {
    @GET("/pokemon")
    fun getData(): Observable<PokemonDto>
}