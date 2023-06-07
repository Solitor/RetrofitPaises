package com.example.retrofitpaises.classes


import com.google.gson.annotations.SerializedName

data class Nome(
    @SerializedName("abreviado")
    val abreviado: String,
    @SerializedName("abreviado-EN")
    val abreviadoEN: String,
    @SerializedName("abreviado-ES")
    val abreviadoES: String
)