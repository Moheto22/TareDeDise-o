package com.example.taredisenyo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView

class AdapterFruta (context : Context, val layout: Int, val lista : MutableList<Int>):
    ArrayAdapter<Int>(context,layout,lista) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var view: View
        if (convertView != null){
            view = convertView
        }else{
            view = LayoutInflater.from(context).inflate(R.layout.layout_producto,parent,false)
        }

        bindPlanet (view,lista[position])

        return view
    }

    private fun bindPlanet(view: View, imagen : Int) {
        val image = view.findViewById<ImageView>(R.id.imagen_fruta)
        image.setImageResource(imagen)
    }
}