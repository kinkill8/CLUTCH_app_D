package com.example.clutch

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "comentarios")
class coment (
        val nombre : String,
        val titulo : String,
        val comentario : String,
        @PrimaryKey(autoGenerate = true)
        val idcomentario : Int = 0):java.io.Serializable
