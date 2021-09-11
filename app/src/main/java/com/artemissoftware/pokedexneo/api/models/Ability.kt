package com.artemissoftware.pokedexneo.api.models

data class Ability(
    val ability: AbilityX,
    val is_hidden: Boolean,
    val slot: Int
)