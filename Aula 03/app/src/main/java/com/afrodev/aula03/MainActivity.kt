package com.afrodev.aula03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Estruturas de decisão ou condicionais: trabalhe sempre com condições
        //Se tenho algo, acontece [x], senão acontece [y]
        //Estruturas if, if-else, if-else if.

        //Operadores relacionais
        //> >= < <= == !=
        //idade > 18 = SE idade FOR MAIOR QUE 18
        //idade >= 18 = SE idade for MAIOR OU IGUAL QUE 18
        val idade = 20
        if(idade >= 18){
            println("Você está apto para voto! Se você não comparecer dia 15, vai pagar multa hein!")
        } else if(idade >= 16) {
            println("Você pode votar mas não é obrigatório, pode relaxar se quiser!")
        } else {
            println("Você não pode votar")
        }

        //Estrutura when, similar a estrutura Switch Case em Java, C, C#...
        val diaSemana = 6

        /*
        *
        * if(diaSemana == 1){
        *
        * } else if (diaSemana == 2) {
        *
        * }
        * ...
        * else{
        *
        * }
        *
        * O bloco de código acima não está errado! Porém...
        * Podemos melhorá-lo utilizando a estrutura when que é equivalente
        *
        * */
        when(diaSemana){
            // -> (Ação que será realizada)
            1 -> println("Domingo")
            2 -> println("Segunda")
            3 -> println("Terça")
            4 -> println("Quarta")
            5 -> println("Quinta")
            6 -> println("Sexta")
            7 -> println("Sábado")
            else -> println("Insira um dia da semana válido, campeão!")
        }

        val numero = 30
        when(numero){
            //Quando (numero) estiver entre (in) 0 a 9, faça:
            in 0..9 -> {
                println("Unidade")
            }
            in 10..99 -> {
                println("Dezena")
            }
            in 100..999 -> {
                println("Centena")
            }
            else -> println("Esse programa só aceita valores: positivos e até 999")
        }

        // == : (valor) é igual a (ao que quero comparar)
        // Ex.: Uma variável Int? = null e uma variável float? = null são iguais utilizando o ==
        // === : (valor) e o (tipo) é igual a (ao que quero comparar)
        // Ex.: Uma variável Int? = null e uma variável float? = null são diferentes utilizando o ===

        // != : (valor) é diferente a (ao que quero comparar)
        // !== : (valor) e o (tipo) é diferente a (ao que quero comparar)

        //isNullOrEmpty(), isEmpty()...
        if(idade.isNullOrEmpty()) {
            //Faça alguma coisa
        } else {
            println("Valores nulos não são permitidos!")
        }

        //Collections ou coleções
        //Coleções de dados, listas, listas de chave-valor e assim por diante...
        //É similar ao array/vetor, a matrizes...
        //Aqui aprenderemos maps ("matrizes") e lists ("arrays")

        //val alunosOnline = listOf<String>("Marisa", "Vanessa", "Hugo", "Magno")
        //val credenciaisAlunos = mutableMapOf<String, Int>("Marisa" to 1, "Vanessa" to 2, "Hugo" to 3)
        val alunosOnline = listOf("Marisa", "Vanessa", "Hugo", "Magno")
        val credenciaisAlunos = mapOf("Marisa" to "FGH1", "Vanessa" to "ZAQ2", "Hugo" to "ABC3")

        //val listaAlunos : mutableListOf<String> = mutableListOf()
        val listaAlunos = mutableListOf<String>()
        val mapASerPopulado = mutableMapOf<String, Int>()

        //=========================================================

        //Estruturas de repetição, loops

        //Em Java...
        //Começando em 1, enquanto i for menor ou igual a 10, incremente-o e faça...
        //for(int i = 1; i <= 10; i+=2){
        //      System.out.println(i)
        // }

        //Contador incrementando 1 até 90
        val numeroRepeticoes = 90
        for(i in 0..numeroRepeticoes)
            println(i)

        //Contador decrementando 1
        for(i in 10 downTo 0)
            println(i)

        //Continue: pula o laço de repetição atual
        for(i in 0..10){
            if(i%2 == 0){
                continue
            } else {
                println("$i é um número ímpar.")
            }
        }

        //Continue: pula o laço de repetição atual
        for(i in 0..90){
            if(i == 50){
                break
            }
        }

        //Listas mutáveis
        for(aluno in alunosOnline){
            println(aluno)
        }

        //Listas mutáveis
        for(i in 0..9){
            listaAlunos.add("Item adicionado")
        }


        //Adicionado todos os itens da lista 2 na lista 1
        val lista1 = mutableListOf<String>()
        val lista2 = listOf("Marisa", "Hugo", "Robert", "Pedro")

        lista1.addAll(lista2)

        //Maps mutáveis
        for(i in 1..10){
            mapASerPopulado.add("Item adicionado", i)
        }

        //Visualizando cada aluno dentro de uma lista, o aluno é equivalente ao i
        for(aluno in listaAlunos){
            println(aluno)
        }

        //Estrutura while
        val i = 0
        while(i < 10){
            println(i)
            i++
        }

        //Estrutura do-while
        val seDeveFinalizar = false
        do{
            println("...")
            println("Gostaria de tentar novamente?")
            if(!entrada de código.isEquals("Não"))
            {
                seDeveFinalizar = true
            }
        } while(!seDeveFinalizar)

    }

}