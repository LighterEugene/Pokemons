package com.example.pokemons

import com.example.pokemons.model.PokemonInteractor

class StartPresenter(val view: StartView) {
    val interactor = PokemonInteractor()
    fun getPokemons(){
        val  disposable = interactor.getPokemons()?.subscribe({
            view.update(it.results)
        }, {

        })
    }
}