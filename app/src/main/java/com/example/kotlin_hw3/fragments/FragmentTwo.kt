package com.example.kotlin_hw3.fragments

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin_hw3.BaseFragment
import com.example.kotlin_hw3.R
import kotlinx.android.synthetic.main.fragment_two.*

class FragmentTwo : BaseFragment(R.layout.fragment_two){
    private lateinit var viewModel: MainViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        viewModel.counter.observe(viewLifecycleOwner, Observer {
            tv_Counter.text = it.toString()
        })
    }
}

