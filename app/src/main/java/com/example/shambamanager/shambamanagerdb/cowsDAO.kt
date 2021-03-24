package com.example.shambamanager.shambamanagerdb

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface cowsDAO {

    @Insert
    suspend fun insertNgombe(ngombe: Ngombe)

    @Insert
    suspend fun insertMilkProduction(ngombeMilkProduction: NgombeMilkProduction)

    @Insert
    suspend fun insertNgombeHealth(ngombehealth: NgombeHealth)

    @Update
    suspend fun updateNgombe(ngombe: Ngombe)

    @Update
    suspend fun updateMilkProdustion(ngombeMilkProduction: NgombeMilkProduction)

    @Update
    suspend fun updateHealth(ngombehealth: NgombeHealth)

    @Query("SELECT * FROM ngombeInfo")
    fun getAllCows():LiveData<List<Ngombe>>

    @Query("SELECT * FROM ngombe_milk_production")
    fun getTodayMilkProduction():LiveData<List<NgombeMilkProduction>>

    @Query("SELECT * FROM ngombe_milk_production")
    fun getWeekMilkProduction():LiveData<List<NgombeMilkProduction>>

    @Query("SELECT * FROM ngombe_milk_production")
    fun getMonthMilkProduction():LiveData<List<NgombeMilkProduction>>

    @Query("SELECT * FROM ngombeHealth")
    fun getCowsHealth():LiveData<List<NgombeHealth>>
}