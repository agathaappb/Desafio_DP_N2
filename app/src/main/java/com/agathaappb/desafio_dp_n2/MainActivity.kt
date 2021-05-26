package com.agathaappb.desafio_dp_n2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ProgressBar
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.agathaappb.desafio_dp_n2.ServiceApiNoticias.GetModel
import com.agathaappb.desafio_dp_n2.ServiceApiNoticias.GetService
import com.agathaappb.desafio_dp_n2.ServiceApiNoticias.NewsAPIClient
import com.agathaappb.desafio_dp_n2.View.NoticiasAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progress: ProgressBar = findViewById(R.id.progressBar)
        progress.visibility = View.VISIBLE

        val service = NewsAPIClient.createService(GetService::class.java)
        val liveData = MutableLiveData<GetModel>()
        val call: Call<GetModel> = service.getNoticia()

        call.enqueue(object : Callback<GetModel> {
            override fun onFailure(call: Call<GetModel>, t: Throwable) {
                val resposta = t.message
            }

            override fun onResponse(call: Call<GetModel>, response: Response<GetModel>) {

                val resp = response.body()
                liveData.value = resp
                val progress: ProgressBar = findViewById(R.id.progressBar)

                val noticias = findViewById<View>(R.id.recyclerView) as RecyclerView
                val adapter = liveData.value?.let { it1 -> NoticiasAdapter(it1.articles) }
                noticias.adapter = adapter
                noticias.layoutManager = LinearLayoutManager(this@MainActivity)

                progress.visibility = View.GONE


            }

        })




    }


}

