package com.example.recyclerv

import android.content.Intent
import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var wisataList: ArrayList<Wisata>
    lateinit var wisataAdapter: WisataAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(this, 2)//LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        wisataList = ArrayList()
        addDataToList()

        wisataAdapter = WisataAdapter(wisataList)
        recyclerView.adapter = wisataAdapter

        wisataAdapter.onItemClick = { it ->
            val intent = Intent(this, DetailActivity::class.java )
            intent.putExtra("wisata", it)
            startActivity(intent)
        }
    }

    private fun addDataToList() {
        wisataList.add(Wisata(
            R.drawable.danau_habema,
            "Danau Habema",
            "Danau Habema Danau Habema Danau Habema Danau Habema Danau Habema Danau HabemaDanau Habema Danau Habema"
        ))
        wisataList.add(
            Wisata(R.drawable.goa_nona,
            "Goa Nona",
            "Goa NonaGoa NonaGoa Nona Goa Nona Goa NonaGoa Nona Goa Nona Goa Nona Goa NonaGoa Nona"
            ))
        wisataList.add(Wisata(R.drawable.pasir_putihp_egunungan,
            "Pasir Putih Pegunungan",
            "Pasir Putih PegununganPasir Putih Pegunungan Pasir Putih Pegunungan Pasir Putih ngan"
        ))
        wisataList.add(Wisata(R.drawable.ladang_rumput_mei,
            "Ladang Rumput Mei",
            "Ladang Rumput MeiLadang Rumput MeiLadang Rumput Mei Ladang Rumput Mei Ladang Rumput Mei"
        ))
        wisataList.add(Wisata(R.drawable.telaga_biru,
            "Telaga Biru",
            "Telaga BiruTelaga BiruTelaga Biru Telaga Biru Telaga Biru Telaga BiruTelaga Biru Telaga BiruTelaga Biru"
        ))
        wisataList.add(Wisata(R.drawable.side_jembatan_kuning,
            "Jembatan Kuning",
            "Jembatan KuningJembatan KuningJembatan Kuning Jembatan Kuning Jembatan Kuning Jembatan Kuning"
        ))

        wisataList.add(Wisata(R.drawable.danau_habema,
            "Danau Habema",
            "Danau Habema Danau Habema Danau Habema Danau Habema Danau Habema Danau HabemaDanau Habema Danau Habema"
        ))
        wisataList.add(Wisata(R.drawable.goa_nona,
            "Goa Nona",
            "Goa NonaGoa NonaGoa Nona Goa Nona Goa NonaGoa Nona Goa Nona Goa Nona Goa NonaGoa Nona"
        ))
        wisataList.add(Wisata(R.drawable.pasir_putihp_egunungan,
            "Pasir Putih Pegunungan",
            "Pasir Putih PegununganPasir Putih Pegunungan Pasir Putih Pegunungan Pasir Putih ngan"
        ))
        wisataList.add(Wisata(R.drawable.ladang_rumput_mei,
            "Ladang Rumput Mei",
            "Ladang Rumput MeiLadang Rumput MeiLadang Rumput Mei Ladang Rumput Mei Ladang Rumput Mei"
        ))
        wisataList.add(Wisata(R.drawable.telaga_biru,
            "Telaga Biru",
            "Telaga BiruTelaga BiruTelaga Biru Telaga Biru Telaga Biru Telaga BiruTelaga Biru Telaga BiruTelaga Biru"
        ))
        wisataList.add(Wisata(R.drawable.side_jembatan_kuning,
            "Jembatan Kuning",
            "Jembatan KuningJembatan KuningJembatan Kuning Jembatan Kuning Jembatan Kuning Jembatan Kuning"
        ))
    }
}