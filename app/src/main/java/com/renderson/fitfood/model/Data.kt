package com.renderson.fitfood.model

import com.google.gson.annotations.SerializedName

data class Data(
    val category: List<Category>
)

data class Category(
    val title: String,
    val games: List<Games>
)

data class Games(
    @SerializedName("artworkUrl100") val icon: String,
    @SerializedName("name") val title: String,
    @SerializedName("artistName") val subtitle: String
)