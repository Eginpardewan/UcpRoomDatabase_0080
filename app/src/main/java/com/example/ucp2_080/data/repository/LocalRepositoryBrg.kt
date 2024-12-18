package com.example.ucp2_080.data.repository

import com.example.ucp2_080.data.dao.BarangDao
import com.example.ucp2_080.data.entity.Barang
import kotlinx.coroutines.flow.Flow

class LocalRepositoryBrg (
    private val barangDao: BarangDao
) : RepositoryBrg {
    override suspend fun insertBrg(barang: Barang) {
        barangDao.insertBarang(barang)
    }

    //getAllBrg
    override fun getAllBrg(): Flow<List<Barang>> {
        return barangDao.getAllBarang()
    }

    //getBrg
    override fun getBrg(nama: String): Flow<Barang> {
        return barangDao.getBarang(nama)
    }

    //deleteBrg
    override suspend fun deleteBrg(barang: Barang) {
        barangDao.deleteBarang(barang)
    }

    //updateBrg
    override suspend fun uodateBrg(barang: Barang) {
        barangDao.updateBarang(barang)
    }
}
