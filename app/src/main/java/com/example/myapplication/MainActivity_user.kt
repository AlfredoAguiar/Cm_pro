package com.example.myapplication

import android.content.Intent
import android.content.res.Configuration
import android.content.res.Resources
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView
import java.util.Locale

class MainActivity_user : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)

        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main)

        val menu = navView.menu

        //se logadado for user:
        //menu.findItem(R.id.nav_stats).isVisible = false
        //menu.findItem(R.id.nav_test).isVisible = false
        //menu.findItem(R.id.nav_tasksstatus).isVisible = false
        //menu.findItem(R.id.nav_asigntasks).isVisible = false
        //menu.findItem(R.id.nav_createtasks).isVisible = false
        //menu.findItem(R.id.nav_create_project).isVisible = false


        //se logadado for user_manager:
        //menu.findItem(R.id.nav_gallery).isVisible = false
        //menu.findItem(R.id.nav_slideshow).isVisible = false
        //menu.findItem(R.id.nav_test).isVisible = false
        //menu.findItem(R.id.nav_create_project).isVisible = false


        //se logadado for admin:
        //menu.findItem(R.id.nav_gallery).isVisible = false
        //menu.findItem(R.id.nav_slideshow).isVisible = false
        //menu.findItem(R.id.nav_tasksstatus).isVisible = false
        //menu.findItem(R.id.nav_asigntasks).isVisible = false
        //menu.findItem(R.id.nav_createtasks).isVisible = false

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow, R.id.nav_test, R.id.nav_stats, R.id.nav_create_project, R.id.nav_createtasks, R.id.nav_asigntasks, R.id.nav_tasksstatus
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_logout -> {
                    logout()
                    drawerLayout.closeDrawer(navView)
                    true
                }
                R.id.nav_EN -> {
                    setLocale("en")
                    drawerLayout.closeDrawer(navView)
                    true
                }
                R.id.nav_PT -> {
                    setLocale("pt")
                    drawerLayout.closeDrawer(navView)
                    true
                }
                else -> {
                    NavigationUI.onNavDestinationSelected(menuItem, navController)
                    drawerLayout.closeDrawer(navView)
                    true
                }
            }
        }
    }

    private fun logout() {
        val intent = Intent(this, login::class.java)
        startActivity(intent)
        finish()
    }

    private fun setLocale(languageCode: String) {
        val locale = Locale(languageCode)
        Locale.setDefault(locale)
        val config = Configuration()
        config.setLocale(locale)
        resources.updateConfiguration(config, resources.displayMetrics)

        // Restart the activity to apply the new language
        val refresh = Intent(this, MainActivity_user::class.java)
        startActivity(refresh)
        finish()
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}