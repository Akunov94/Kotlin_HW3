package com.example.kotlin_hw3.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var mCounter = 0
    private var btnPlus = "➕"
    private  var btnMinus = "➖"

    val counter = MutableLiveData<Int?>()

    val _btnPlusCounter = MutableLiveData<String?>()

    val _btnMinusCounter = MutableLiveData<String?>()

    fun sumPlus() {
        counter.value = ++mCounter
        _btnPlusCounter.value += btnPlus
    }

    fun sumMinus() {
        counter.value = --mCounter
        _btnMinusCounter.value += btnMinus
    }
    init {
        _btnPlusCounter.postValue("")
        _btnMinusCounter.postValue("")
        counter.postValue(0)
    }
}

