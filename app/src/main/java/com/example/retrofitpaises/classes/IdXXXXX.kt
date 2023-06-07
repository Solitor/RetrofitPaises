package com.example.retrofitpaises.classes


import com.google.gson.annotations.SerializedName

data class IdXXXXX(
    @SerializedName("ISO-4217-ALPHA")
    val iSO4217ALPHA: String,
    @SerializedName("ISO-4217-NUMERICO")
    val iSO4217NUMERICO: String
)