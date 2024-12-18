package com.example.ucp2_080.data.repository

import com.example.ucp2_080.data.entity.Suplier
import kotlinx.coroutines.flow.Flow

interface RepositorySpl {
    suspend fun insertSpl(suplier: Suplier)

    fun getAllSpl(): Flow<List<Suplier>>

    fun getSpl(nama: String): Flow<Suplier>
}