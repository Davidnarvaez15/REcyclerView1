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

        var tabla =findViewById<RecyclerView>(R.id.Datos)
        recycler=tabla
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=productosAdapter(this, ListaDatos)
        ListaDatos.add(
            dtproductos("id del producto:2", "producto:harina", "precio por menudeo:150", "precio por mayoreo:130")
        )
        ListaDatos.add(
            dtproductos("id:3", "producto: galletas", "precio menudeo: 140", "precio mayoreo: 110")
        )
        ListaDatos.add(
            dtproductos("id: 4", "producto :jabon", "precio menudeo: 180", "precio mayoreo: 120")
        )
        ListaDatos.add(
            dtproductos("id: 5", "producto: jamon", "precio menudeo: 100", "precio mayoreo: 90")
        )
        ListaDatos.add(
            dtproductos("id: 6", "producto: sopa instantanea", "precio menudeo: 200", "precio mayoreo: 170")
        )
        ListaDatos.add(
            dtproductos("id: 7", "producto: frijol", "precio menudeo :30", "precio mayoreo: 20")
        )
        ListaDatos.add(
            dtproductos("id: 8", "producto: arroz", "precio  menudeo: 30", "precio mayoreo: 10")
        )
        ListaDatos.add(
            dtproductos("id: 9", "producto: refresco", "precio menudoe: 50", "precio mayoreo: 40")
        )
        ListaDatos.add(
            dtproductos("id: 10", "producto: cafe", "precio menudeo: 19", "precio mayoreo: 15")
        )
        ListaDatos.add(
            dtproductos("id: 11", "producto: azucar", "precio menudeo: 25", "precio mayoreo: 20")
        )
        ListaDatos.add(
            dtproductos("id: 12", "producto: sabritas", "precio menudeo: 18", "precio mayoreo:12")
        )
        ListaDatos.add(
            dtproductos("id: 13", "producto: sal", "precio menudeo: 18", "precio mayoreo: 14")
        )
        ListaDatos.add(
            dtproductos("id: 14", "producto: cloro", "precio menudeo: 17", "precio mayoreo: 15")
        )
        ListaDatos.add(
            dtproductos("id: 15", "producto: papel higienico", "precio menudeo: 25", "precio mayoreo: 20")
        )
        ListaDatos.add(
            dtproductos("id: 16", "producto: queso amarillo", "precio menudeo: 18", "precio mayoreo: 16")
        )
        ListaDatos.add(
            dtproductos("id: 17", "producto: tortilla", "precio menudeo: 26", "precio mayoreo: 22")
        )
        ListaDatos.add(
            dtproductos("id: 18", "producto: pañales", "precio menudeo: 150", "precio mayoreo: 120")
        )
        ListaDatos.add(
            dtproductos("id: 19", "producto: toallas femeninas", "precio menudeo: 20", "precio mayoreo: 18")
        )
        ListaDatos.add(
            dtproductos("id: 20", "producto: cerveza", "precio menudeo: 120", "precio mayoreo: 110")
        )
        ListaDatos.add(
            dtproductos("id: 21", "producto: desodorante", "precio menudeo: 45", "precio mayoreo: 40")
        )
    }
}