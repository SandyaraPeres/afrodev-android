package com.afrodev.aula05

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_lista.view.*

//Responsável por vincular os dados (dataset) ao meu item (layout)
class DigimonAdapter(
    private val dataset: ArrayList<Digimon>
) : RecyclerView.Adapter<DigimonAdapter.DigimonViewHolder>() {

    //Classe de ViewHolder
    //Responsável por referenciar os ids dos componentes
    //Do layout item que criamos
    class DigimonViewHolder(val itemDigimon : View) : RecyclerView.ViewHolder(itemDigimon)

    //Método responsável por inflar/mostrar/visualizar o layout/xml do item que criamos
    //Retornando o ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DigimonViewHolder {
        val cardview = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_lista, parent, false) as CardView

        return DigimonViewHolder(cardview)
    }

    //Vincula os dados aos componentes no meu item
    override fun onBindViewHolder(holder: DigimonViewHolder, position: Int) {

        /*  val nomeDigimon = holder.itemDigimon.findViewById<TextView>(R.id.nomeDigimon)
        val tipoDigimon = holder.itemDigimon.findViewById<TextView>(R.id.tipoDigimon)

        nomeDigimon.text = dataset[position].tipo
        tipoDigimon.text = dataset[position].tipo */

        holder.itemDigimon.apply {
            nomeDigimon.text = dataset[position].nome
            tipoDigimon.text = dataset[position].tipo
        }
    }

    //Devolve a quantidade de itens no meu dataset
    override fun getItemCount(): Int {
        return dataset.size
    }

}