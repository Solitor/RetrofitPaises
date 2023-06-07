package com.example.retrofitpaises.classes


import com.google.gson.annotations.SerializedName

data class Lingua(
    @SerializedName("id")
    val id: IdX,
    @SerializedName("nome")
    val nome: String?
)