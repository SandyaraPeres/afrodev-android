package com.afrodev.aula04.model

open class Automovel(
    val cor: String,
    val motor: String,
    val fabricante: String,
    val qtdRodas: Int,
    val capacidadeTanque: Double,
    val lugares: Int
){
    //Encapsulamento protected
    //Apenas a classe mãe e suas filhas tem visibilidade desse método
    protected fun buzinar() : String{
        return "Bi-bi-bi!"
    }
}