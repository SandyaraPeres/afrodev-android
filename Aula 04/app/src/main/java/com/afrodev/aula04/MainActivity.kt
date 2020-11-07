package com.afrodev.aula04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.afrodev.aula04.model.Cliente
import com.afrodev.aula04.model.Carro

class MainActivity : AppCompatActivity() {

    //Inicialização lateinit
    //private lateinit var cliente1000: Cliente

    //Inicialização bylazy, inicialização segura
    //private val txtNomeUsuario by lazy {findViewById<TextView>(R.id.textAlgumacoisa)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Instanciando objetos com construtores primários
        val cliente1 = Cliente("Maria")
        val cliente2 = Cliente("Carlos", "123456789")
        val cliente3 = Cliente("Allison", "0000000000", "1178945612")

        val listaClientes = mutableListOf<Cliente>()
        listaClientes.add(cliente1)
        listaClientes.add(cliente2)
        listaClientes.add(cliente3)

        val nomeDoPrimeiroCliente = listaClientes[0].nome

        //Não é possível, formatarString é privado apenas para Cliente
        //txtView.text = cliente1.formatarString()

        //txtView.text = cliente1.exibirMensagemConfirmacaoCPF()

        val fusca = Carro(2, "", false,
            "Vermelho", "Volks", 4, 10.0,
            4)

        //O resultado exibido será "BI-BI-BIIIIIIIIIIIIII"
        fusca.buzinar()

    }

    override fun onBackPressed(){
        super.onBackPressed()

        //val dialog = Dialog("Você tem certeza que quer sair?")

    }
}