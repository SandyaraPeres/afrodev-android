package com.afrodev.aula06

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import java.io.Serializable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Ciclo_De_Vida", "onCreate()")

        val btnProsseguir = findViewById<Button>(R.id.btnProsseguir)
        val btnCompartilhar = findViewById<Button>(R.id.btnCompartilhar)

        //Intent é uma mensagem entre componentes Android
        //Intents explícitas e implícitas

        //Intent explícita, eu sei qual ação/destino será feito
        val intentExplicita = Intent(this, MainActivity2::class.java).apply {
            putExtra("MENSAGEM", "Oi! Você acabou de me receber")
        }

        //Intent implícita
        //Intent para compartilhamento de um texto
        val intentImplicita = Intent().apply{
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, "Oi! Estou testando meu app Android! :)")
            type = "text/plain"
        }

        btnCompartilhar.setOnClickListener {
            //Intent para abrir o modal de compartilhamento
            //Apps disponíveis
            val intentParaCompartilhar = Intent.createChooser(
                intentImplicita,
                null
            )

            startActivity(intentParaCompartilhar)

        }

        btnProsseguir.setOnClickListener {
            startActivity(intentExplicita)
        }

        //Bundle = pacote
        //Pacote de informações a serem passadas em uma Intent
        val intentExemplo = Intent(this, MainActivity2::class.java)
        val bundleExemplo = Bundle()

        bundleExemplo.putString("ID1", "Sandyara")
        bundleExemplo.putBoolean("QUER_CAFE", true)
        bundleExemplo.putInt("IDADE", 20)
        intent.putExtras(bundleExemplo)

        //Passando objetos via Intent
        val intentObjeto = Intent(this, MainActivity2::class.java)

        val aluno = Aluno("Eduardo", "2345678")
        intentObjeto.putExtra("ALUNO", aluno)

        startActivity(intentObjeto)

    }

    override fun onStart() {
        super.onStart()
        Log.d("Ciclo_De_Vida", "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Ciclo_De_Vida", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Ciclo_De_Vida", "onPause()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ciclo_De_Vida", "onDestroy()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Ciclo_De_Vida", "onRestart()")
    }

}