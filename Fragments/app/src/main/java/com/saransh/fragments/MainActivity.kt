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
        //val fragmentTransaction = fragmentManager.beginTransaction()

//        val helloFragment = HelloFragment()
//        val fragmentManager = supportFragmentManager
//        //The beginTransaction() will return the object of the Fragment Transaction.
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.add(R.id.containerFL ,helloFragment,"helloFragment")
//        fragmentTransaction.commit()
    }

    fun addFragmentA(view: View)
    {
        val fragmentA = FragmentA()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.container,fragmentA,"fragA")
        fragmentTransaction.commit()
    }
    fun removeFragmentA(view: View)
    {
        val fragmentA: Fragment? = supportFragmentManager.findFragmentByTag("fragA")
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        if (fragmentA != null)
        {
            fragmentTransaction.remove(fragmentA!!)
            fragmentTransaction.commit()
        }
        else
        {
            Toast.makeText(this,"Add a Fragment first",Toast.LENGTH_SHORT).show()
        }

    }
    fun addFragmentB(view: View)
    {
        val fragmentB = FragmentB()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.container,fragmentB,"fragB")
        fragmentTransaction.commit()
    }
    fun removeFragmentB(view: View)
    {
        val fragmentB: Fragment? = supportFragmentManager.findFragmentByTag("fragB")
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        if (fragmentB !=null)
        {
            fragmentTransaction.remove(fragmentB!!)
            fragmentTransaction.commit()
        }
        else
        {
            Toast.makeText(this,"Add a Fragment first",Toast.LENGTH_SHORT).show()
        }
    }

    fun replacebyFragmentA(view: View)
    {
        val fragmentA = FragmentA()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container,fragmentA,"fragA")
        fragmentTransaction.commit()

    }
    fun replacebyFragmentB(view: View)
    {
        val fragmentB = FragmentB()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container,fragmentB,"fragB")
        fragmentTransaction.commit()

    }

    fun attachFragmentA(view: View)
    {
        val fragmentA = supportFragmentManager.findFragmentByTag("fragA")
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        if (fragmentA!=null)
        {
            fragmentTransaction.attach(fragmentA)
            fragmentTransaction.commit()
        }
        else
        {
            Toast.makeText(this,"- - -",Toast.LENGTH_SHORT).show()
        }
    }
    fun detachFragmentA(view: View)
    {
        val fragmentA = supportFragmentManager.findFragmentByTag("fragA")
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        if (fragmentA !=null)
        {
            fragmentTransaction.detach(fragmentA)
            fragmentTransaction.commit()
        }
        else
        {
            Toast.makeText(this,"Add a fragment first",Toast.LENGTH_SHORT).show()
        }

    }
    fun showFragmentA(view: View)
    {
        val fragmentA = supportFragmentManager.findFragmentByTag("fragA")
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        if (fragmentA != null)
        {
            fragmentTransaction.show(fragmentA)
            fragmentTransaction.commit()
        }
        else
        {
            Toast.makeText(this,"- - -",Toast.LENGTH_SHORT).show()
        }
    }
    fun hideFragmentA(view: View)
    {
        val fragmentA= supportFragmentManager.findFragmentByTag("fragA")
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        if (fragmentA != null)
        {
            fragmentTransaction.hide(fragmentA)
            fragmentTransaction.commit()
        }

    }


}
