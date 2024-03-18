package com.example.memorise_v3

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
interface CardDao {

    //les fonctions pour mettre a jour la liste
    //on met le suspend pour quelle soit en backggorudn
    @Insert
    suspend fun insert (card: Card)

    @Update
    suspend fun update (card: Card)

    @Delete
    suspend fun delete (card: Card)

    //pour avoir lid dune carte
    @Query("SELECT * FROM card_table WHERE id = :cardId")
    fun get(cardId: Long ): LiveData<Card>

    //pour reccuperer tous nos memocard
    @Query("SELECT *FROM card_table ORDER BY id DESC")
    fun getAll(): LiveData<List<Card>>
}
