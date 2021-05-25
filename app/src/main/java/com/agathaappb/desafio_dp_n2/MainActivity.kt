package com.agathaappb.desafio_dp_n2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import com.agathaappb.desafio_dp_n2.ServiceApiNoticias.GetModel
import com.agathaappb.desafio_dp_n2.ServiceApiNoticias.GetService
import com.agathaappb.desafio_dp_n2.ServiceApiNoticias.NewsAPIClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNoticias:Button = findViewById(R.id.btnBuscarNoticias)
        val txtNoticias: TextView = findViewById(R.id.txtNoticias)

        btnNoticias.setOnClickListener {


            val service = NewsAPIClient.createService(GetService::class.java)
            val liveData = MutableLiveData<GetModel>()
            val call : Call<GetModel> = service.getNoticia()

            call.enqueue(object:Callback<GetModel>
            {
                override fun onResponse(
                        call: Call<GetModel>,
                        response: Response<GetModel>
                ) {
                    val resp = response.body()

                }

                override fun onFailure(call: Call<GetModel>, t: Throwable) {
                    val resposta = t.message
                }
            })
        }


    }



}