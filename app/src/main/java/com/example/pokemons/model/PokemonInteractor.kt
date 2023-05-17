package com.example.pokemons.model

import com.example.pokemons.data.PokemonDto
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class PokemonInteractor {

    fun getPokemons(): Observable<PokemonDto>? {
        return NetworkService.apiService.getData()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }
}