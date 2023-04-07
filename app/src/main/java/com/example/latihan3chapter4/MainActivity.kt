package com.example.latihan3chapter4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.latihan3chapter4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var rvFilm : RecyclerView
    private lateinit var filmAdapter: FilmAdapter
    private lateinit var filmViewModel : FilmViewModel

    override fun onCreate(savedIstanceState: Bundle?){
        super.onCreate(savedIstanceState)
        setContentView(R.layout.activity_main)

        initFilm()

        filmViewModel = ViewModelProvider(this).get(FilmViewModel::class.java)

        filmViewModel.getListFilm()
        filmViewModel.listFilm.observe(this, Observer {
            filmAdapter.setFilmData(it as ArrayList<DataFilm>)})
    }
    fun initFilm(){
        rvFilm = findViewById(R.id.rvFilm)
        filmAdapter = FilmAdapter(ArrayList())
        rvFilm.layoutManager = GridLayoutManager (this, 2)
        rvFilm.adapter = filmAdapter
    }
    fun setDataFilm(){

    }
    }