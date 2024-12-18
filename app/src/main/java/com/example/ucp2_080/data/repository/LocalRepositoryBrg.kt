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

        //getAllMhs
        override fun getAllBrg(): Flow<List<Barang>> {
            return barangDao.getAllBarang()
        }

        //getMhs
        override fun getBrg(nama: String): Flow<Barang> {
            return barangDao.getBarang(nama)
        }

        //deleteMhs
        override suspend fun deleteBrg(barang: Barang) {
            barangDao.deleteBarang(barang)
        }

        //updateMhs
        override suspend fun updateBrg(barang: Barang) {
            barangDao.updateBarang(barang)
        }
}