package com.artemissoftware.pokedexneo.pokemondetail

import androidx.lifecycle.ViewModel
import com.artemissoftware.pokedexneo.api.models.Pokemon
import com.artemissoftware.pokedexneo.repository.PokemonRepository
import com.artemissoftware.pokedexneo.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}