package com.sl.android.kotlindemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val host: NavHostFragment =
            supportFragmentManager.findFragmentById(R.id.my_nav_host_fragment) as NavHostFragment
        val navController = host.navController
        initWidget()
        initBottomNavigationView(bottomNavigationView, navController)
    }


    private fun initBottomNavigationView(
        bottomNavigationView: BottomNavigationView,
        navController: NavController) {
        bottomNavigationView.setupWithNavController(navController)
    }

    private fun initWidget() {
        bottomNavigationView = findViewById(R.id.navigation_view)
    }
}
