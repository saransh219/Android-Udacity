package com.saransh.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloFragment = HelloFragment()
        val fragmentManager = supportFragmentManager
        //The beginTransaction() will return the object of the Fragment Transaction.
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.containerFL ,helloFragment,"helloFragment")
        fragmentTransaction.commit()
    }
}
