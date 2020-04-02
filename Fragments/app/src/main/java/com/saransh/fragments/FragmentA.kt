package com.saransh.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_a.*
import kotlinx.android.synthetic.main.fragment_a.view.*

class FragmentA:Fragment()
{

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View?
    {
        val view = inflater.inflate(R.layout.fragment_a,container,false)
        //here we can write all the custom codes

        view.btnSend.setOnClickListener {
              sendData()
        }
        Log.i("TAG","onCreateView")
        return  view
    }

    private fun sendData() {
        val firstNum = etFirstNumber.text.toString().toInt()
        val secondNum = etSecondNumber.text.toString().toInt()
        val myListener:MyListener = activity as MyListener
        myListener.addTwoNumbers(firstNum,secondNum)
    }


}