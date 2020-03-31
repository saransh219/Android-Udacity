package com.saransh.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentB:Fragment()
{
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("TAG","onAttach")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("TAG","onCreate")
    }
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View?
    {
        val view = inflater.inflate(R.layout.fragment_b,container,false)
        //here we can write all the custom codes
        Log.e("TAG","onCreateView")
        return  view
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("TAG","onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.e("TAG","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("TAG","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("TAG","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("TAG","onStop")

    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("TAG","onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("TAG","onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("TAG","onDetach")
    }

}