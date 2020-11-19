package com.afrodev.aula07.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.afrodev.aula07.model.CEP
import com.afrodev.aula07.utils.NetworkUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CEPRepository {
    fun buscarCEP(cepInserido: String) : MutableLiveData<CEP> {

        val mutableLiveData = MutableLiveData<CEP>()

        val retrofitClient = NetworkUtils.RetrofitConfig("https://viacep.com.br/ws/")
        val endpoint = retrofitClient.create(CEPService::class.java)
        val callback = endpoint.buscarCep(cepInserido)

        callback.enqueue(
            object : Callback<CEP> {
                override fun onResponse(call: Call<CEP>, response: Response<CEP>) {
                    if(response.isSuccessful && response.body() != null){
                        mutableLiveData.value = response.body()
                    }
                }

                override fun onFailure(call: Call<CEP>, t: Throwable) {
                    Log.d("Erro!", "Deu ruim, mané!")
                }

            }
        )

        return mutableLiveData

    }
}