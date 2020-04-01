package com.saransh.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_a.*
import kotlinx.android.synthetic.main.fragment_a.view.*

class FragmentA:Fragment()
{

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View?
    {
        val view = inflater.inflate(R.layout.fragment_a,container,false)
        //here we can write all the custom codes

        val bundle:Bundle = arguments!!
        val firstNum = bundle.getInt("first_number",0)
        val secondNum = bundle.getInt("second_number",0)
        val result = firstNum+secondNum

        view.btnAdd.setOnClickListener {
              //code to add numbers will come here
            txvResult.text = "$result"
        }
        Log.i("TAG","onCreateView")
        return  view
    }



}