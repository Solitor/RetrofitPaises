package com.example.retrofitpaises.classes


import com.google.gson.annotations.SerializedName

data class Governo(
    @SerializedName("capital")
    val capital: Capital
)