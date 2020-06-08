package kr.co.tjoeun.fragmenttest_20200608.fragments

import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {


    abstract fun setupEvents()
    abstract fun setValues()

}