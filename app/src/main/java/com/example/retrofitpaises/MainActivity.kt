package com.example.retrofitpaises

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitpaises.classes.Pais
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView : RecyclerView
    lateinit var myAdapter: MyAdapter

    val base_url = "https://servicodados.ibge.gov.br/api/v1/paises/[]/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this)

        getAllData()
    }

    private fun getAllData() {
        var retrofit = Retrofit.Builder()
            .baseUrl(base_url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)

        var retroData = retrofit.getData()

        retroData.enqueue(object : Callback<ArrayList<Pais>> {
            override fun onResponse(
                call: Call<ArrayList<Pais>>,
                response: Response<ArrayList<Pais>>
            ) {

                var data = response.body()!!

                myAdapter = MyAdapter(baseContext,data)

                recyclerView.adapter = myAdapter

                Log.d("data",data.toString())
            }

            override fun onFailure(call: Call<ArrayList<Pais>>, t: Throwable) {

            }

        })
    }


}