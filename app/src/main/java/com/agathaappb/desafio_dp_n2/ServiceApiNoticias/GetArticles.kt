package com.agathaappb.desafio_dp_n2.ServiceApiNoticias

import com.google.gson.annotations.SerializedName

data class GetArticles(
        @SerializedName("source")
        val source: GetSource,
        @SerializedName("author")
        val author: String,
        @SerializedName("title")
        val title: String,
        @SerializedName("description")
        val description: String,
        @SerializedName("url")
        val url: String,
        @SerializedName("urlToImage")
        val urlToImage: String
){

}
