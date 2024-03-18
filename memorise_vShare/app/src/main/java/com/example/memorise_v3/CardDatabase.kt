package com.example.memorise_v3

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//creation de la base de donne et on veut pas garder trace de lhistorique de la bdd
@Database (entities = [Card::class], version=1 , exportSchema = false)
abstract class CardDatabase : RoomDatabase(){
    abstract val cardDao : CardDao

    companion object{

        @Volatile
        private var INSTANCE: CardDatabase? = null

        fun getInstance(context: Context): CardDatabase{
            synchronized(this){
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        CardDatabase::class.java,
                        "card_database"
                    ).build()
                }

                return instance
            }
        }
    }
}
