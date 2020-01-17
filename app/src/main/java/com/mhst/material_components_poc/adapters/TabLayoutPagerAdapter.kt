package com.mhst.material_components_poc.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mhst.material_components_poc.fragments.AllFragment
import com.mhst.material_components_poc.fragments.NearbyFragment
import com.mhst.material_components_poc.fragments.PopularFragment

class TabLayoutPagerAdapter(fragment : Fragment):
    FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> NearbyFragment.newInstance("place","somewhere")
            1 -> PopularFragment.newInstance("popular","place")
            2 -> AllFragment.newInstance("all","places")
            else -> NearbyFragment.newInstance("place","somewhere")
        }
    }


}