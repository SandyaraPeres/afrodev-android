package com.afrodev.aula_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Criar uma aplicação que ao inserir seu nome e apertar em um botão,
        //É exibida uma mensagem de "Boas vindas, [nome do usuário]

        //Tipos de variáveis
        //String: texto
        //Char: caracteres
        //Int: inteiros ex. 4
        //Bool/Boolean: booleanos (0/1, verdadeiro/falso)
        //Float: pontos flutuantes / quebrados 4.5555555553
        //Double: número inteiro porém quebrados ex. 4.50
        //Saber mais: Kotlin Basic Synthax

        //Inicialização de variáveis
        //1. var: O conteúdo pode ser alterado/subscrito sempre
        //2. val: Uma vez que o conteúdo é inserido, não pode ser mais alterado
        //3. const: O inicial valor não é alterado

        val campoNomeUsuario = findViewById<EditText>(R.id.edtNomeUsuario)
        val botaoExibirMensagem = findViewById<Button>(R.id.btnExibirMensagem)
        val textoMensagemExibida = findViewById<TextView>(R.id.txtResultado)
        
        botaoExibirMensagem.setOnClickListener{
            //PARTE 1
            //val nomeUsuario = campoNomeUsuario.text.toString()
            //E se nomeUsuario não tiver conteúdo?
            //Vamos tratar null-safety!
            //No Java a gente tinha muito problema com dados nulos
            //null-safety: ? !! let

            //nomeUsuario?.let{
            //    textoMensagemExibida.text = "Boas vindas, $nomeUsuario"
            //}

            //PARTE 2
            //Calcular a soma de dois números inteiros
            val resultado = calcularSoma(10, 10)

            resultado?.let{
                textoMensagemExibida.text = "Resultado da soma: $resultado"
            }

        }
    }

    //Parâmetros A pode receber Inteiro ou Nulo
    fun calcularSoma(a: Int?, b: Int) : Int? {
        return if(a == null){
            a + b
        } else {
            null
        }
    }

}