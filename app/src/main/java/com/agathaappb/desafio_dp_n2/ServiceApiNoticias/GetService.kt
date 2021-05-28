package com.agathaappb.desafio_dp_n2.ServiceApiNoticias

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GetService {
    @GET("/v2/everything?apiKey=c3e6193ce46c4a989ab72fff9f6824a4")
    fun getNoticia(@Query("q") q:String) :Call<GetModel>
}