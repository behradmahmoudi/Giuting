package com.My.giuting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.My.giuting.databinding.ActivityNavigation2Binding
import dagger.hilt.android.AndroidEntryPoint
import java.security.AccessController

@AndroidEntryPoint
class NavigationActivity2 : AppCompatActivity() {

    private lateinit var binding : ActivityNavigation2Binding

    private lateinit var navController: NavController
    private lateinit var navHostFragment: NavHostFragment

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var appBarConfig: AppBarConfiguration

//    private lateinit var listener: NavController.onDestination

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavigation2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolBar)

        navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController

        drawerLayout = binding.drawerLayout

        binding.navigationView.setupWithNavController(navController)
        binding.bottomNavView.setupWithNavController(navController)

        appBarConfig = AppBarConfiguration(navController.graph, drawerLayout)
        setupActionBarWithNavController(navController, appBarConfig)





    }

    override fun onSupportNavigateUp(): Boolean {
        navController = findNavController(R.id.fragmentContainerView)
        return navController.navigateUp(appBarConfig) || super.onSupportNavigateUp()
    }
}