package com.mhst.material_components_poc.adapters
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mhst.material_components_poc.fragments.BookMarkFragment
import com.mhst.material_components_poc.fragments.EventFragment
import com.mhst.material_components_poc.fragments.HomeFragment
import com.mhst.material_components_poc.fragments.SearchFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment.newInstance("1", "2")
            1 -> SearchFragment.newInstance("3","4")
            2 -> EventFragment.newInstance("4","4")
            3 -> BookMarkFragment.newInstance("5","5")
            else -> HomeFragment.newInstance("1", "2")
        }
    }

}