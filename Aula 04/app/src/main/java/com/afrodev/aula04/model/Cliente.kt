package com.afrodev.aula04.model

//Construtor primário
class Cliente (val nome: String){

    //Encapsulamento: visibilidade de atributos e métodos,
    //Por padrão, sem declarar nada, apenas as variáveis, funções...
    //Ele é do tipo public
    var cpf : String? = null
    var telefone : String? = null

    //Construtor secundário
    constructor(nome: String, cpf: String){
        this.nome = nome
        this.cpf = cpf
    }

    //Construtor terciário
    constructor(nome: String, cpf: String, telefone: String){
        this.nome = nome
        this.cpf = cpf
        this.telefone = telefone
    }

    //Apenas a classe Cliente enxerga esse método!
    private fun formatarString() : String {
        return "Oi, $nome. Estamos ligando para o seu número" +
                "de telefone $telefone, para confirmar seu CPF.\n" +
                "Seu CPF é $cpf?"
    }

    fun exibirMensagemConfirmacaoCPF() : String{
        return formatarString()
    }
}

/*
*
* class Cliente(
    val nome : String,
    var cpf : String? = null
){
  fun exibirRelatorio() : String {
        return "O cliente $nome possui como número de CPF $cpf"
  }
}
*
* */

/*
* EM JAVA
* public class Cliente(){
*   public String nome;
*   public String cpf;
*
*   //Método construtor
*   public Cliente(String nome, String cpf){
*       this.nome = nome;
*       this.cpf = cpf;
*   }
*
*
*
*   //getter - get, pegar um dado, recuperar um atributo
*   public String getNome(){
*       return nome;
*   }
*
*   //setter
*   public void setNome(nomeInserido: String){
*       this.nome = nomeInserido;
*   }
*
* }
*
*
*
*
* */