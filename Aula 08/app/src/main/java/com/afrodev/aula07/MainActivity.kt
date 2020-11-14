package com.afrodev.aula07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val campoCEP = findViewById<EditText>(R.id.edtCEP)
        val pesquisarCEP = findViewById<Button>(R.id.btnCEP)
        val resultadoCEP = findViewById<TextView>(R.id.txtRetornoCEP)

        pesquisarCEP.setOnClickListener {
            val cep = campoCEP.text.toString()
            resultadoCEP.visibility = View.VISIBLE
            resultadoCEP.text = buscarCEP(cep)
        }
    }

    fun buscarCEP(cepInserido: String) : String{
        //Criando o serviço do Retrofit
        val retrofitClient = NetworkUtils.RetrofitConfig("https://viacep.com.br/ws/")

        //Serviços da API que irei consumir, aonde irei checar
        val endpoint = retrofitClient.create(CEPService::class.java)

        //Irá realizar a chamada e esperar um retorno
        val callback = endpoint.buscarCep(cepInserido)

        var mensagemRetorno = ""

        callback.enqueue(
            object : Callback<CEP> {
                override fun onResponse(call: Call<CEP>, response: Response<CEP>) {
                    //Caso seja um sucesso, pegarei a resposta! (response)
                    response.body()?.toString()?.let {
                        //Atribuo a variavel de mensagemRetorno, o resultado do método toString da classe CEP
                        mensagemRetorno = it
                    }
                }

                override fun onFailure(call: Call<CEP>, t: Throwable) {
                    //Caso tenha acontecido durante a requisição, o que deve acontecer?
                    mensagemRetorno = "Houve um erro na solicitação! Tente novamente."
                }

            }
        )

        return mensagemRetorno

    }
}