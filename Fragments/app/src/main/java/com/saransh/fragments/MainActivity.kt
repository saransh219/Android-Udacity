package com.saransh.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("TAG","onCreate")
        setContentView(R.layout.activity_main)

//        val helloFragment = HelloFragment()
//        val fragmentManager = supportFragmentManager
//        //The beginTransaction() will return the object of the Fragment Transaction.
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.add(R.id.containerFL ,helloFragment,"helloFragment")
//        fragmentTransaction.commit()
    }

    override fun onStart() {
        super.onStart()
        Log.e("TAG","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("TAG","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("TAG","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("TAG","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("TAG","onDestroy")
    }

}
