package com.afrodev.aula07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.afrodev.aula07.fragments.PrimeiraFragment
import com.afrodev.aula07.fragments.SegundaFragment

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val botaoProximo = findViewById<Button>(R.id.proximaFragment)
        val fm = supportFragmentManager

        botaoProximo.setOnClickListener {
            val ft = fm.beginTransaction()

            //Adicionar uma fragment
            ft.add(R.id.fragmentContainer, PrimeiraFragment())

            //Substituir uma fragment
            ft.replace(R.id.fragmentContainer, SegundaFragment())

            //Remover uma fragment
            val fragment = fm.findFragmentById(R.id.fragmentContainer)
            fragment?.let{
                ft.remove(fragment)
                ft.commit()
            }
        }
    }
}