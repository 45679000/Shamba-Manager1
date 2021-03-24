package com.example.shambamanager.shambamanagerdb

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shambamanager.R

class mycows : Fragment() {

    companion object {
        fun newInstance() = mycows()
    }

    private lateinit var viewModel: myCowsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.mycows_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(myCowsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}