package com.example.clutch

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [coment::class], version = 1)
abstract class BasedeDatos : RoomDatabase(){
    abstract fun coment() :comentDAO

    companion object{
        @Volatile
        private var instanciabd: BasedeDatos? = null
        fun obtenerbasededatos(contexto:Context):BasedeDatos{
            val instancia = instanciabd
            if (instancia != null){
                return instancia
            }

            synchronized(this){
                val bdinstancia = Room.databaseBuilder(
                    contexto.applicationContext,
                    BasedeDatos::class.java,
                    "comentariosCLUTCH"
                ).build()
                instanciabd = bdinstancia
                return bdinstancia
            }

        }
    }
}