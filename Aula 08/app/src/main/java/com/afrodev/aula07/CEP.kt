package com.afrodev.aula07

import com.google.gson.annotations.SerializedName

class CEP(
    //O que vem no meu JSON - como vou tratar no meu código
    @SerializedName("logradouro")
    val rua: String,
    @SerializedName("complemento")
    val complemento: String,
    @SerializedName("bairro")
    val bairro: String,
    @SerializedName("localidade")
    val cidade: String,
    @SerializedName("estado")
    val uf: String
) {
    override fun toString(): String {
        return "$rua $complemento $bairro $cidade $uf"
    }
}