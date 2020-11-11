package com.afrodev.aula07

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class AbasAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val fragments = mutableListOf<Fragment>()
    private val titulosAbas = mutableListOf<String>()

    fun add(fragment: Fragment, tituloAba: String){
            fragments.add(fragment)
            titulosAbas.add(tituloAba)
    }

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    fun getTitle(position: Int): String{
        return titulosAbas[position]
    }
}