package com.example.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class myViewModel:ViewModel() {

    var n=0
   /* val valor:MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }*/

    var valor=MutableLiveData<Int>()

    fun increment()
    {
        n++
       valor.value=n
    }

}