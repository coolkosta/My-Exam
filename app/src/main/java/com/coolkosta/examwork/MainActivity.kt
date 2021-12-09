package com.coolkosta.examwork

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

lateinit var bottomNavigationView: BottomNavigationView
lateinit var mainFragment: Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottom_navigation)
        mainFragment = MainFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, mainFragment)
            .commit()


        bottomNavigationView.setOnItemSelectedListener { item ->
            var fragment: Fragment? = null
            when (item.itemId) {
                R.id.main -> {
                    fragment = MainFragment()
                }
                R.id.about -> {
                    fragment = AboutFragment()

                }
            }
            replaceFragment(fragment!!)
            true
        }


    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}