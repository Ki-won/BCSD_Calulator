package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    val calculatorFragment = CalculatorFragment()
    val listFragment = ListFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_list_calu)
        bottomNavigationView.setOnItemReselectedListener {
            when(it.itemId){
                R.id.menu_list -> swichFragment(listFragment)
                R.id.menu_Calculator ->swichFragment(calculatorFragment)
            }

            true

        }
    }

    private fun  swichFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}