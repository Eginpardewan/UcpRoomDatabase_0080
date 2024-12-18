package com.example.ucp2_080.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.ucp2_080.data.entity.Barang
import kotlinx.coroutines.flow.Flow

@Dao
interface BarangDao {
    @Insert
    suspend fun insertBarang(barang: Barang)

    //getAllBarang
    @Query("SELECT * FROM id ORDER BY id ASC")
    fun getAllBarang(): Flow<List<Barang>>

    //getBarang
    @Query("SELECT * FROM barang WHERE nama = :nama")
    fun getBarang(nama: String): Flow<Barang>

    //deleteBarang
    @Delete
    suspend fun deleteBarang(barang: Barang)

    //updateBarang
    @Update
    suspend fun updateBarang(barang: Barang)
}