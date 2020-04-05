package com.saransh.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_b.*

class MainActivity : AppCompatActivity(),MyListener {

    var firstNum:Int = 0
    var secondNum:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentManager = supportFragmentManager
        addFragmentA()
        addFragmentB()
    }

    private fun addFragmentA() {
        val fragmentA = FragmentA()
        val fTransaction = supportFragmentManager.beginTransaction()
        fTransaction.add(R.id.containerFragmentA,fragmentA,"fragA")
        fTransaction.commit()
    }
    private fun addFragmentB() {
        val fragmentB = FragmentB()
        val fTransaction = supportFragmentManager.beginTransaction()
        fTransaction.add(R.id.containerFragmentB,fragmentB,"fragB")
        fTransaction.commit()
    }

    override fun addTwoNumbers(num1: Int, num2: Int)
    {
        firstNum = num1
        secondNum = num2
        Toast.makeText(this,"Data Received",Toast.LENGTH_SHORT).show()
    }

    fun sendDataToFragmentB(view: View)
    {
        val fragmentB:FragmentB = supportFragmentManager.findFragmentByTag("fragB") as FragmentB
        fragmentB.addTwoNumbersInFragmentB(firstNum,secondNum)

    }


}
