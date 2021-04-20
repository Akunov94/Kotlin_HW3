package com.example.kotlin_hw3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin_hw3.BaseFragment
import com.example.kotlin_hw3.R
import kotlinx.android.synthetic.main.fragment_three.*
import kotlinx.android.synthetic.main.fragment_two.*

class FragmentThree : BaseFragment(R.layout.fragment_three){
    private lateinit var viewModel: MainViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        viewModel._btnPlusCounter.observe(viewLifecycleOwner, Observer {
            tv_CounterPlus.text= it.toString()
        })
        viewModel._btnMinusCounter.observe(viewLifecycleOwner, Observer {
            tv_CounterMinus.text= it.toString()
        })
    }
}