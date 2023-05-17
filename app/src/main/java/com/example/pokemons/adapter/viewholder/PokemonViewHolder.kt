package com.example.pokemons.adapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.pokemons.data.PokemonData
import com.example.pokemons.data.Result
import com.example.pokemons.databinding.ItemPokemonBinding

class PokemonViewHolder(val binding: ItemPokemonBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Result){
        binding.namePokemon.text = item.name
    }
}