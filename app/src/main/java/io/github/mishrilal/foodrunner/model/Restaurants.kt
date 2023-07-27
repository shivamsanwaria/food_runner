package io.github.mishrilal.foodrunner.model

data class Restaurants(
    val id: Int,
    val name: String,
    val rating: String,
    val costForOne: Int,
    val imageUrl: String
)