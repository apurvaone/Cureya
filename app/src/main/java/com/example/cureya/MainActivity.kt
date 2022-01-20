package com.example.cureya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.cureya.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

 private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val  navView:BottomNavigationView= binding.navView

        val navController= findNavController(R.id.nav_host_fragment_activity_main)

        val appBarConfiguration= AppBarConfiguration(

            setOf(

                R.id.homeFragment,R.id.chatFragment,R.id.chatbotFragment,R.id.communityFragment ,R.id.relaxationFragment


            )
        )

        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)















    }


}