package com.example.recyclerv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WisataAdapter(private val wisataList:ArrayList<Wisata>) :
    RecyclerView.Adapter<WisataAdapter.WisataViewHolder>(){

    var onItemClick : ((Wisata) -> Unit)? = null

    class WisataViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgWisata: ImageView = itemView.findViewById(R.id.img_wisata)
        val namaWisata: TextView = itemView.findViewById(R.id.nama_wisata)
        val descWisata: TextView = itemView.findViewById(R.id.desc_wisata)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WisataViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_wisata, parent, false)
        return WisataViewHolder(view)
    }

    override fun getItemCount(): Int {
        return wisataList.size
    }

    override fun onBindViewHolder(holder: WisataViewHolder, position: Int) {
        val wisata = wisataList[position]
        holder.imgWisata.setImageResource(wisata.gambarWisata)
        holder.namaWisata.text = wisata.namaWisata
        holder.descWisata.text = wisata.descWisata

        holder.itemView.setOnClickListener {
        onItemClick?.invoke(wisata)
        }
    }
}