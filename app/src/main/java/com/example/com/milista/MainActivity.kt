package com.example.com.milista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TableLayout
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tarea = Tarea(nombre = "Biologia", descripcion = "que son las glandulas endocrinas")
        val tarea2 = Tarea(nombre = "Matematicas", descripcion = "Fracciones")
        val tarea3 = Tarea(nombre = "Politica", descripcion = "Leer lectura")

        val listaTarea = listOf(tarea, tarea2, tarea3)

            val adapter = Adapter (this, listaTarea)

            lista.adapter = adapter


    }











}