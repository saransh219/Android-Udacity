package com.saransh.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentA:Fragment()
{
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("TAG","onAttach")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("TAG","onCreate")
    }
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View?
    {
        val view = inflater.inflate(R.layout.fragment_a,container,false)
        //here we can write all the custom codes
        Log.i("TAG","onCreateView")
        return  view
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i("TAG","onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i("TAG","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("TAG","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("TAG","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("TAG","onStop")

    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("TAG","onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("TAG","onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("TAG","onDetach")
    }

}