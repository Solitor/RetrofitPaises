package com.example.retrofitpaises.classes


import com.google.gson.annotations.SerializedName

data class Unidade(
    @SerializedName("multiplicador")
    val multiplicador: Int,
    @SerializedName("nome")
    val nome: String,
    @SerializedName("símbolo")
    val símbolo: String
)