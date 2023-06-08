package com.example.recyclerv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val wisata = intent.getParcelableExtra<Wisata>("wisata")
        if (wisata != null) {
            val namawisata : TextView = findViewById(R.id.detail_tv)
            val descwisata : TextView = findViewById(R.id.detail_tv_desc)
            val imgwisata : ImageView = findViewById(R.id.detail_iv)

            namawisata.text = wisata.namaWisata
            descwisata.text = wisata.descWisata
            imgwisata.setImageResource(wisata.gambarWisata)
        }
    }
}