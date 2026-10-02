package com.example.data.room

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
  tableName = "customers",
  indices = [Index(value = ["accountNumber"])]
)
data class CustomerEntity(
  @PrimaryKey val id: Long,
  val accountNumber: String,
  val name: String,
  val phone: String = "",
  val address: String = "",
  val balance: Double = 0.0,
  val updatedAt: Long = System.currentTimeMillis()
)
