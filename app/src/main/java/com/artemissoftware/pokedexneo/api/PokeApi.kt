package com.artemissoftware.pokedexneo.api

import com.artemissoftware.pokedexneo.api.models.Pokemon
import com.artemissoftware.pokedexneo.api.models.PokemonList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {

    companion object{

        const val BASE_URL = "https://pokeapi.co/api/v2/"
        const val PAGE_SIZE = 20

        const val IMAGE_URL = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/"
    }


    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): PokemonList

    @GET("pokemon/{name}")
    suspend fun getPokemonInfo(
        @Path("name") name: String
    ): Pokemon
}