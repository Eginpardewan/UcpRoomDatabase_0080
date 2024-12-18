package com.example.ucp2_080.data.repository

import com.example.ucp2_080.data.entity.Barang
import kotlinx.coroutines.flow.Flow

interface RepositoryBrg {
    suspend fun insertBrg(barang: Barang)

    fun getAllBrg(): Flow<List<Barang>>

    fun getBrg(nama: String): Flow<Barang>

    //delete
    suspend fun deleteBrg(barang: Barang)

    //update
    suspend fun uodateBrg(barang: Barang)
}