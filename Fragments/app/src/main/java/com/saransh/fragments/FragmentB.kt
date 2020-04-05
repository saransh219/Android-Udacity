package com.saransh.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_b.*

class FragmentB:Fragment()
{

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View?
    {
        val view = inflater.inflate(R.layout.fragment_b,container,false)
        //here we can write all the custom codes
        Log.e("TAG","onCreateView")
        return  view
    }
    fun addTwoNumbersInFragmentB(x:Int,y:Int)
    {
        val result = x + y
        txvResult.setText("$result")
    }

}