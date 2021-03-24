package com.example.shambamanager.shambamanagerdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Ngombe::class], version = 1, exportSchema = false)
abstract class CowsDatabase : RoomDatabase() {

    // declare an abstract value of type SleepNightDao
    abstract val cowsDatabasecowsDAO: cowsDAO

    // Declare a companion object
    companion object{
        @Volatile
        private var INSTANCE: CowsDatabase? = null

        // Declare a @volatile INSTANCE variable
        fun getInstance(context: Context) : CowsDatabase {
            synchronized (this){
                var instance = INSTANCE

                if (instance ==null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        CowsDatabase::class.java,
                        "cows_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }

                return instance
            }
        }
    }
}