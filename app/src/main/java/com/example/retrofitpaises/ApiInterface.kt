package com.example.retrofitpaises

import com.example.retrofitpaises.classes.Pais
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("/")
    fun getData() : Call<ArrayList<Pais>>

}

