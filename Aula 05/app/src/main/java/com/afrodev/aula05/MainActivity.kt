package com.afrodev.aula05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Implementando uma RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.rvLista)

        //Dados a serem populados na lista
        val dataset = mutableListOf<Digimon>()
        dataset.add(Digimon("Gabumon", "Réptil"))
        dataset.add(Digimon("Agumon", "Dinossauro"))
        dataset.add(Digimon("Betamon", "Anfíbio"))

        //val jogoPokemon = JogosPokemon.GOLD.jogo

        //Linkando a recyclerview ao adapter
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = DigimonAdapter(dataset as ArrayList)

    }
}