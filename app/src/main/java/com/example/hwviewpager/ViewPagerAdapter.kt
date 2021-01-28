package com.example.hwviewpager

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(activity: AppCompatActivity, val countries: Array<Country>) :
    FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = countries.size

    override fun createFragment(position: Int): Fragment = CountryFragment(countries[position])
}