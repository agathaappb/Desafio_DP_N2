package com.agathaappb.desafio_dp_n2.View

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.agathaappb.desafio_dp_n2.R
import com.agathaappb.desafio_dp_n2.ServiceApiNoticias.GetArticles
import com.agathaappb.desafio_dp_n2.ServiceApiNoticias.GetModel

class NoticiasAdapter(private val getModel: List<GetArticles>): RecyclerView.Adapter<NoticiasAdapter.NoticiasViewHolder>(){
    inner class NoticiasViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val noticiaTextView: TextView = itemView.findViewById(R.id.txt_descricao)
        val imagemView :ImageView = itemView.findViewById(R.id.img_destaque)
        val autorTextView : TextView = itemView.findViewById(R.id.txt_autor)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoticiasViewHolder {
        val cardView = LayoutInflater.from(parent.context).inflate(R.layout.layout_noticias,parent,false)
        return NoticiasViewHolder(cardView)
    }

    override fun onBindViewHolder(holder: NoticiasViewHolder, position: Int) {
        val itemPosition = getModel.get(position)
            holder.noticiaTextView.text = itemPosition.description
            holder.autorTextView.text = itemPosition.author
    }

    override fun getItemCount(): Int {
        return getModel.size
    }

}