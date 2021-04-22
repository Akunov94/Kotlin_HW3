package com.example.kotlin_hw3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.kotlin_hw3.extensions.showToast
import com.example.kotlin_hw3.fragments.FragmentOne
import com.example.kotlin_hw3.fragments.FragmentThree
import com.example.kotlin_hw3.fragments.FragmentTwo
import com.example.kotlin_hw3.fragments.MainViewModel
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_one.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        view_pager_2.adapter = MyViewPager2Adapter(this)

        TabLayoutMediator(tab_layout, view_pager_2) { tab, position ->

            tab.text = when (position) {
                0 -> "Первый"
                1 -> "Второй"
                2 -> "Крайний"
                else -> "Первый"
            }
        }.attach()

        bot_nav_menu.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.fragmentOne -> {
                    showToast("Salam")
                    FragmentOne()
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
    }
}