package com.example.hwviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hwviewpager.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setPager()
    }

    private fun setPager(){
        binding.viewPager.adapter = ViewPagerAdapter(this, countries)

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = countries[position].name
        }.attach()
    }

    companion object {
        val countries = arrayOf(
            Country("Republic of the Congo", "Brazzaville", 5_380_508, 342_000),
            Country("Kiribati", "Tarawa", 117_606, 811),
            Country("Azerbaijan", "Baku", 10_047_718, 86_600),
            Country("Ukraine", "Kyiv", 43_993_638, 603_500),
            Country("Chad", "N'Djamena", 15_946_876, 1_284_000),
        )
    }
}