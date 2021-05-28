package com.agathaappb.desafio_dp_n2

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.agathaappb.desafio_dp_n2.ServiceApiNoticias.GetService

class MenuNoticias : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_noticias)

        val btn_tecnologia : Button = findViewById(R.id.btn_tecnologia)
        val btn_mobile : Button = findViewById(R.id.btn_mobile)
        val btn_games : Button = findViewById(R.id.btn_games)
        val btn_saude : Button = findViewById(R.id.btn_saude)




        btn_tecnologia.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }

}

