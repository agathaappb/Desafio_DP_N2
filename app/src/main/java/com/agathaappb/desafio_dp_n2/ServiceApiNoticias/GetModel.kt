package com.agathaappb.desafio_dp_n2.ServiceApiNoticias

import com.google.gson.annotations.SerializedName

data class GetModel(
    @SerializedName("articles")
    val articles: List<GetArticles>
) {
}