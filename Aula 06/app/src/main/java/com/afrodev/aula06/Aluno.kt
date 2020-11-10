package com.afrodev.aula06

import java.io.Serializable

class Aluno (val nome : String,
    val matricula: String) : Serializable{

    fun getInfo() : String{
        return "Aluno: $nome de matrícula $matricula ."
    }
}