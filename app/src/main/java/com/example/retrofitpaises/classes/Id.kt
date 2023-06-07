package com.example.retrofitpaises.classes


import com.google.gson.annotations.SerializedName

data class Id(
    @SerializedName("ISO-3166-1-ALPHA-2")
    val iSO31661ALPHA2: String,
    @SerializedName("ISO-3166-1-ALPHA-3")
    val iSO31661ALPHA3: String,
    @SerializedName("M49")
    val m49: Int
)