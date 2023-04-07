package com.example.latihan3chapter4

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FilmViewModel : ViewModel() {
    val list = arrayListOf(
        DataFilm("John Wick", "12 Maret 2023", R.drawable.johnwick),
        DataFilm("Avatar", "12 September 2022", R.drawable.avatar),
        DataFilm("Avengers End-Game", "12 Desember 2020", R.drawable.avengers),
        DataFilm("Dilan 1990", "25 Januari 2018", R.drawable.dilan),
        DataFilm("Warkop Dki Reborn", "12 September 2019", R.drawable.warkop)
    )
    val listFilm : MutableLiveData<List<DataFilm>> = MutableLiveData()

    fun getListFilm(){
        val film = list
        listFilm.value = film
    }
}