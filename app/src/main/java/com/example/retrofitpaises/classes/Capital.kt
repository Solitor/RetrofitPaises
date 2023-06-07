package com.example.retrofitpaises.classes


import com.google.gson.annotations.SerializedName

data class Capital(
    @SerializedName("nome")
    val nome: String
)