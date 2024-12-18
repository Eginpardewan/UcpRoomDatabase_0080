package com.example.ucp2_080.data.repository

import com.example.ucp2_080.data.dao.SuplierDao
import com.example.ucp2_080.data.entity.Suplier
import kotlinx.coroutines.flow.Flow

class LocalRepositorySpl (
    private val suplierDao: SuplierDao
) : RepositorySpl {
    override suspend fun insertSpl(suplier: Suplier) {
        suplierDao.insertSuplier(suplier)
    }

    //getAllSpl
    override fun getAllSpl(): Flow<List<Suplier>> {
        return suplierDao.getAllSuplier()
    }

    //getSpl
    override fun getSpl(nama: String): Flow<Suplier> {
        return suplierDao.getSuplier(nama)
    }
}