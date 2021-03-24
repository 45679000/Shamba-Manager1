package com.example.shambamanager.shambamanagerdb

class cowsRepository(private val dao: cowsDAO) {

    val cows = dao.getAllCows()
    val afyacows = dao.getCowsHealth()
    val leomilk = dao.getTodayMilkProduction()
    val wikimilk = dao.getWeekMilkProduction()
    val mwezimilk = dao.getMonthMilkProduction()

    suspend fun insertCow(ngombe: Ngombe){
        dao.insertNgombe(ngombe)
    }
    suspend fun insertAfya(ngombeHealth: NgombeHealth){
        dao.insertNgombeHealth(ngombeHealth)
    }
    suspend fun insertMilkProduction(ngombeMilkProduction: NgombeMilkProduction){
        dao.insertMilkProduction(ngombeMilkProduction)
    }
    suspend fun updateCow(ngombe: Ngombe){
        dao.updateNgombe(ngombe)
    }
    suspend fun updateAfya(ngombeHealth: NgombeHealth){
        dao.updateHealth(ngombeHealth)
    }
    suspend fun updateMilkProduction(ngombeMilkProduction: NgombeMilkProduction){
        dao.updateMilkProdustion(ngombeMilkProduction)
    }


}