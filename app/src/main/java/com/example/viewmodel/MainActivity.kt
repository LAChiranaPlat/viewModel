package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var vm:myViewModel
    lateinit var views:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        views= ActivityMainBinding.inflate(layoutInflater)
        setContentView(views.root)

        vm=ViewModelProvider(this).get(myViewModel::class.java)

        views.add.setOnClickListener {
            vm.increment()
        }

        vm.valor.observe(this, Observer {
            views.count.text=vm.n.toString()
        })

    }


}