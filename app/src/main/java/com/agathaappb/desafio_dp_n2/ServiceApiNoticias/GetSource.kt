package com.agathaappb.desafio_dp_n2.ServiceApiNoticias

import com.google.gson.annotations.SerializedName

data class GetSource(
        @SerializedName("name")
        val name: String
){

}
