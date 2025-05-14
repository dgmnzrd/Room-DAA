package com.example.room.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo

@Entity(tableName = "cronos")
data class Cronos (
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    @ColumnInfo(name = "titulo")
    var titulo: String,
    @ColumnInfo(name = "crono")
    var crono: Long
)