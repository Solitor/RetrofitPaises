package com.example.retrofitpaises.classes


import com.google.gson.annotations.SerializedName

data class Pais(
    @SerializedName("area")
    val area: Area,
    @SerializedName("governo")
    val governo: Governo,
    @SerializedName("historico")
    val historico: String,
    @SerializedName("id")
    val id: Id,
    @SerializedName("linguas")
    val linguas: List<Lingua>,
    @SerializedName("localizacao")
    val localizacao: Localizacao,
    @SerializedName("nome")
    val nome: Nome,
    @SerializedName("unidades-monetarias")
    val unidadesMonetarias: List<UnidadesMonetaria>
)