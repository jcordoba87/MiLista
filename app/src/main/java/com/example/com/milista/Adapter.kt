package com.example.com.milista

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.tarea.view.*

class Adapter (private val mContext: Context, private val listaTareas: List<Tarea>) : ArrayAdapter<Tarea>(mContext, 0, listaTareas)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.tarea, parent, false)

        val tarea = listaTareas[position]

        layout.nombre.text = tarea.nombre
        layout.descripcion.text = tarea.descripcion

        return layout
    }
}
