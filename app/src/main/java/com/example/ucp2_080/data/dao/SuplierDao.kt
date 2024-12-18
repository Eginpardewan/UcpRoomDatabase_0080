package com.example.ucp2_080.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.ucp2_080.data.entity.Suplier
import kotlinx.coroutines.flow.Flow

@Dao
interface SuplierDao {
    @Insert
    suspend fun insertSuplier(suplier: Suplier)

    //getAllSuplier
    @Query("SELECT * FROM suplier ORDER BY id ASC")
    fun getAllSuplier(): Flow<List<Suplier>>

    //getSuplier
    @Query("SELECT * FROM suplier WHERE nama = :nama")
    fun getSuplier(nama: String): Flow<Suplier>

}