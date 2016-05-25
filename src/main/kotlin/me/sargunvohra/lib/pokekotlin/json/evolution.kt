package me.sargunvohra.lib.pokekotlin.json

import com.squareup.moshi.Json

data class EvolutionChain(
        val id: Int,
        @Json(name = "baby_trigger_item")
        val babyTriggerItem: NamedApiResource<Item>?,
        val chain: ChainLink
)

data class ChainLink(
        @Json(name = "is_baby")
        val isBaby: Boolean,
        val species: NamedApiResource<PokemonSpecies>,
        @Json(name = "evolution_details")
        val evolutionDetails: List<EvolutionDetail>,
        @Json(name = "evolves_to")
        val evolvesTo: List<ChainLink>
)

data class EvolutionDetail(
        val trigger: NamedApiResource<EvolutionTrigger>,
        val item: NamedApiResource<Item>? = null,
        val gender: Int? = null,
        @Json(name = "held_item")
        val heldItem: NamedApiResource<Item>? = null,
        @Json(name = "known_move")
        val knownMove: NamedApiResource<Move>? = null,
        @Json(name = "known_move_type")
        val knownMoveType: NamedApiResource<Move>? = null,
        val location: NamedApiResource<Location>? = null,
        @Json(name = "min_level")
        val minLevel: Int? = null,
        @Json(name = "min_happiness")
        val minHappiness: Int? = null,
        @Json(name = "min_beauty")
        val minBeauty: Int? = null,
        @Json(name = "min_affection")
        val minAffection: Int? = null,
        @Json(name = "party_species")
        val partySpecies: NamedApiResource<PokemonSpecies>? = null, // TODO
        @Json(name = "party_type")
        val partyType: NamedApiResource<Type>? = null,
        @Json(name = "relative_physical_stats")
        val relativePhysicalStats: Int? = null,
        @Json(name = "time_of_day")
        val timeOfDay: String = "",
        @Json(name = "trade_species")
        val tradeSpecies: NamedApiResource<PokemonSpecies>? = null, // TODO
        @Json(name = "needs_overworld_rain")
        val needsOverworldRain: Boolean = false,
        @Json(name = "turn_upside_down")
        val turnUpsideDown: Boolean = false
)

data class EvolutionTrigger(
        val id: Int,
        val name: String,
        val names: List<Name>,
        @Json(name = "pokemon_species")
        val pokemonSpecies: List<NamedApiResource<PokemonSpecies>>
)