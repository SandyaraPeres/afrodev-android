package com.afrodev.aula07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.viewpager.widget.ViewPager
import com.afrodev.aula07.fragments.PrimeiraFragment
import com.afrodev.aula07.fragments.SegundaFragment
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Referenciando as views
        val abas = findViewById<TabLayout>(R.id.abas)
        val nossaViewPager = findViewById<ViewPager>(R.id.viewpager)

        //Instanciamos o adapter e inserimos as fragments que queremos
        // exibir e seus títulos (abas)

        val adapter = AbasAdapter(supportFragmentManager)
        adapter.add(PrimeiraFragment(), "Primeira")
        adapter.add(SegundaFragment(), "Segunda")

        //Vinculamos o adapter criado ao adapter da ViewPager
        nossaViewPager.adapter = adapter

        //Vinculamos a ViewPager ao nosso TabLayout
        abas.setupWithViewPager(nossaViewPager)
    }
}