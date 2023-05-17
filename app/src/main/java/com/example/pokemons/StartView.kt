package com.example.pokemons

import com.example.pokemons.data.Result

interface StartView {

    fun update(items: List<Result>)
}