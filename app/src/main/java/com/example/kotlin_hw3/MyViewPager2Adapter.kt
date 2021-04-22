package com.example.kotlin_hw3

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.kotlin_hw3.fragments.FragmentOne
import com.example.kotlin_hw3.fragments.FragmentThree
import com.example.kotlin_hw3.fragments.FragmentTwo

class MyViewPager2Adapter(container: FragmentActivity) : FragmentStateAdapter(container) {
    companion object {
        private const val PAGE_COUNT = 3
    }

    override fun getItemCount() = PAGE_COUNT
    
    override fun createFragment(position: Int): Fragment {
        return  when (position){
            0 -> FragmentOne()
            1 -> FragmentTwo()
            2 -> FragmentThree()
            else -> FragmentOne()
        }
    }
}