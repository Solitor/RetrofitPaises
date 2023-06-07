package com.example.retrofitpaises.classes


import com.google.gson.annotations.SerializedName

data class Localizacao(
    @SerializedName("regiao")
    val regiao: Regiao,
    @SerializedName("regiao-intermediaria")
    val regiaoIntermediaria: RegiaoIntermediaria?,
    @SerializedName("sub-regiao")
    val subRegiao: SubRegiao
)