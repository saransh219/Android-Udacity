package com.saransh.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),MyListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentManager = supportFragmentManager
        addFragmentA()
    }

    private fun addFragmentA() {
        val fragmentA = FragmentA()
        val fTransaction = supportFragmentManager.beginTransaction()
        fTransaction.add(R.id.containerFragmentA,fragmentA,"fragA")
        fTransaction.commit()
    }

    override fun addTwoNumbers(num1: Int, num2: Int)
    {
        val result = num1 + num2
        txvResult.setText("Result = $result ")
    }


}
