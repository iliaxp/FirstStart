package com.iliyadev.firststart.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.iliyadev.firststart.R
import com.iliyadev.firststart.utils.PopupMenuHandler
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val navigationView = findViewById<NavigationView>(R.id.navigation_view)
        val topAppBar = findViewById<MaterialToolbar>(R.id.topAppBar)

        // باز کردن منو با کلیک روی آیکون منوی بالا
        topAppBar.setNavigationOnClickListener {
            drawerLayout.openDrawer(navigationView)
        }

        // مدیریت کلیک‌های آیتم‌های منو
        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_home -> {
                    Toast.makeText(this, "خانه انتخاب شد", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_profile -> {
                    Toast.makeText(this, "پروفایل انتخاب شد", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_settings -> {
                    Toast.makeText(this, "تنظیمات انتخاب شد", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }
}