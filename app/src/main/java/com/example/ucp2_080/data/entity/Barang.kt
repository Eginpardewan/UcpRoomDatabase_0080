package com.example.ucp2_080.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Barang")
data class Barang(
    @PrimaryKey
    val id: String,
    val nama: String,
    val deskripsi: String,
    val harga: String,
    val stok: String,
    val namasuplier: String
)
