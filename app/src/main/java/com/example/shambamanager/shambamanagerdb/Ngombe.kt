package com.example.shambamanager.shambamanagerdb

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation
import java.sql.Date

@Entity(tableName = "ngombeInfo")
data class Ngombe(
    @PrimaryKey val cowId: Long,
    val name: String,
    val numberofheifers: Int,
    val age: Int,
    val gender: String,
)

@Entity(tableName = "ngombe_milk_production")
data class NgombeMilkProduction(
    @PrimaryKey val cowId: Long,
    val morning: String,
    val midmorning: String,
    val evening: String,
    @Embedded  val ngombeinformation: Ngombe,
)

@Entity(tableName = "ngombeHealth")
data class NgombeHealth(
    @PrimaryKey val cowId: Long,
    val dewomingday: Int,
    val illnesses: Long,
    @Embedded  val ngombeinformation: Ngombe,
)
//@Entity
/*data class CowProducingMilk(
    @Embedded val ngombeinformation: Ngombe,
    @Relation(
        parentColumn = "cowId",
        entityColumn = "morning"
    )

)*/

