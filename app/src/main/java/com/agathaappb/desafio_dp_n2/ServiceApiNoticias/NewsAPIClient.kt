package com.agathaappb.desafio_dp_n2.ServiceApiNoticias

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NewsAPIClient private constructor(){

    companion object{
        private lateinit var retrofit: Retrofit
        private var urlBase = "https://newsapi.org"

        private fun getRetrofitInstance(): Retrofit{
            val httpClient = OkHttpClient.Builder()
            if(!::retrofit.isInitialized){
                retrofit = Retrofit.Builder()
                    .baseUrl(urlBase)
                    .client(httpClient.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit
        }
        fun <T>createService(serviceClass: Class<T>):T{
            return getRetrofitInstance().create(serviceClass)
        }

    }
}