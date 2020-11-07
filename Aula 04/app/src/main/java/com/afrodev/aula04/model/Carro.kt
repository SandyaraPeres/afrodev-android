package com.afrodev.aula04.model

class Carro : Automovel{

    private val qtdPortas: Int
    private val chassi: String
    private val seAirBagFunciona: Boolean

    constructor(qtdPortas: Int,
                chassi: String,
                seAirBagFunciona: Boolean,
                cor: String,
                fabricante: String,
                qtdRodas : Int,
                capacidadeTanque : Double,
                lugares:Int
                ){
        this.qtdPortas = qtdPortas
        this.chassi = chassi
        this.seAirBagFunciona = seAirBagFunciona
        super(cor, fabricante, qtdRodas, capacidadeTanque, lugares)
    }
}