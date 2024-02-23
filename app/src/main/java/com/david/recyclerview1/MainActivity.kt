package com.david.recyclerview1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var ListaDatos: MutableList<dtproductos> = mutableListOf()
    private lateinit var recycler: RecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ListaDatos.add(
            dtproductos("2", "harina", "150", "130")
        )
        ListaDatos.add(
            dtproductos("3", "galletas", "140", "110")
        )
        ListaDatos.add(
            dtproductos("4", "jabon", "180", "120")
        )
        ListaDatos.add(
            dtproductos("5", "jamon", "100", "90")
        )
        ListaDatos.add(
            dtproductos("6", "sopa instantanea", "200", "170")
        )
        ListaDatos.add(
            dtproductos("7", "frijol", "30", "20")
        )
        ListaDatos.add(
            dtproductos("8", "arroz", "30", "10")
        )
        ListaDatos.add(
            dtproductos("9", "refresco", "50", "40")
        )
        ListaDatos.add(
            dtproductos("10", "cafe", "19", "15")
        )
        ListaDatos.add(
            dtproductos("11", "azucar", "25", "20")
        )
        ListaDatos.add(
            dtproductos("12", "sabritas", "18", "12")
        )
        ListaDatos.add(
            dtproductos("13", "sal", "18", "14")
        )
        ListaDatos.add(
            dtproductos("14", "cloro", "17", "15")
        )
        ListaDatos.add(
            dtproductos("15", "papel higienico", "25", "20")
        )
        ListaDatos.add(
            dtproductos("16", "queso amarillo", "18", "16")
        )
        ListaDatos.add(
            dtproductos("17","tortilla","26","22")
        )
        ListaDatos.add(
            dtproductos("18","pañales","150","120")
        )
        ListaDatos.add(
            dtproductos("19","toallas femeninas","20","18")
        )
        ListaDatos.add(
            dtproductos("20","cerveza","120","110")
        )
        ListaDatos.add(
            dtproductos("21","desodorante","45","40")
        )
        var tabla =findViewById<RecyclerView>(R.id.Datos)
        recycler=tabla
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=productosAdapter(this, ListaDatos)
    }
}