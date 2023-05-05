package com.example.e_commerce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.fragment.findNavController
import com.example.e_commerce.databinding.ActivityMainBinding
import com.google.android.play.core.integrity.i

class MainActivity : AppCompatActivity(){
    private lateinit var binding: ActivityMainBinding
    var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater) // inflate the layout
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainer) // get the nav host fragment
        val navController = navHostFragment!!.findNavController() // get the nav controller

        val popopMenu = PopupMenu(this, null) // create a popup menu
        popopMenu.inflate(R.menu.bottom_nav) // inflate the menu
        binding.bottomBar.setupWithNavController(
            popopMenu.menu,
            navController
        ) // setup the bottom navigation view with the nav controller

        binding.bottomBar.onItemSelected = {
            when (it) {
                0 -> {
                    i = 0;
                    navController.navigate(R.id.homeFragment)
                }
                1 -> i = 1
                2 -> i = 2
            }
        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        if (i == 0) {
            finish()
        }
    }
}

//        navController.addOnDestinationChangedListener(object : NavController.OnDestinationChangedListener{
//            override fun onDestinationChanged(
//                controller: NavController,
//                destination: NavDestination,
//                arguments: Bundle?
//            ) {
//                title = when(destination.id){
//                    R.id.cartFragment -> "My Cart"
//                    R.id.moreFragment -> "My Dashboard"
//                    else -> "E-Commerce"
//                }
//            }
//
//
//        })

