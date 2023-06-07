package com.example.retrofitpaises.classes


import com.google.gson.annotations.SerializedName

data class Regiao(
    @SerializedName("id")
    val id: IdXX,
    @SerializedName("nome")
    val nome: String
)