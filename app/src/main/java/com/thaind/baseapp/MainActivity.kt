package com.thaind.baseapp

import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.thaind.baseapp.databinding.ActivityMainBinding
import com.thaind.baseapp.ui.base.BaseActivity
import com.thaind.baseapp.ui.base.BaseViewModel
import com.thaind.score.Point
import com.thaind.score.calculateDistanceTo

class MainActivity : BaseActivity<BaseViewModel, ActivityMainBinding>() {

    override val mViewModel: BaseViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mViewBinding.root)
        println(">>>>>>Distance: ${Point(2.0, 10.0).calculateDistanceTo(Point(10.0, 6.0))}")
        val navView: BottomNavigationView = mViewBinding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun getViewBinding(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
}