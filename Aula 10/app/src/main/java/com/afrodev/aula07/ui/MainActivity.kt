package com.afrodev.aula07.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.Observer
import com.afrodev.aula07.model.CEP
import com.afrodev.aula07.R

class MainActivity : AppCompatActivity() {

    private val viewModel = MainActivityViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val campoCEP = findViewById<EditText>(R.id.edtCEP)
        val pesquisarCEP = findViewById<Button>(R.id.btnCEP)

        pesquisarCEP.setOnClickListener {
            val cep = campoCEP.text.toString()
            buscarCEP(cep)
        }
    }

    fun buscarCEP(cepInserido: String){
        viewModel.buscarCEP(cepInserido).observe(this,
        object : Observer<CEP> {
            override fun onChanged(cep: CEP?) {
                cep?.let{
                    val resultadoCEP = findViewById<TextView>(R.id.txtRetornoCEP)
                    resultadoCEP.visibility = View.VISIBLE
                    resultadoCEP.text = cep.toString()
                }
            }
        })
    }
}