package com.saransh.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentManager = supportFragmentManager

    }

    fun sendDataToFragment(view: View)
    {
        val firstNumber = etFirstNumber.text.toString().toInt()
        val secondNumber = etSecondNumber.text.toString().toInt()
        val result = firstNumber + secondNumber
        Toast.makeText(this,"$result",Toast.LENGTH_SHORT).show()

        val bundle = Bundle()
        bundle.putInt("first_number",firstNumber)
        bundle.putInt("second_number",secondNumber)

        val fragmentA = FragmentA()
        fragmentA.arguments = bundle

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.containerFragmentA,fragmentA,"fragA")
        fragmentTransaction.commit()
    }


}
