package com.iliyadev.firststart.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.iliyadev.firststart.R
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val navigationView = findViewById<NavigationView>(R.id.navigation_view)
        val topAppBar = findViewById<MaterialToolbar>(R.id.topAppBar)

        // بارگذاری Fragment Home به‌صورت پیش‌فرض
        if (savedInstanceState == null) {
            replaceFragment(HomeFragment()) // نمایش HomeFragment به عنوان صفحه اصلی
        }

        // باز کردن منو با کلیک روی آیکون منوی بالا
        topAppBar.setNavigationOnClickListener {
            drawerLayout.openDrawer(navigationView)
        }

        // مدیریت کلیک‌های آیتم‌های منو
        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_home -> replaceFragment(HomeFragment())
                R.id.nav_settings -> replaceFragment(SettingsFragment())
                R.id.nav_about -> replaceFragment(InfoFragment())
            }
            drawerLayout.closeDrawers() // بستن منو پس از کلیک روی هر آیتم
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.content_frame, fragment) // جایگزین کردن Fragment در content_frame
            .commit()
    }
}
