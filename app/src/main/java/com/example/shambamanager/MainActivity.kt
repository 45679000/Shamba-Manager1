package com.example.shambamanager

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.shambamanager.databinding.ActivityMainBinding
import com.example.shambamanager.shambamanagerdb.CowsDatabase
import com.example.shambamanager.shambamanagerdb.cowsDAO
import com.example.shambamanager.shambamanagerdb.cowsRepository
import com.example.shambamanager.shambamanagerdb.myCowsViewModel


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainActivityViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val dao = CowsDatabase.getInstance(application).cowsDatabasecowsDAO
        val repository = cowsRepository(dao)
        val factory = MainActivityViewModelFactory(repository)
        //code to get the cows viewmodel instance
        mainActivityViewModel = ViewModelProvider(this,factory).get(MainActivityViewModel::class.java)
        //assign viewmodel instace to the data binding object
        binding.myViewModel = mainActivityViewModel
        //since we intend to use lifedata with databinding, we need to provide the lifecycle owner
        binding.lifecycleOwner = this
        displaymorningmilk()

    }

    private fun displaymorningmilk(){
        //code to observe leomilk(check cows repository) from the mainActivity
        mainActivityViewModel.todayMilk.observe(this, Observer {
            Log.i("MYTAG",it.toString())
        })
    }
}