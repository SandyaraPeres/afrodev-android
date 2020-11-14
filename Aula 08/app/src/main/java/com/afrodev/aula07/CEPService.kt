package com.afrodev.aula07

import retrofit2.Call
import retrofit2.http.*

interface CEPService {
    //Checar colinha de serviços HTTP
    //o GET será na baseURL (NetworkUtils) + caminho/path que deve ser percorrido
    //o retorno sempre será uma Call (do retrofit, pois é uma CHAMADA)
    @GET("{cep}/json/")
    fun buscarCep(
        @Path("cep")
        cep: String) : Call<CEP>

    /*
    @POST
    fun enviarCEP()

    @PUT
    fun atualizarCEP()

    @DELETE
    fun removerCEP()
    */

}