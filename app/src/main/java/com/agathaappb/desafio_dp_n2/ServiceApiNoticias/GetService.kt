package com.agathaappb.desafio_dp_n2.ServiceApiNoticias

import retrofit2.Call
import retrofit2.http.GET

interface GetService {
    @GET("/v2/everything?apiKey=c3e6193ce46c4a989ab72fff9f6824a4&q=tecnologia")
    fun getNoticia() :Call<GetModel>
}