package com.afrodev.aula07

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkUtils {

    //Equivalente ao static no Java
    companion object{
        fun RetrofitConfig(path: String) : Retrofit {
            return Retrofit.Builder()
                .baseUrl(path)
                    //"fábrica" de serialização e desserialização de JSON, é o cara que vai manipular o JSON
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}