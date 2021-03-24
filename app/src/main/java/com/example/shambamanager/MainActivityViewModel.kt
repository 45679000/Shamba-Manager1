package com.example.shambamanager

import androidx.lifecycle.ViewModel
import com.example.shambamanager.shambamanagerdb.cowsRepository

class MainActivityViewModel(private var repository: cowsRepository) : ViewModel() {

    val todayMilk = repository.leomilk

    val weekMilk = repository.wikimilk

    val monthMilk = repository.mwezimilk
}