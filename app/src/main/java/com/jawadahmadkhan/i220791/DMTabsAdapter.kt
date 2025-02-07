package com.jawadahmadkhan.i220791

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class DMTabsAdapter(activity: DMListActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> DMFragment()  // DMs Tab
            1 -> RequestsFragment()  // Requests Tab
            else -> throw IllegalStateException("Invalid tab position")
        }
    }
}
