package com.example.retrofitpaises.classes


import com.google.gson.annotations.SerializedName

data class Area(
    @SerializedName("total")
    val total: String,
    @SerializedName("unidade")
    val unidade: Unidade
)