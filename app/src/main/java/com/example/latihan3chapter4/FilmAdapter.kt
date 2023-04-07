package com.example.latihan3chapter4

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FilmAdapter( var listFilm : ArrayList<DataFilm>): RecyclerView.Adapter<FilmAdapter.ViewHolder>(){


    class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        var film = itemView.findViewById<TextView>(R.id.filmName)
        var tglRilis = itemView.findViewById<TextView>(R.id.tglRilis)
        var filmImg = itemView.findViewById<ImageView>(R.id.filmImg)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_film, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: FilmAdapter.ViewHolder, position: Int) {
        var data = listFilm[position]
        holder.film.text = data.filmName
        holder.tglRilis.text = data.tgRilis
        holder.filmImg.setImageResource(data.imgFilm)
    }

    override fun getItemCount(): Int {
        return listFilm.size
    }

    fun setFilmData(listStudent: ArrayList<DataFilm>)
    {
        this.listFilm=listStudent
//        notifyDataSetChanged()
    }
}