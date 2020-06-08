package kr.co.tjoeun.fragmenttest_20200608.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.fragmenttest_20200608.fragments.MyProfileFragment
import kr.co.tjoeun.fragmenttest_20200608.fragments.StudentListFragment

class MyAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> MyProfileFragment()
            else -> StudentListFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}