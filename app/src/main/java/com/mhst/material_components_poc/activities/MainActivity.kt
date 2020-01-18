package com.mhst.material_components_poc.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.mhst.material_components_poc.R
import com.mhst.material_components_poc.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPagerAdapter = ViewPagerAdapter(this)

        vpViewPager.adapter = viewPagerAdapter

        vpViewPager.currentItem = 0

        vpViewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                when(position){
                    0 ->    bottomNavigation.selectedItemId = R.id.action_home
                    1 ->    bottomNavigation.selectedItemId = R.id.action_search
                    2 ->    bottomNavigation.selectedItemId = R.id.action_event
                    3 ->    bottomNavigation.selectedItemId = R.id.action_bookmark
                }
            }
        })

        bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.action_home -> {
                    vpViewPager.currentItem = 0
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_search -> {
                    vpViewPager.currentItem = 1
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_event -> {
                    vpViewPager.currentItem = 2
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_bookmark -> {
                    vpViewPager.currentItem = 3
                    return@setOnNavigationItemSelectedListener true
                }
                else -> {
                    vpViewPager.currentItem = 0
                    return@setOnNavigationItemSelectedListener true
                }
            }
        }

    }
}
