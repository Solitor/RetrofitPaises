package com.example.retrofitpaises.classes


import com.google.gson.annotations.SerializedName

data class IdX(
    @SerializedName("ISO-639-1")
    val iSO6391: String,
    @SerializedName("ISO-639-2")
    val iSO6392: String
)