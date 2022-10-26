package com.example.clutch

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface comentDAO {
    @Query("SELECT * FROM comentarios")
    fun obtenercomentarios():LiveData<List<coment>>
    @Query("SELECT * FROM comentarios WHERE idcomentario = :id")
    fun obtenercomentario(id:Int):LiveData<coment>
    @Insert
    fun insertarcomentario(vararg coment: coment):List<Long>
    @Delete
    fun eliminarcomentario(coment: coment)
    @Update
    fun actualizarcomentario(coment: coment)
}