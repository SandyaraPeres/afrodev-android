package com.afrodev.aula07.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.afrodev.aula07.model.CEP
import com.afrodev.aula07.repository.CEPRepository

class MainActivityViewModel(
    private val cepRepository: CEPRepository = CEPRepository()
) : ViewModel() {

    private lateinit var mutableLiveData : MutableLiveData<CEP>

    fun buscarCEP(cepInserido: String) : MutableLiveData<CEP> {
        if(mutableLiveData == null){
            mutableLiveData = cepRepository.buscarCEP(cepInserido)
        }

        return mutableLiveData
    }
}