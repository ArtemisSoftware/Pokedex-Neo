package com.artemissoftware.pokedexneo.api.models

data class HeldItem(
    val item: Item,
    val version_details: List<VersionDetail>
)