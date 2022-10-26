package com.example.clutch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_comentarios.*
import kotlinx.coroutines.*

class comentarios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comentarios)

        btnguardar.setOnClickListener{
            guardarcomentario()
        }

    }

    fun guardarcomentario(){
        val bd = BasedeDatos.obtenerbasededatos(this)
        val nombre = txtnombre.text.toString()
        val titulo = txttitulo.text.toString()
        val comentario = txtcomentario.text.toString()

        val nuevocomentario = coment(nombre, titulo, comentario)

        CoroutineScope(Dispatchers.IO).launch {
            val id = bd.coment().insertarcomentario(nuevocomentario)[0]
        }
    }

}