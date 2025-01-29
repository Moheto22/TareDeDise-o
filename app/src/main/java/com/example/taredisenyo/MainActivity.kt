package com.example.taredisenyo

import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var grid = findViewById<GridView>(R.id.grid)
        var lista = mutableListOf(
            R.drawable.platano,
            R.drawable.platano,
            R.drawable.platano,
            R.drawable.platano,
            R.drawable.platano,
            R.drawable.platano,
            R.drawable.platano,
            R.drawable.platano,
            R.drawable.platano,
            R.drawable.platano,
            R.drawable.platano,
            R.drawable.platano
        )
        val adapter = AdapterFruta(this, R.layout.layout_producto, lista)

        grid.adapter = adapter

    }

}