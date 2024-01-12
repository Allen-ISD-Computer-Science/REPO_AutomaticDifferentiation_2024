package com.example.testingapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.testingapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /* val buttonEvent = findViewById<Button>(R.id.button)
        buttonEvent.setOnClickListener{
            Toast.makeText(this, "@string/toast_TestButtonText", Toast.LENGTH_SHORT).show()
        }  USE getString FUNCTION INSTEAD OF @string*/

        val buttonEvent = findViewById<Button>(R.id.faxButton)
        buttonEvent.setOnClickListener {
            Toast.makeText(this, getString(R.string.toast_TestButtonText), Toast.LENGTH_SHORT).show()
        }

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}