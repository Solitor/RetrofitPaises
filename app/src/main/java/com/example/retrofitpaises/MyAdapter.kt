package com.example.retrofitpaises

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitpaises.classes.Pais

class MyAdapter(var con : Context, var list : ArrayList<Pais>?) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    inner class ViewHolder(v : View) : RecyclerView.ViewHolder(v)
    {
        var nome = v.findViewById<TextView>(R.id.nome_tv)
        var area = v.findViewById<TextView>(R.id.area_tv)
        var regiao = v.findViewById<TextView>(R.id.regiao_tv)
        var lingua = v.findViewById<TextView>(R.id.lingua_tv)
        var capital = v.findViewById<TextView>(R.id.capital_tv)
        var moeda = v.findViewById<TextView>(R.id.moeda_tv)
        var resumo = v.findViewById<TextView>(R.id.resumo_tv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(con).inflate(R.layout.list_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list!!.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nome.text = list!![position].nome.abreviado
        val auxArea = list!![position].area.total + " " + list!![position].area.unidade.símbolo
        holder.area.text = auxArea
        holder.regiao.text = list!![position].localizacao.regiao.nome
        holder.lingua.text = list!![position].linguas.first().nome.toString()
        holder.capital.text = list!![position].governo.capital.nome
        holder.moeda.text = list!![position].unidadesMonetarias.first().nome
        holder.resumo.text = list!![position].historico
    }

}