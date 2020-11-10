package com.afrodev.aula06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //getIntent()
        val intentRecebida = intent.getStringExtra("MESSAGE")

        intentRecebida?.let{
            Toast.makeText(this, intentRecebida, Toast.LENGTH_SHORT)
        }

        //recebendo um Bundle
        val recebendoIntentBundle = intent.extras?.getBundle("QUER_CAFÉ")

        //recebendo o objeto
        //lembrar de utilizar o cast = conversão
        //Aluno intentoObjetoRecebido = (Aluno) getIntent().getSerializableExtra("ALUNO")
        //Lembre-se que, se não vier intent nenhuma, o getSerializableExtra virá como nulo
        //Logo, como transformo nulo em um aluno? Impossível. O app dará erro.
        //Para isso, informo que o tipo de cast/retorno poderá também ser nulo além de Aluno
        val intentObjetoRecebido = intent.getSerializableExtra("ALUNO") as Aluno?

        intentObjetoRecebido?.let{
            val informacoesAluno = intentObjetoRecebido.getInfo()
        }

    }
}