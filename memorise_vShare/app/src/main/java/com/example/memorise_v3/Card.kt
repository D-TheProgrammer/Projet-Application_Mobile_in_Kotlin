package com.example.memorise_v3

import androidx.room.Entity
import androidx.room.PrimaryKey

//on cree le nom de la table
@Entity(tableName = "card_table")
data class Card(
    @PrimaryKey(autoGenerate = true)
    var id: Long=0L,

    var titre:String="",
    var description: String="",
    var theme:String="",
    var fini:Boolean = false,
)

